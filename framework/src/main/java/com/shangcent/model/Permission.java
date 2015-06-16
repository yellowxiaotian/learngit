package com.shangcent.model;

/**
 * 
 * Permission的描述：
 * 
 * @project framework 
 * @package com.shangcent.model
 * @author  yellow 
 * @mail    shangcent@126.com
 * @createTime 2015年6月17日 上午6:39:16
 * @website  http://www.kt56.com
 * @version  1.0
 * @since    1.0
 */
public class Permission extends BaseModel {
	private static final long serialVersionUID = -118945865662326433L;

	/**
	 * 权限名词
	 */
	private String permissionName;
	/**
	 * 权限描述
	 */
	private String permissionDesc;

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionDesc() {
		return permissionDesc;
	}

	public void setPermissionDesc(String permissionDesc) {
		this.permissionDesc = permissionDesc;
	}

}
