package com.how2java.springboot.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.how2java.springboot.pojo.Category;
import com.how2java.springboot.service.CategoryService;
import com.how2java.springboot.util.Page4Navigator;
  
@Controller
//@RestController
public class CategoryController {
    /*@Autowired CategoryDAO categoryService;*/
	@Autowired CategoryService categoryService;
    
	@GetMapping("/categories")
    public String listCategory(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page4Navigator<Category> page =categoryService.list(pageable);
        m.addAttribute("page", page);
        return "listCategory";
    }
 
	@PostMapping("/categories")
    public String addCategory(Category c) throws Exception {
        categoryService.save(c);
        return "redirect:/categories";
    }
    
    @PutMapping("/categories/{id}")
    public String updateCategory(Category c) throws Exception {
        categoryService.save(c);
        return "redirect:/categories";
    }
    /*@GetMapping("/category")
    public List<Category> listCategory(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page<Category> page =categoryService.findAll(pageable);
        return page.getContent();
    }
     
    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable("id") int id) throws Exception {
        Category c= categoryService.getOne(id);
        System.out.println(c);
        return c;
    }
    @PutMapping("/category")
    public void addCategory(@RequestBody Category category) throws Exception {
        System.out.println("springboot接受到浏览器以JSON格式提交的数据："+category);
    }*/
    
   /* @GetMapping("/categories")
    public String listCategory(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page<Category> page =categoryService.findAll(pageable);
        m.addAttribute("page", page);
        return "listCategory";
    }
 
    @PostMapping("/categories")
    public String addCategory(Category c) throws Exception {
        categoryService.save(c);
        return "redirect:/categories";
    }
    @PutMapping("/categories/{id}")
    public String updateCategory(Category c) throws Exception {
        categoryService.save(c);
        return "redirect:/categories";
    }
    */
    @DeleteMapping("/categories/{id}")
    public String deleteCategory(Category c) throws Exception {
    	categoryService.delete(c.getId());
    	return "redirect:/categories";
    }
    @GetMapping("/categories/{id}")
    public String getCategory(@PathVariable("id") int id,Model m) throws Exception {
        Category c= categoryService.get(id);
        m.addAttribute("c", c);
        return "editCategory";
    }
}