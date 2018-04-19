package com.hulk.deliveryapi.service.impl;

import com.hulk.deliveryapi.dao.TShopMapper;
import com.hulk.deliveryapi.model.TShop;
import com.hulk.deliveryapi.service.TShopService;
import com.hulk.deliveryapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/18.
 */
@Service
@Transactional
public class TShopServiceImpl extends AbstractService<TShop> implements TShopService {
    @Resource
    private TShopMapper tShopMapper;

}
