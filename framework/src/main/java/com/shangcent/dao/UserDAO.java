package com.shangcent.dao;

import com.shangcent.model.User;

public interface UserDAO {
	/**
	 * 添加新用户
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015年6月16日 下午10:52:15
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param user
	 * @return
	 */
    public int insertUser(User user);

    /**
     * 通过用户名查询用户记录
     * @author  yellow 
     * @mail    shangcent@126.com
     * @createTime 2015年6月16日 下午10:51:49
     * @website  http://www.kt56.com
     * @version  1.0
     * @since    1.0
     * @param userName
     * @return
     */
	public User findUserByName(String userName);
}
