package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import com.sky.annotation.AutoFill;
import com.sky.enumeration.OperationType;

import java.util.List;

@Mapper
public interface CategoryMapper {

    /**
     * 新增分类
     *
     * @param category
     * @return
     */
    @AutoFill(value = OperationType.INSERT)
    void insert(Category category);

    /**
     * 分类分页查询
     *
     * @param categoryPageQueryDTO
     * @return
     */
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 删除分类
     *
     * @param id
     * @return
     */
    void deleteById(Long id);

    /**
     * 修改分类
     *
     * @param category
     * @return
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(Category category);

    /**
     * 根据类别查询分类，并且状态为起售
     *
     * @param type  1:菜品分类 2:套餐分类
     * @return
     */
    List<Category> list(Integer type);
}
