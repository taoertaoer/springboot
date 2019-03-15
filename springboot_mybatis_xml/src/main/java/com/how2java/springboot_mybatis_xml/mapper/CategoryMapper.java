package com.how2java.springboot_mybatis_xml.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.how2java.springboot_mybatis_xml.pojo.Category;

@Mapper
public interface CategoryMapper {
 
    List<Category> findAll();
 
}
