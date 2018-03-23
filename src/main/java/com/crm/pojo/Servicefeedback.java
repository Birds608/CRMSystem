package com.crm.pojo;

import java.io.Serializable;

/**
 * 服务反馈记录表
 * 
 * @author ChzZn 2018年3月23日下午4:18:29
 */
public class Servicefeedback implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -762249977231247750L;
	private Integer id;// id
	private Integer number;// 服务编号
	private String content;// 服务内容
	private String question;// 所遇问题

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
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Servicefeedback [id=" + id + ", number=" + number + ", content=" + content + ", question=" + question
				+ "]";
	}

}
