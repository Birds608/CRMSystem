package com.crm.pojo;

import java.io.Serializable;

/**
 * 订单类型表
 * 
 * @author ChzZn 2018年3月23日下午4:08:53
 */
public class Ordertype implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5876347163632333773L;
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
		return "Ordertype [id=" + id + ", type=" + type + "]";
	}

}
