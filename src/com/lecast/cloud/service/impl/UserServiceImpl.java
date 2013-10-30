package com.lecast.cloud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.lecast.cloud.entity.User;
import com.lecast.cloud.service.UserService;
import com.lecast.cloud.service.mapper.UserServiceMapper;

@Service("userService")
public class UserServiceImpl implements UserService{

	public static Logger log = Logger.getLogger(UserServiceImpl.class);
	
	@Resource
	UserServiceMapper userDao;

	@Override
	public boolean getLoginValidate(User bean) {
		String userName = bean.getUserName();
		String userPassword = bean.getUserPassword();
		String sql = "from User user where user.delFlg = 'N'" +
						" and user.userName = '" + userName + "' and user.userPassword = '" + userPassword + "'";
		List<User> userList = userDao.getUserBySql(sql);
		if( userList != null && userList.size() > 0){
			return true;
		}
		return false;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	//,rollbackFor=Exception.class
	public void registerUser(User bean) {
		
		userDao.getOne();
		log.debug("insert.....");
		userDao.saveEntity(bean);
		log.debug("save.....");
		userDao.saveEntity(bean);
//		//int i = 0/0;
//		if(1==1){
//			
//			throw new RuntimeException("ssss");
//			
//		}
//		bean.setDelFlg('N');
//		userDao.updateEntity(bean);
	}
	
}
