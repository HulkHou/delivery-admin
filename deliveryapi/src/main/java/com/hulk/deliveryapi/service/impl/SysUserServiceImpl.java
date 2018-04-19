package com.hulk.deliveryapi.service.impl;

import com.hulk.deliveryapi.dao.SysUserMapper;
import com.hulk.deliveryapi.model.SysUser;
import com.hulk.deliveryapi.service.SysUserService;
import com.hulk.deliveryapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/12.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

}
