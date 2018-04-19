package com.hulk.deliveryapi.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hulk.deliveryapi.core.Result;
import com.hulk.deliveryapi.core.ResultGenerator;
import com.hulk.deliveryapi.core.ServiceException;
import com.hulk.deliveryapi.model.SysUser;
import com.hulk.deliveryapi.model.TAddress;
import com.hulk.deliveryapi.service.SysUserService;
import com.hulk.deliveryapi.service.TAddressService;
import com.hulk.deliveryapi.shiro.JWTUtil;
import com.hulk.deliveryapi.shiro.ShiroKit;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/03/26.
 */
@RestController
@RequestMapping("/t/address")
public class TAddressController {
    @Resource
    private TAddressService tAddressService;

    @Resource
    private SysUserService sysUserService;

    @PostMapping
    @RequiresAuthentication
    public Result add(@RequestBody TAddress tAddress) {
        tAddressService.save(tAddress);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @RequiresAuthentication
    public Result delete(@PathVariable Integer id) {
        tAddressService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @RequiresAuthentication
    public Result update(@RequestBody TAddress tAddress) {
        tAddressService.update(tAddress);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @RequiresAuthentication
    public Result detail(@PathVariable Integer id) {
        TAddress tAddress = tAddressService.findById(id);
        return ResultGenerator.genSuccessResult(tAddress);
    }

    @GetMapping
    @RequiresAuthentication
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {

        String token = (String) ShiroKit.getSubject().getPrincipal();
        if (StringUtils.isBlank(token)) {
            throw new ServiceException("token失效");
        }
        String phone = JWTUtil.getPhone(token);
        SysUser sysUser = sysUserService.findBy("phone", phone);

        String userId = sysUser.getId().toString();

        //构造查询条件，根据userId进行查询
        Condition condition = new Condition(TAddress.class);
        condition.createCriteria().andCondition("user_id = '" + userId + "'");
        condition.setOrderByClause("address_id desc");

        PageHelper.startPage(page, size);
        List<TAddress> list = tAddressService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
