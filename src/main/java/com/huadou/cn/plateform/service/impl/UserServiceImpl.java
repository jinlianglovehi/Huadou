package com.huadou.cn.plateform.service.impl;

import javax.annotation.Resource;

import com.huadou.cn.plateform.dao.IUserDao;
import com.huadou.cn.plateform.pojo.User;
import com.huadou.cn.plateform.service.IUserService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
