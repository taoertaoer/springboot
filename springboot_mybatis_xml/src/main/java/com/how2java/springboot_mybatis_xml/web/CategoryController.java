package com.how2java.springboot_mybatis_xml.web;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.how2java.springboot_mybatis_xml.mapper.CategoryMapper;
import com.how2java.springboot_mybatis_xml.pojo.Category;
  
@Controller
public class CategoryController {
    @Autowired CategoryMapper categoryMapper;
     
    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryMapper.findAll();
         
        m.addAttribute("cs", cs);
         
        return "listCategory";
    }
     
}