package com.stylefeng.guns.modular.address.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.Address;
import com.stylefeng.guns.modular.address.service.IAddressService;

/**
 * 地址管理控制器
 *
 * @author fengshuonan
 * @Date 2018-03-26 10:07:57
 */
@Controller
@RequestMapping("/address")
public class AddressController extends BaseController {

    private String PREFIX = "/address/address/";

    @Autowired
    private IAddressService addressService;

    /**
     * 跳转到地址管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "address.html";
    }

    /**
     * 跳转到添加地址管理
     */
    @RequestMapping("/address_add")
    public String addressAdd() {
        return PREFIX + "address_add.html";
    }

    /**
     * 跳转到修改地址管理
     */
    @RequestMapping("/address_update/{addressId}")
    public String addressUpdate(@PathVariable Integer addressId, Model model) {
        Address address = addressService.selectById(addressId);
        model.addAttribute("item",address);
        LogObjectHolder.me().set(address);
        return PREFIX + "address_edit.html";
    }

    /**
     * 获取地址管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return addressService.selectList(null);
    }

    /**
     * 新增地址管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(Address address) {
        addressService.insert(address);
        return SUCCESS_TIP;
    }

    /**
     * 删除地址管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer addressId) {
        addressService.deleteById(addressId);
        return SUCCESS_TIP;
    }

    /**
     * 修改地址管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Address address) {
        addressService.updateById(address);
        return SUCCESS_TIP;
    }

    /**
     * 地址管理详情
     */
    @RequestMapping(value = "/detail/{addressId}")
    @ResponseBody
    public Object detail(@PathVariable("addressId") Integer addressId) {
        return addressService.selectById(addressId);
    }
}
