package com.shangcent.dao;

import com.shangcent.model.User;

public interface UserDAO {
	/**
	 * ������û�
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015��6��16�� ����10:52:15
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param user
	 * @return
	 */
    public int insertUser(User user);

    /**
     * ͨ���û�����ѯ�û���¼
     * @author  yellow 
     * @mail    shangcent@126.com
     * @createTime 2015��6��16�� ����10:51:49
     * @website  http://www.kt56.com
     * @version  1.0
     * @since    1.0
     * @param userName
     * @return
     */
	public User findUserByName(String userName);
}
