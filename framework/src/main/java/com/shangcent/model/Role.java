package com.shangcent.model;

/**
 * 
 * Role的描述：
 * 
 * @project framework 
 * @package com.shangcent.model
 * @author  yellow 
 * @mail    shangcent@126.com
 * @createTime 2015年6月17日 上午6:37:28
 * @website  http://www.kt56.com
 * @version  1.0
 * @since    1.0
 */
public class Role extends BaseModel {
	private static final long serialVersionUID = -118945865662326433L;
 
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 角色描述
	 */
	private String roleDesc;
	/**
	 * 权限编码集
	 */
	private String permissionIds;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(String permissionIds) {
		this.permissionIds = permissionIds;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

}
