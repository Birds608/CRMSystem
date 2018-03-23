package com.crm.pojo;

import java.io.Serializable;

/**
 * 计划表
 * 
 * @author ChzZn 2018年3月23日下午4:10:35
 */
public class Scheme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6401861149054874477L;
	private Integer id;// id
	private Integer writerId;// 计划指定人id
	private Integer executer;// 计划执行人
	private Double income;// 计划收益金额
	private String cycle;// 计划周期

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
	 * @return the writerId
	 */
	public Integer getWriterId() {
		return writerId;
	}

	/**
	 * @param writerId
	 *            the writerId to set
	 */
	public void setWriterId(Integer writerId) {
		this.writerId = writerId;
	}

	/**
	 * @return the executer
	 */
	public Integer getExecuter() {
		return executer;
	}

	/**
	 * @param executer
	 *            the executer to set
	 */
	public void setExecuter(Integer executer) {
		this.executer = executer;
	}

	/**
	 * @return the income
	 */
	public Double getIncome() {
		return income;
	}

	/**
	 * @param income
	 *            the income to set
	 */
	public void setIncome(Double income) {
		this.income = income;
	}

	/**
	 * @return the cycle
	 */
	public String getCycle() {
		return cycle;
	}

	/**
	 * @param cycle
	 *            the cycle to set
	 */
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Scheme [id=" + id + ", writerId=" + writerId + ", executer=" + executer + ", income=" + income
				+ ", cycle=" + cycle + "]";
	}

}
