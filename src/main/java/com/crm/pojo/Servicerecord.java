package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务记录表
 * 
 * @author ChzZn 2018年3月23日下午4:22:02
 */
public class Servicerecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5699169460940009833L;
	private Integer id;// id
	private String name;// 服务名称
	private Integer serviceId;// 服务类型id
	private String state;// 状态
	private Date lastTime;// 最后操作时间
	private Integer feedbackId;// 服务反馈id

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
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
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

	/**
	 * @return the feedbackId
	 */
	public Integer getFeedbackId() {
		return feedbackId;
	}

	/**
	 * @param feedbackId
	 *            the feedbackId to set
	 */
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Servicerecord [id=" + id + ", name=" + name + ", serviceId=" + serviceId + ", state=" + state
				+ ", lastTime=" + lastTime + ", feedbackId=" + feedbackId + "]";
	}

}
