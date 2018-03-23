package com.crm.pojo;

import java.io.Serializable;

/**
 * 绩效表
 * 
 * @author ChzZn 2018年3月23日下午2:51:36
 */
public class Achievement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7827714320527162276L;
	private Integer id;// 序列号
	private Integer adminId;// 员工id
	private Integer deptId;// 部门id
	private Double tradingAmount;// 成交总金额
	private Double monthAmount;// 当月金额

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
	 * @return the adminId
	 */
	public Integer getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId
	 *            the adminId to set
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the deptId
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 *            the deptId to set
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the tradingAmount
	 */
	public Double getTradingAmount() {
		return tradingAmount;
	}

	/**
	 * @param tradingAmount
	 *            the tradingAmount to set
	 */
	public void setTradingAmount(Double tradingAmount) {
		this.tradingAmount = tradingAmount;
	}

	/**
	 * @return the monthAmount
	 */
	public Double getMonthAmount() {
		return monthAmount;
	}

	/**
	 * @param monthAmount
	 *            the monthAmount to set
	 */
	public void setMonthAmount(Double monthAmount) {
		this.monthAmount = monthAmount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Achievement [id=" + id + ", adminId=" + adminId + ", deptId=" + deptId + ", tradingAmount="
				+ tradingAmount + ", monthAmount=" + monthAmount + "]";
	}

}
