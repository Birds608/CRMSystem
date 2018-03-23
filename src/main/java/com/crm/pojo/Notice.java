package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 公告表
 * 
 * @author ChzZn 2018年3月23日下午4:00:04
 */
public class Notice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3958531884341269424L;
	private Integer id;// id
	private String title;// 公告标题
	private Date publishTime;// 发布时间
	private String publisher;// 发布人
	private String content;// 公告内容

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the publishTime
	 */
	public Date getPublishTime() {
		return publishTime;
	}

	/**
	 * @param publishTime
	 *            the publishTime to set
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", publishTime=" + publishTime + ", publisher=" + publisher
				+ ", content=" + content + "]";
	}

}
