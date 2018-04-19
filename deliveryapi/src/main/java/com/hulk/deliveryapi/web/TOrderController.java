package com.hulk.deliveryapi.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hulk.deliveryapi.core.Result;
import com.hulk.deliveryapi.core.ResultGenerator;
import com.hulk.deliveryapi.core.ServiceException;
import com.hulk.deliveryapi.model.SysUser;
import com.hulk.deliveryapi.model.TOrder;
import com.hulk.deliveryapi.service.SysUserService;
import com.hulk.deliveryapi.service.TOrderService;
import com.hulk.deliveryapi.shiro.JWTUtil;
import com.hulk.deliveryapi.shiro.ShiroKit;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/04/16.
 */
@RestController
@RequestMapping("/t/order")
public class TOrderController {
    @Resource
    private TOrderService tOrderService;

    @Resource
    private SysUserService sysUserService;

    @PostMapping
    public Result add(@RequestBody TOrder tOrder) {
        tOrderService.save(tOrder);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        tOrderService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TOrder tOrder) {
        tOrderService.update(tOrder);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TOrder tOrder = tOrderService.findById(id);
        return ResultGenerator.genSuccessResult(tOrder);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        String token = (String) ShiroKit.getSubject().getPrincipal();
        if (StringUtils.isBlank(token)) {
            throw new ServiceException("token失效");
        }
        String phone = JWTUtil.getPhone(token);
        SysUser sysUser = sysUserService.findBy("phone", phone);

        String userId = sysUser.getId().toString();

        PageHelper.startPage(page, size);

        List<TOrder> list = tOrderService.selectByUserId(userId);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
