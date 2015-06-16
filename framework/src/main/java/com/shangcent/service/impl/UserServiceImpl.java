package com.shangcent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangcent.dao.UserDAO;
import com.shangcent.model.User;
import com.shangcent.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDAO userDAO;
	
	/**
	 * 
	 * 方法描述：插入用户记录
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015年6月16日 下午10:50:47
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param user
	 * @return
	 * @see com.shangcent.service.UserService#insertUser(com.shangcent.model.User)
	 */
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}

	/**
	 * 
	 * 方法描述：   通过用户名查询用户记录
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015年6月16日 下午10:51:00
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param userName
	 * @return
	 * @see com.shangcent.service.UserService#findUserByName(java.lang.String)
	 */
	public User findUserByName(String userName) {
		return userDAO.findUserByName(userName);
	}

}
