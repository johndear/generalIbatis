package com.it.orm.ibatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.it.common.dao.impl.DaoImpl;
import com.it.orm.ibatis.dao.IMenuDao;

@Repository(value="menuDao")
public class MenuDaoImpl extends DaoImpl implements IMenuDao {

}
