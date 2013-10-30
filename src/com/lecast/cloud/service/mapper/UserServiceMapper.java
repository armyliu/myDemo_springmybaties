package com.lecast.cloud.service.mapper;

import java.util.List;

import com.lecast.cloud.entity.User;

public interface UserServiceMapper {

	public List<User> getUserBySql(String sql);

	public void saveEntity(User bean) ;

	public void updateEntity(User bean) ;

	public void getOne();
}
