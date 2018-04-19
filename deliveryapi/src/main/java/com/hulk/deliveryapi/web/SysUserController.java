package com.hulk.deliveryapi.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hulk.deliveryapi.core.Result;
import com.hulk.deliveryapi.core.ResultGenerator;
import com.hulk.deliveryapi.core.ServiceException;
import com.hulk.deliveryapi.model.SysUser;
import com.hulk.deliveryapi.service.SysUserService;
import com.hulk.deliveryapi.shiro.JWTUtil;
import com.hulk.deliveryapi.shiro.ShiroKit;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/03/12.
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;


    /**
     * 新增用户
     *
     * @param sysUser
     * @return
     */
    @PostMapping
    public Result add(@RequestBody SysUser sysUser) {

        String phone = sysUser.getPhone().trim();

        // 判断账号是否重复
        SysUser theUser = sysUserService.findBy("phone", phone);
        if (theUser != null) {
            throw new ServiceException("该用户已经注册");
        }

        // 完善账号信息
        //手机号同时为管理后台账号
        sysUser.setAccount(phone);
        sysUser.setPhone(phone);
        //6为app前台用户
        sysUser.setRoleid("6");
        //状态1为启用
        sysUser.setStatus(1);
        sysUser.setName("");
        sysUser.setSalt(ShiroKit.getRandomSalt(5));
        sysUser.setPassword(ShiroKit.md5(sysUser.getPassword(), sysUser.getSalt()));
        sysUser.setCreatetime(new Date());

        sysUserService.save(sysUser);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除用户
     *
     * @param phone
     * @return
     */
    @DeleteMapping("/{phone}")
    @RequiresAuthentication
    public Result delete(@PathVariable String phone) {
        SysUser sysUser = sysUserService.findBy("phone", phone);
        sysUserService.deleteById(sysUser.getId());
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 更新用户
     *
     * @param sysUser
     * @return
     */
    @PutMapping
    @RequiresAuthentication
    public Result update(@RequestBody SysUser sysUser) {
        sysUserService.update(sysUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{phone}")
    public Result detail(@PathVariable String phone) {
        SysUser sysUser = sysUserService.findBy("phone", phone);
        return ResultGenerator.genSuccessResult(sysUser);
    }

    @GetMapping
    @RequiresAuthentication
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysUser> list = sysUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    /**
     * 登录
     *
     * @param phone
     * @param password
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestParam("phone") String phone,
                        @RequestParam("password") String password) {
        phone = phone.trim();
        SysUser sysUser = sysUserService.findBy("phone", phone);
        if (sysUser == null) {
            throw new ServiceException("Phone or password error");
        }
        //盐（用户名+随机数）
        String salt = sysUser.getSalt();
        //原密码
        String encodedPassword = ShiroKit.md5(password, salt);
        if (sysUser.getPassword().equals(encodedPassword)) {
            return ResultGenerator.genSuccessResult(JWTUtil.sign(phone, encodedPassword));
        } else {
            throw new ServiceException("Phone or password error");
        }
    }

    /**
     * 登录
     *
     * @param phone
     * @return
     */
    @PostMapping("/loginByCode")
    public Result login(@RequestParam("phone") String phone) {
        phone = phone.trim();
        SysUser sysUser = sysUserService.findBy("phone", phone);
        if (sysUser == null) {
            throw new ServiceException("Phone or password error");
        }
        String encodedPassword = sysUser.getPassword();
        return ResultGenerator.genSuccessResult(JWTUtil.sign(phone, encodedPassword));
    }

    /**
     * 修改当前用户的密码
     */
    @PostMapping("/changePwd")
    @RequiresAuthentication
    public Object changePwd(@RequestParam String oldPwd, @RequestParam String newPwd, @RequestParam String rePwd) {
        if (!newPwd.equals(rePwd)) {
            throw new ServiceException("两次输入密码不一致");
        }

        String token = (String) ShiroKit.getSubject().getPrincipal();
        if (StringUtils.isBlank(token)) {
            throw new ServiceException("token失效");
        }
        String phone = JWTUtil.getPhone(token);
        SysUser sysUser = sysUserService.findBy("phone", phone);
        String oldMd5 = ShiroKit.md5(oldPwd, sysUser.getSalt());
        if (sysUser.getPassword().equals(oldMd5)) {
            String newMd5 = ShiroKit.md5(newPwd, sysUser.getSalt());
            sysUser.setPassword(newMd5);
            this.sysUserService.update(sysUser);
            return ResultGenerator.genSuccessResult(JWTUtil.sign(phone, newMd5));
        } else {
            throw new ServiceException("原密码不正确");
        }
    }

    /**
     * 重置当前用户的密码
     */
    @PostMapping("/resetPwd")
    @RequiresAuthentication
    public Object resetPwd(@RequestParam String newPwd, @RequestParam String rePwd) {
        if (!newPwd.equals(rePwd)) {
            throw new ServiceException("两次输入密码不一致");
        }

        String token = (String) ShiroKit.getSubject().getPrincipal();
        if (StringUtils.isBlank(token)) {
            throw new ServiceException("token失效");
        }
        String phone = JWTUtil.getPhone(token);
        SysUser sysUser = sysUserService.findBy("phone", phone);

        String newMd5 = ShiroKit.md5(newPwd, sysUser.getSalt());
        sysUser.setPassword(newMd5);
        this.sysUserService.update(sysUser);
        return ResultGenerator.genSuccessResult(JWTUtil.sign(phone, newMd5));

    }


}
