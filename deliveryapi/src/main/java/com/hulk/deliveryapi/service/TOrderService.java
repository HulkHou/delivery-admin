package com.hulk.deliveryapi.service;

import com.hulk.deliveryapi.core.Service;
import com.hulk.deliveryapi.model.TOrder;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/04/16.
 */
public interface TOrderService extends Service<TOrder> {

    List<TOrder> selectByUserId(String userId);
}
