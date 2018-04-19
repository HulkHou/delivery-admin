package com.hulk.deliveryapi.model;

import javax.persistence.*;

@Table(name = "t_address")
public class TAddress {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "address_id")
    private Integer addressId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 地址标签
     */
    @Column(name = "address_tag")
    private String addressTag;

    /**
     * 是否默认地址 0-不默认 1-默认
     */
    @Column(name = "is_default")
    private Integer isDefault;

    /**
     * 收货人姓名
     */
    private String consignee;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 街道地址
     */
    private String street;

    /**
     * 大楼名称
     */
    @Column(name = "build_name")
    private String buildName;

    /**
     * 门牌号
     */
    @Column(name = "unit_no")
    private String unitNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取主键ID
     *
     * @return address_id - 主键ID
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 设置主键ID
     *
     * @param addressId 主键ID
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取地址标签
     *
     * @return address_tag - 地址标签
     */
    public String getAddressTag() {
        return addressTag;
    }

    /**
     * 设置地址标签
     *
     * @param addressTag 地址标签
     */
    public void setAddressTag(String addressTag) {
        this.addressTag = addressTag;
    }

    /**
     * 获取是否默认地址 0-不默认 1-默认
     *
     * @return is_default - 是否默认地址 0-不默认 1-默认
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认地址 0-不默认 1-默认
     *
     * @param isDefault 是否默认地址 0-不默认 1-默认
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取收货人姓名
     *
     * @return consignee - 收货人姓名
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人姓名
     *
     * @param consignee 收货人姓名
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取收货人电话
     *
     * @return phone - 收货人电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置收货人电话
     *
     * @param phone 收货人电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取街道地址
     *
     * @return street - 街道地址
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道地址
     *
     * @param street 街道地址
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获取大楼名称
     *
     * @return build_name - 大楼名称
     */
    public String getBuildName() {
        return buildName;
    }

    /**
     * 设置大楼名称
     *
     * @param buildName 大楼名称
     */
    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    /**
     * 获取门牌号
     *
     * @return unit_no - 门牌号
     */
    public String getUnitNo() {
        return unitNo;
    }

    /**
     * 设置门牌号
     *
     * @param unitNo 门牌号
     */
    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}