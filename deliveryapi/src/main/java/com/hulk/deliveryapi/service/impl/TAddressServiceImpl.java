package com.hulk.deliveryapi.service.impl;

import com.hulk.deliveryapi.dao.TAddressMapper;
import com.hulk.deliveryapi.model.TAddress;
import com.hulk.deliveryapi.service.TAddressService;
import com.hulk.deliveryapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/17.
 */
@Service
@Transactional
public class TAddressServiceImpl extends AbstractService<TAddress> implements TAddressService {
    @Resource
    private TAddressMapper tAddressMapper;

}
