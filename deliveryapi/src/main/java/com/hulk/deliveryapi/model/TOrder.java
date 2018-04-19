package com.hulk.deliveryapi.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "t_order")
public class TOrder {
    /**
     * 订单信息表自增id
     */
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 用户id，同t_user的id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 店家id，同t_shop的id
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 订单状态。0，待店铺确认；1，店铺确认；2，外卖已送出；3，已送达；4，取消；5，完成；
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 地址id，同t_address的id
     */
    @Column(name = "address_id")
    private Integer addressId;

    /**
     * 订单附言，由用户提交订单前填写
     */
    private String postscript;

    /**
     * 0，不提供；1，提供
     */
    @Column(name = "is_invoice")
    private Boolean isInvoice;

    /**
     * 商品总金额
     */
    @Column(name = "goods_amount")
    private BigDecimal goodsAmount;

    /**
     * 配送费用
     */
    @Column(name = "shipping_fee")
    private BigDecimal shippingFee;

    /**
     * 应付款金额
     */
    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 订单生成时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 订单确认时间
     */
    @Column(name = "confirm_time")
    private String confirmTime;

    /**
     * 订单配送时间
     */
    @Column(name = "shipping_time")
    private String shippingTime;

    private String shopName;

    private String shopMobile;

    private String consignee;

    /**
     * 获取订单信息表自增id
     *
     * @return order_id - 订单信息表自增id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单信息表自增id
     *
     * @param orderId 订单信息表自增id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单号
     *
     * @return order_sn - 订单号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单号
     *
     * @param orderSn 订单号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 获取用户id，同t_user的id
     *
     * @return user_id - 用户id，同t_user的id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id，同t_user的id
     *
     * @param userId 用户id，同t_user的id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取店家id，同t_shop的id
     *
     * @return shop_id - 店家id，同t_shop的id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置店家id，同t_shop的id
     *
     * @param shopId 店家id，同t_shop的id
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取订单状态。0，待店铺确认；1，店铺确认；2，外卖已送出；3，已送达；4，取消；5，完成；
     *
     * @return order_status - 订单状态。0，待店铺确认；1，店铺确认；2，外卖已送出；3，已送达；4，取消；5，完成；
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态。0，待店铺确认；1，店铺确认；2，外卖已送出；3，已送达；4，取消；5，完成；
     *
     * @param orderStatus 订单状态。0，待店铺确认；1，店铺确认；2，外卖已送出；3，已送达；4，取消；5，完成；
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取地址id，同t_address的id
     *
     * @return address_id - 地址id，同t_address的id
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 设置地址id，同t_address的id
     *
     * @param addressId 地址id，同t_address的id
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取订单附言，由用户提交订单前填写
     *
     * @return postscript - 订单附言，由用户提交订单前填写
     */
    public String getPostscript() {
        return postscript;
    }

    /**
     * 设置订单附言，由用户提交订单前填写
     *
     * @param postscript 订单附言，由用户提交订单前填写
     */
    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    /**
     * 获取0，不提供；1，提供
     *
     * @return is_invoice - 0，不提供；1，提供
     */
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    /**
     * 设置0，不提供；1，提供
     *
     * @param isInvoice 0，不提供；1，提供
     */
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * 获取商品总金额
     *
     * @return goods_amount - 商品总金额
     */
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    /**
     * 设置商品总金额
     *
     * @param goodsAmount 商品总金额
     */
    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    /**
     * 获取配送费用
     *
     * @return shipping_fee - 配送费用
     */
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    /**
     * 设置配送费用
     *
     * @param shippingFee 配送费用
     */
    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    /**
     * 获取应付款金额
     *
     * @return order_amount - 应付款金额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置应付款金额
     *
     * @param orderAmount 应付款金额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取订单生成时间
     *
     * @return create_time - 订单生成时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单生成时间
     *
     * @param createTime 订单生成时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取订单确认时间
     *
     * @return confirm_time - 订单确认时间
     */
    public String getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置订单确认时间
     *
     * @param confirmTime 订单确认时间
     */
    public void setConfirmTime(String confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取订单配送时间
     *
     * @return shipping_time - 订单配送时间
     */
    public String getShippingTime() {
        return shippingTime;
    }

    /**
     * 设置订单配送时间
     *
     * @param shippingTime 订单配送时间
     */
    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopMobile() {
        return shopMobile;
    }

    public void setShopMobile(String shopMobile) {
        this.shopMobile = shopMobile;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
}