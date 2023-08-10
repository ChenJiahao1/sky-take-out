package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {
    /**
     * 新增套餐
     *
     * @param setmealDTO
     * @return
     */
    void save(SetmealDTO setmealDTO);

    /**
     * 套餐分页查询
     *
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 删除套餐
     *
     * @param ids
     */
    void deleteByIds(List<Long> ids);

    /**
     * 根据id查询套餐
     *
     * @param id
     * @return
     */
    SetmealVO getById(Long id);

    /**
     * 修改套餐
     *
     * @param setmealDTO
     * @return
     */
    void update(SetmealDTO setmealDTO);

    /**
     * 修改套餐起售停售状态
     *
     * @param status
     * @param id
     * @return
     */
    void startOrStop(Integer status, Long id);

    /**
     * 条件查询, categoryId && status == ENABLE
     *
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     *
     * @param id
     * @return
     */
    List<DishItemVO> getDishItemById(Long id);
}
