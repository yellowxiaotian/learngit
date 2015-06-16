package com.shangcent.dao;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.shangcent.model.User;
import com.shangcent.service.UserService;
/**
 * 
 * MyShiroRealm的描述：
 * 
 * @project framework 
 * @package com.shangcent.dao
 * @author  yellow 
 * @mail    shangcent@126.com
 * @createTime 2015年6月17日 上午6:38:05
 * @website  http://www.kt56.com
 * @version  1.0
 * @since    1.0
 */
public class MyShiroRealm extends AuthorizingRealm{
	//logger����
	private Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);
	//ע���û�ҵ���
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * 
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015年6月17日 上午6:38:01
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param principals
	 * @return
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * 
	 * @author  yellow 
	 * @mail    shangcent@126.com
	 * @createTime 2015年6月17日 上午6:37:49
	 * @website  http://www.kt56.com
	 * @version  1.0
	 * @since    1.0
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		User user = userService.findUserByName(token.getPrincipal().toString());
		if( null==user ){
			throw new UnknownAccountException();
		}else{
			return new SimpleAuthenticationInfo(user, user.getPassword(), user.getUserName());
		}
	}
	
}
