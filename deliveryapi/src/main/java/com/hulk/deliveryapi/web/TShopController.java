package com.hulk.deliveryapi.web;

import com.hulk.deliveryapi.core.Result;
import com.hulk.deliveryapi.core.ResultGenerator;
import com.hulk.deliveryapi.model.TShop;
import com.hulk.deliveryapi.service.TShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/04/18.
*/
@RestController
@RequestMapping("/t/shop")
public class TShopController {
    @Resource
    private TShopService tShopService;

    @PostMapping
    @RequiresAuthentication
    public Result add(@RequestBody TShop tShop) {
        tShopService.save(tShop);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @RequiresAuthentication
    public Result delete(@PathVariable Integer id) {
        tShopService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @RequiresAuthentication
    public Result update(@RequestBody TShop tShop) {
        tShopService.update(tShop);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @RequiresAuthentication
    public Result detail(@PathVariable Integer id) {
        TShop tShop = tShopService.findById(id);
        return ResultGenerator.genSuccessResult(tShop);
    }

    @GetMapping
    @RequiresAuthentication
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TShop> list = tShopService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
