package com.lecast.cloud.service;

import com.lecast.cloud.entity.User;

public interface UserService {

	/**
	 * 验证登录用户
	 * @param bean
	 * @return
	 */
	public boolean getLoginValidate(User bean);

	/**
	 * 注册用户
	 * @param bean
	 */
	public void registerUser(User bean);
}
