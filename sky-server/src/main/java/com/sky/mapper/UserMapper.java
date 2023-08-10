package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;

@Mapper
public interface UserMapper {
    /**
     * 根据openid查询用户
     *
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 新增用户user
     *
     * @param user
     */
    void insert(User user);

    /**
     * 根据主键id查询用户
     *
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User getById(Long id);

    /**
     * 根据时间统计用户数量
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    Integer getUserCount(LocalDateTime beginTime, LocalDateTime endTime);
}
