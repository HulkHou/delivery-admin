package com.stylefeng.guns.modular.system.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 地址表
 * </p>
 *
 * @author hulk123
 * @since 2018-03-26
 */
@TableName("t_address")
public class Address extends Model<Address> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户编号
     */
    @TableField("user_id")
    private String userId;
    /**
     * 地址标签
     */
    @TableField("address_tag")
    private String addressTag;
    /**
     * 是否默认地址
     */
    @TableField("is_default")
    private Integer isDefault;
    /**
     * 收货人姓名
     */
    private String consignee;
    /**
     * 街道地址
     */
    private String street;
    /**
     * 大楼名称
     */
    @TableField("build_name")
    private String buildName;
    /**
     * 门牌号
     */
    @TableField("unit_no")
    private String unitNo;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddressTag() {
        return addressTag;
    }

    public void setAddressTag(String addressTag) {
        this.addressTag = addressTag;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Address{" +
        "id=" + id +
        ", userId=" + userId +
        ", addressTag=" + addressTag +
        ", isDefault=" + isDefault +
        ", consignee=" + consignee +
        ", street=" + street +
        ", buildName=" + buildName +
        ", unitNo=" + unitNo +
        ", remark=" + remark +
        "}";
    }
}
