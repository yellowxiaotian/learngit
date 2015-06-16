package com.shangcent.service;
import com.shangcent.model.User;
/**
 * 
 * UserService���������û�����ҵ���
 * 
 * @project framework 
 * @package com.shangcent.service
 * @author  yellow 
 * @mail    shangcent@126.com
 * @createTime 2015��6��16�� ����10:40:31
 * @website  http://www.kt56.com
 * @version  1.0
 * @since    1.0
 */
public interface UserService {
	/**
	 * 
	 * ����������   �����û���¼
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015��6��16�� ����10:49:22
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param user
	 * @return
	 */
    public int insertUser(User user);

    /**
     * 
     * ����������   ͨ���û�����ѯ�û���¼
     * @author  yellow 
     * @mail    shangcent@126.com
     * @createTime 2015��6��16�� ����10:49:50
     * @website  http://www.kt56.com
     * @version  1.0
     * @since    1.0
     * @param string
     * @return
     */
	public User findUserByName(String userName);
}
