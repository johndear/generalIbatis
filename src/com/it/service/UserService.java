package com.it.service;

import java.util.List;

import com.it.common.metatype.UserInfoVo;
import com.it.common.service.BaseService;

public interface UserService extends BaseService{

	public List<UserInfoVo> getAllUsers();
	
	public List getAllUsers2();
	
	
}
