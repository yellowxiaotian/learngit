package com.shangcent.service;
import com.shangcent.model.User;
/**
 * 
 * UserService的描述：用户管理业务层
 * 
 * @project framework 
 * @package com.shangcent.service
 * @author  yellow 
 * @mail    shangcent@126.com
 * @createTime 2015年6月16日 下午10:40:31
 * @website  http://www.kt56.com
 * @version  1.0
 * @since    1.0
 */
public interface UserService {
	/**
	 * 
	 * 方法描述：   插入用户记录
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015年6月16日 下午10:49:22
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param user
	 * @return
	 */
    public int insertUser(User user);

    /**
     * 
     * 方法描述：   通过用户名查询用户记录
     * @author  yellow 
     * @mail    shangcent@126.com
     * @createTime 2015年6月16日 下午10:49:50
     * @website  http://www.kt56.com
     * @version  1.0
     * @since    1.0
     * @param string
     * @return
     */
	public User findUserByName(String userName);
}
