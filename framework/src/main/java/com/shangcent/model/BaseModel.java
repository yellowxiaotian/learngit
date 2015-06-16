package com.shangcent.model;

import java.io.Serializable;
/**
 * 
 * BaseModel的描述：
 * 
 * @project framework 
 * @package com.shangcent.model
 * @author  yellow 
 * @mail    shangcent@126.com
 * @createTime 2015年6月17日 上午6:38:40
 * @website  http://www.kt56.com
 * @version  1.0
 * @since    1.0
 */
public class BaseModel implements Serializable{
	private static final long serialVersionUID = 2605688330240035604L;
	/**
	 * 主键自增长ID
	 */
	private int id;
	/**
	 * UUID
	 */
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
