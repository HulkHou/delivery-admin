package com.hulk.deliveryapi.web;

import com.hulk.deliveryapi.core.Result;
import com.hulk.deliveryapi.core.ResultGenerator;
import com.hulk.deliveryapi.model.TCollect;
import com.hulk.deliveryapi.service.TCollectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/03/26.
*/
@RestController
@RequestMapping("/t/collect")
public class TCollectController {
    @Resource
    private TCollectService tCollectService;

    @PostMapping
    public Result add(@RequestBody TCollect tCollect) {
        tCollectService.save(tCollect);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        tCollectService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TCollect tCollect) {
        tCollectService.update(tCollect);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TCollect tCollect = tCollectService.findById(id);
        return ResultGenerator.genSuccessResult(tCollect);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TCollect> list = tCollectService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
