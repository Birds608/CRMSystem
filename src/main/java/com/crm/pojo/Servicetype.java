package com.crm.pojo;

import java.io.Serializable;

/**
 * 服务类型表
 * 
 * @author ChzZn 2018年3月23日下午4:28:41
 */
public class Servicetype implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8266620013814032168L;
	private Integer id;// id
	private String type;// 类型

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Servicetype [id=" + id + ", type=" + type + "]";
	}

}
