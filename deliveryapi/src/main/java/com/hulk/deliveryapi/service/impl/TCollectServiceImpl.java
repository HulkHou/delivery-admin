package com.hulk.deliveryapi.service.impl;

import com.hulk.deliveryapi.dao.TCollectMapper;
import com.hulk.deliveryapi.model.TCollect;
import com.hulk.deliveryapi.service.TCollectService;
import com.hulk.deliveryapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/26.
 */
@Service
@Transactional
public class TCollectServiceImpl extends AbstractService<TCollect> implements TCollectService {
    @Resource
    private TCollectMapper tCollectMapper;

}
