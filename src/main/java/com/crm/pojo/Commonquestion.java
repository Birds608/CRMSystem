package com.crm.pojo;

import java.io.Serializable;

/**
 * 常见问题表
 * 
 * @author ChzZn 2018年3月23日下午3:42:45
 */
public class Commonquestion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1568737812432218596L;
	private Integer id;// id
	private String description;// 问题描述
	private String questionType;// 问题类型
	private String solution;// 解决方案

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the questionType
	 */
	public String getQuestionType() {
		return questionType;
	}

	/**
	 * @param questionType
	 *            the questionType to set
	 */
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	/**
	 * @return the solution
	 */
	public String getSolution() {
		return solution;
	}

	/**
	 * @param solution
	 *            the solution to set
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commonquestion [id=" + id + ", description=" + description + ", questionType=" + questionType
				+ ", solution=" + solution + "]";
	}

}
