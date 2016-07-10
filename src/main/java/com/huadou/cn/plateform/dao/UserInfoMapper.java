package com.huadou.cn.plateform.dao;

import com.huadou.cn.plateform.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by jinliang on 16/6/30.
 */
public interface UserInfoMapper {

    @Select(" select * from user_info ")
    List<User> getAllUser();





}
