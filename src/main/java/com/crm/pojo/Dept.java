package com.crm.pojo;

import java.io.Serializable;

/**
 * 部门表
 * 
 * @author ChzZn 2018年3月23日下午3:56:09
 */
public class Dept implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4424725447220924661L;
	private Integer id;// id
	private String deptName;// 部门名称
	private String coment;// 备注
	private Integer peopleNum;// 人数

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
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the coment
	 */
	public String getComent() {
		return coment;
	}

	/**
	 * @param coment
	 *            the coment to set
	 */
	public void setComent(String coment) {
		this.coment = coment;
	}

	/**
	 * @return the peopleNum
	 */
	public Integer getPeopleNum() {
		return peopleNum;
	}

	/**
	 * @param peopleNum
	 *            the peopleNum to set
	 */
	public void setPeopleNum(Integer peopleNum) {
		this.peopleNum = peopleNum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", coment=" + coment + ", peopleNum=" + peopleNum + "]";
	}

}
