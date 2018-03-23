package com.crm.pojo;

import java.io.Serializable;

/**
 * 关怀方案表
 * 
 * @author ChzZn 2018年3月23日下午3:17:56
 */
public class Carescheme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4021963070562787253L;
	private Integer id;// id
	private Integer careNum;// 关怀方案编号
	private String content;// 内容
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
	 * @return the careNum
	 */
	public Integer getCareNum() {
		return careNum;
	}

	/**
	 * @param careNum
	 *            the careNum to set
	 */
	public void setCareNum(Integer careNum) {
		this.careNum = careNum;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
		return "Carescheme [id=" + id + ", careNum=" + careNum + ", content=" + content + ", type=" + type + "]";
	}

}
