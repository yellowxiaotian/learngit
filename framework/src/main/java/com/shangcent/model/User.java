package com.shangcent.model;
/**
 * �û���
 * @author yellow
 *
 */
public class User extends BaseModel{
	private static final long serialVersionUID = -118945865662326433L;
	 
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * ��ɫ����
	 */
	private String roleId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
