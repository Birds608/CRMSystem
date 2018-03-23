package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 反馈表
 * 
 * @author ChzZn 2018年3月23日下午3:56:39
 */
public class Feedback implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5398225360868594324L;
	private Integer id;// id
	private Integer clientId;// 客户id
	private Date investigationTime;// 调查时间
	private String qualitySatisfaction;// 质量满意度
	private String serviceSatisfaction;// 服务满意度
	private String totalSatisfaction;// 总体满意度

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
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the investigationTime
	 */
	public Date getInvestigationTime() {
		return investigationTime;
	}

	/**
	 * @param investigationTime
	 *            the investigationTime to set
	 */
	public void setInvestigationTime(Date investigationTime) {
		this.investigationTime = investigationTime;
	}

	/**
	 * @return the qualitySatisfaction
	 */
	public String getQualitySatisfaction() {
		return qualitySatisfaction;
	}

	/**
	 * @param qualitySatisfaction
	 *            the qualitySatisfaction to set
	 */
	public void setQualitySatisfaction(String qualitySatisfaction) {
		this.qualitySatisfaction = qualitySatisfaction;
	}

	/**
	 * @return the serviceSatisfaction
	 */
	public String getServiceSatisfaction() {
		return serviceSatisfaction;
	}

	/**
	 * @param serviceSatisfaction
	 *            the serviceSatisfaction to set
	 */
	public void setServiceSatisfaction(String serviceSatisfaction) {
		this.serviceSatisfaction = serviceSatisfaction;
	}

	/**
	 * @return the totalSatisfaction
	 */
	public String getTotalSatisfaction() {
		return totalSatisfaction;
	}

	/**
	 * @param totalSatisfaction
	 *            the totalSatisfaction to set
	 */
	public void setTotalSatisfaction(String totalSatisfaction) {
		this.totalSatisfaction = totalSatisfaction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", clientId=" + clientId + ", investigationTime=" + investigationTime
				+ ", qualitySatisfaction=" + qualitySatisfaction + ", serviceSatisfaction=" + serviceSatisfaction
				+ ", totalSatisfaction=" + totalSatisfaction + "]";
	}

}
