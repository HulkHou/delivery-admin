package com.hulk.deliveryapi.service.impl;

import com.hulk.deliveryapi.dao.TNoticeMapper;
import com.hulk.deliveryapi.model.TNotice;
import com.hulk.deliveryapi.service.TNoticeService;
import com.hulk.deliveryapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/26.
 */
@Service
@Transactional
public class TNoticeServiceImpl extends AbstractService<TNotice> implements TNoticeService {
    @Resource
    private TNoticeMapper tNoticeMapper;

}
