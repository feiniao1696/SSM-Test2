package com.jxust.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxust.ssm.dao.UserDao;
import com.jxust.ssm.pojo.User;
import com.jxust.ssm.service.UserService;
/**
 * userService 接口的实现类
 * 
 * @author Peng
 * @Date2016年12月11日上午11:50:01
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * 因为没有在spring的文件中显式的声明userService实现类，直接通过getBean得到 userService 会找不到
	 *  需要显式配置 @Service ("userService")，指定bean的名称
	 *  相当与<bean id="userService" class="com.jxust.ssm.service.impl.UserServiceImpl"></bean>
	 */
	@Resource
	private UserDao userDao;
	
	public User getUserById(Integer userid) {	
		return this.userDao.selectByPrimaryKey(userid);
	}

	@Override
	public int insert(User user) {
		return this.userDao.insert(user);
	}
}
