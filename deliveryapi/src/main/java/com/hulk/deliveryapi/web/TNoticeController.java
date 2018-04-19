package com.hulk.deliveryapi.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hulk.deliveryapi.core.Result;
import com.hulk.deliveryapi.core.ResultGenerator;
import com.hulk.deliveryapi.model.TNotice;
import com.hulk.deliveryapi.service.TNoticeService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/03/26.
 */
@RestController
@RequestMapping("/t/notice")
public class TNoticeController {
    @Resource
    private TNoticeService tNoticeService;

    @PostMapping
    @RequiresAuthentication
    public Result add(@RequestBody TNotice tNotice) {
        tNoticeService.save(tNotice);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @RequiresAuthentication
    public Result delete(@PathVariable Integer id) {
        tNoticeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @RequiresAuthentication
    public Result update(@RequestBody TNotice tNotice) {
        tNoticeService.update(tNotice);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @RequiresAuthentication
    public Result detail(@PathVariable Integer id) {
        TNotice tNotice = tNoticeService.findById(id);
        return ResultGenerator.genSuccessResult(tNotice);
    }

    @GetMapping
    @RequiresAuthentication
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TNotice> list = tNoticeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
