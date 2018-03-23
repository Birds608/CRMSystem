package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 人员表
 * 
 * @author ChzZn 2018年3月23日下午2:57:41
 */
public class Admin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4188954837696100637L;
	private Integer id;// id
	private String name;// 姓名
	private String password;// 密码
	private String phone;// 电话
	private String email;// 邮箱
	private Integer age;// 年龄
	private String sex;// 性别
	private Integer permission;// 权限等级
	private String position;// 职位
	private String state;// 状态
	private Date operateTime;// 操作时间
	private String operater;// 操作人
	private Integer deptID;// 所属部门

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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the permission
	 */
	public Integer getPermission() {
		return permission;
	}

	/**
	 * @param permission
	 *            the permission to set
	 */
	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
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
	 * @return the operateTime
	 */
	public Date getOperateTime() {
		return operateTime;
	}

	/**
	 * @param operateTime
	 *            the operateTime to set
	 */
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	/**
	 * @return the operater
	 */
	public String getOperater() {
		return operater;
	}

	/**
	 * @param operater
	 *            the operater to set
	 */
	public void setOperater(String operater) {
		this.operater = operater;
	}

	/**
	 * @return the deptID
	 */
	public Integer getDeptID() {
		return deptID;
	}

	/**
	 * @param deptID
	 *            the deptID to set
	 */
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", email=" + email
				+ ", age=" + age + ", sex=" + sex + ", permission=" + permission + ", position=" + position + ", state="
				+ state + ", operateTime=" + operateTime + ", operater=" + operater + ", deptID=" + deptID + "]";
	}

}
