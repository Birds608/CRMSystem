package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表
 * 
 * @author ChzZn 2018年3月23日下午4:02:24
 */
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3739850099307828586L;
	private Integer id;// id
	private Integer typeId;// 订单类型id
	private String goods;// 商品
	private String receiver;// 收货人
	private Double orderMoney;// 订单金额
	private Date orderTime;// 下单时间
	private String orderState;// 订单状态
	private String address;// 收货地址
	private Integer adminId;// 负责人id

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
	 * @return the typeId
	 */
	public Integer getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId
	 *            the typeId to set
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return the goods
	 */
	public String getGoods() {
		return goods;
	}

	/**
	 * @param goods
	 *            the goods to set
	 */
	public void setGoods(String goods) {
		this.goods = goods;
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver
	 *            the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the orderMoney
	 */
	public Double getOrderMoney() {
		return orderMoney;
	}

	/**
	 * @param orderMoney
	 *            the orderMoney to set
	 */
	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}

	/**
	 * @return the orderTime
	 */
	public Date getOrderTime() {
		return orderTime;
	}

	/**
	 * @param orderTime
	 *            the orderTime to set
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the orderState
	 */
	public String getOrderState() {
		return orderState;
	}

	/**
	 * @param orderState
	 *            the orderState to set
	 */
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [id=" + id + ", typeId=" + typeId + ", goods=" + goods + ", receiver=" + receiver
				+ ", orderMoney=" + orderMoney + ", orderTime=" + orderTime + ", orderState=" + orderState
				+ ", address=" + address + ", adminId=" + adminId + "]";
	}

}
