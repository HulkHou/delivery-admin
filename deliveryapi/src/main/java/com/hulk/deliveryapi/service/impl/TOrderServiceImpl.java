package com.hulk.deliveryapi.service.impl;

import com.hulk.deliveryapi.core.AbstractService;
import com.hulk.deliveryapi.dao.TOrderMapper;
import com.hulk.deliveryapi.model.TOrder;
import com.hulk.deliveryapi.service.TOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/04/16.
 */
@Service
@Transactional
public class TOrderServiceImpl extends AbstractService<TOrder> implements TOrderService {
    @Resource
    private TOrderMapper tOrderMapper;

    @Override
    public List<TOrder> selectByUserId(String userId) {
        return this.tOrderMapper.selectByUserId(userId);
    }
}
