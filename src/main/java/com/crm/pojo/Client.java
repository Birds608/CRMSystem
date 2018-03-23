package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户表
 * 
 * @author ChzZn 2018年3月23日下午3:26:44
 */
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3451439734681271605L;
	private Integer id;// id
	private String contact;// 联系人
	private String contactTel;// 联系电话
	private String company;// 公司
	private String comAddress;// 公司地址
	private String companyTel;// 公司电话
	private Date birth;// 出生日期
	private String email;// 邮箱
	private String comment;// 备注
	private String clientType;// 客服类型
	private Double consumption;// 消费金额
	private Integer consumeTime;// 消费次数
	private String represent;// 服务代表
	private String distribution;// 分配状态

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
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the contactTel
	 */
	public String getContactTel() {
		return contactTel;
	}

	/**
	 * @param contactTel
	 *            the contactTel to set
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the comAddress
	 */
	public String getComAddress() {
		return comAddress;
	}

	/**
	 * @param comAddress
	 *            the comAddress to set
	 */
	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}

	/**
	 * @return the companyTel
	 */
	public String getCompanyTel() {
		return companyTel;
	}

	/**
	 * @param companyTel
	 *            the companyTel to set
	 */
	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * @param birth
	 *            the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the clientType
	 */
	public String getClientType() {
		return clientType;
	}

	/**
	 * @param clientType
	 *            the clientType to set
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	/**
	 * @return the consumption
	 */
	public Double getConsumption() {
		return consumption;
	}

	/**
	 * @param consumption
	 *            the consumption to set
	 */
	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}

	/**
	 * @return the consumeTime
	 */
	public Integer getConsumeTime() {
		return consumeTime;
	}

	/**
	 * @param consumeTime
	 *            the consumeTime to set
	 */
	public void setConsumeTime(Integer consumeTime) {
		this.consumeTime = consumeTime;
	}

	/**
	 * @return the represent
	 */
	public String getRepresent() {
		return represent;
	}

	/**
	 * @param represent
	 *            the represent to set
	 */
	public void setRepresent(String represent) {
		this.represent = represent;
	}

	/**
	 * @return the distribution
	 */
	public String getDistribution() {
		return distribution;
	}

	/**
	 * @param distribution
	 *            the distribution to set
	 */
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", contact=" + contact + ", contactTel=" + contactTel + ", company=" + company
				+ ", comAddress=" + comAddress + ", companyTel=" + companyTel + ", birth=" + birth + ", email=" + email
				+ ", comment=" + comment + ", clientType=" + clientType + ", consumption=" + consumption
				+ ", consumeTime=" + consumeTime + ", represent=" + represent + ", distribution=" + distribution + "]";
	}

}
