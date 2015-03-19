package com.it.orm.mybatis.dao;

import java.util.List;

import com.it.common.metatype.Dto;
import com.it.orm.mybatis.mapperhelper.Mapper;
import com.it.orm.mybatis.vo.UserInfo;

public interface IUserInfoDao extends Mapper<UserInfo> {
	
	public List<Dto> queryForList();
}
