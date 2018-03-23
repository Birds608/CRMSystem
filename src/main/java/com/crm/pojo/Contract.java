package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 合同表
 * 
 * @author ChzZn 2018年3月23日下午3:46:45
 */
public class Contract implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3675004497192549461L;
	private Integer id;// id
	private Integer number;// 合同编号
	private String name;// 合同名称
	private String state;// 合同状态
	private String chargeMan;// 负责人
	private String partA;// 甲方
	private Date lastTime;// 最后操作时间

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
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the chargeMan
	 */
	public String getChargeMan() {
		return chargeMan;
	}

	/**
	 * @param chargeMan
	 *            the chargeMan to set
	 */
	public void setChargeMan(String chargeMan) {
		this.chargeMan = chargeMan;
	}

	/**
	 * @return the partA
	 */
	public String getPartA() {
		return partA;
	}

	/**
	 * @param partA
	 *            the partA to set
	 */
	public void setPartA(String partA) {
		this.partA = partA;
	}

	/**
	 * @return the lastTime
	 */
	public Date getLastTime() {
		return lastTime;
	}

	/**
	 * @param lastTime
	 *            the lastTime to set
	 */
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contract [id=" + id + ", number=" + number + ", name=" + name + ", state=" + state + ", chargeMan="
				+ chargeMan + ", partA=" + partA + ", lastTime=" + lastTime + "]";
	}

}
