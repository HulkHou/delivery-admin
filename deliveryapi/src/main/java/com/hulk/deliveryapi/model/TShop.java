package com.hulk.deliveryapi.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_shop")
public class TShop {
    @Id
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 门店编号 
     */
    @Column(name = "shop_sn")
    private String shopSn;

    /**
     * 门店所有人ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 店铺名称
     */
    @Column(name = "shop_name")
    private String shopName;

    /**
     * 店铺手机号码
     */
    @Column(name = "shop_mobile")
    private String shopMobile;

    /**
     * 门店图标
     */
    @Column(name = "shop_img")
    private String shopImg;

    /**
     * 门店口味标签
     */
    @Column(name = "shop_tag")
    private String shopTag;

    /**
     * 门店简介
     */
    @Column(name = "shop_desc")
    private String shopDesc;

    /**
     * 门店地址
     */
    @Column(name = "shop_address")
    private String shopAddress;

    /**
     * 能否开发票 0，不提供；1，提供
     */
    @Column(name = "is_invoice")
    private Boolean isInvoice;

    /**
     * 配送费用
     */
    @Column(name = "shipping_fee")
    private BigDecimal shippingFee;

    /**
     * 满免运费额度
     */
    @Column(name = "shipping_free_fee")
    private BigDecimal shippingFreeFee;

    /**
     * 起送标准
     */
    @Column(name = "shipping_start_fee")
    private BigDecimal shippingStartFee;

    /**
     * 配送起始时间
     */
    @Column(name = "shipping_start_time")
    private Date shippingStartTime;

    /**
     * 配送结束时间
     */
    @Column(name = "shipping_end_time")
    private Date shippingEndTime;

    /**
     * 最少配送时间
     */
    @Column(name = "shipping_least_time")
    private String shippingLeastTime;

    /**
     * 服务营业时间
     */
    @Column(name = "service_start_time")
    private Date serviceStartTime;

    /**
     * 服务结束时间
     */
    @Column(name = "service_end_time")
    private Date serviceEndTime;

    /**
     * 门店状态 0，休息中；1，营业中
     */
    @Column(name = "shop_active")
    private Boolean shopActive;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * @return shop_id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取门店编号 
     *
     * @return shop_sn - 门店编号 
     */
    public String getShopSn() {
        return shopSn;
    }

    /**
     * 设置门店编号 
     *
     * @param shopSn 门店编号 
     */
    public void setShopSn(String shopSn) {
        this.shopSn = shopSn;
    }

    /**
     * 获取门店所有人ID
     *
     * @return user_id - 门店所有人ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置门店所有人ID
     *
     * @param userId 门店所有人ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取店铺名称
     *
     * @return shop_name - 店铺名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置店铺名称
     *
     * @param shopName 店铺名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取店铺手机号码
     *
     * @return shop_mobile - 店铺手机号码
     */
    public String getShopMobile() {
        return shopMobile;
    }

    /**
     * 设置店铺手机号码
     *
     * @param shopMobile 店铺手机号码
     */
    public void setShopMobile(String shopMobile) {
        this.shopMobile = shopMobile;
    }

    /**
     * 获取门店图标
     *
     * @return shop_img - 门店图标
     */
    public String getShopImg() {
        return shopImg;
    }

    /**
     * 设置门店图标
     *
     * @param shopImg 门店图标
     */
    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    /**
     * 获取门店口味标签
     *
     * @return shop_tag - 门店口味标签
     */
    public String getShopTag() {
        return shopTag;
    }

    /**
     * 设置门店口味标签
     *
     * @param shopTag 门店口味标签
     */
    public void setShopTag(String shopTag) {
        this.shopTag = shopTag;
    }

    /**
     * 获取门店简介
     *
     * @return shop_desc - 门店简介
     */
    public String getShopDesc() {
        return shopDesc;
    }

    /**
     * 设置门店简介
     *
     * @param shopDesc 门店简介
     */
    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    /**
     * 获取门店地址
     *
     * @return shop_address - 门店地址
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * 设置门店地址
     *
     * @param shopAddress 门店地址
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    /**
     * 获取能否开发票 0，不提供；1，提供
     *
     * @return is_invoice - 能否开发票 0，不提供；1，提供
     */
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    /**
     * 设置能否开发票 0，不提供；1，提供
     *
     * @param isInvoice 能否开发票 0，不提供；1，提供
     */
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
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
     * 获取满免运费额度
     *
     * @return shipping_free_fee - 满免运费额度
     */
    public BigDecimal getShippingFreeFee() {
        return shippingFreeFee;
    }

    /**
     * 设置满免运费额度
     *
     * @param shippingFreeFee 满免运费额度
     */
    public void setShippingFreeFee(BigDecimal shippingFreeFee) {
        this.shippingFreeFee = shippingFreeFee;
    }

    /**
     * 获取起送标准
     *
     * @return shipping_start_fee - 起送标准
     */
    public BigDecimal getShippingStartFee() {
        return shippingStartFee;
    }

    /**
     * 设置起送标准
     *
     * @param shippingStartFee 起送标准
     */
    public void setShippingStartFee(BigDecimal shippingStartFee) {
        this.shippingStartFee = shippingStartFee;
    }

    /**
     * 获取配送起始时间
     *
     * @return shipping_start_time - 配送起始时间
     */
    public Date getShippingStartTime() {
        return shippingStartTime;
    }

    /**
     * 设置配送起始时间
     *
     * @param shippingStartTime 配送起始时间
     */
    public void setShippingStartTime(Date shippingStartTime) {
        this.shippingStartTime = shippingStartTime;
    }

    /**
     * 获取配送结束时间
     *
     * @return shipping_end_time - 配送结束时间
     */
    public Date getShippingEndTime() {
        return shippingEndTime;
    }

    /**
     * 设置配送结束时间
     *
     * @param shippingEndTime 配送结束时间
     */
    public void setShippingEndTime(Date shippingEndTime) {
        this.shippingEndTime = shippingEndTime;
    }

    /**
     * 获取最少配送时间
     *
     * @return shipping_least_time - 最少配送时间
     */
    public String getShippingLeastTime() {
        return shippingLeastTime;
    }

    /**
     * 设置最少配送时间
     *
     * @param shippingLeastTime 最少配送时间
     */
    public void setShippingLeastTime(String shippingLeastTime) {
        this.shippingLeastTime = shippingLeastTime;
    }

    /**
     * 获取服务营业时间
     *
     * @return service_start_time - 服务营业时间
     */
    public Date getServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * 设置服务营业时间
     *
     * @param serviceStartTime 服务营业时间
     */
    public void setServiceStartTime(Date serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    /**
     * 获取服务结束时间
     *
     * @return service_end_time - 服务结束时间
     */
    public Date getServiceEndTime() {
        return serviceEndTime;
    }

    /**
     * 设置服务结束时间
     *
     * @param serviceEndTime 服务结束时间
     */
    public void setServiceEndTime(Date serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    /**
     * 获取门店状态 0，休息中；1，营业中
     *
     * @return shop_active - 门店状态 0，休息中；1，营业中
     */
    public Boolean getShopActive() {
        return shopActive;
    }

    /**
     * 设置门店状态 0，休息中；1，营业中
     *
     * @param shopActive 门店状态 0，休息中；1，营业中
     */
    public void setShopActive(Boolean shopActive) {
        this.shopActive = shopActive;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}