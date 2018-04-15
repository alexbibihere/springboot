package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: yan
 * @Date: 2018/4/16/0016 2:37
 * @Description:
 */
@Repository
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id=#{id}")
    User getUserById(int id);
}
