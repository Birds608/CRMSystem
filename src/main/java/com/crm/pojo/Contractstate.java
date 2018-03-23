package com.crm.pojo;

import java.io.Serializable;

/**
 * 合同状态表
 * 
 * @author ChzZn 2018年3月23日下午3:52:06
 */
public class Contractstate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6265092167474948663L;
	private Integer id;// id
	private String state;// 状态

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
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contractstate [id=" + id + ", state=" + state + "]";
	}

}
