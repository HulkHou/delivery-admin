package com.hulk.deliveryapi.dao;

import com.hulk.deliveryapi.core.Mapper;
import com.hulk.deliveryapi.model.TOrder;

import java.util.List;

public interface TOrderMapper extends Mapper<TOrder> {
    List<TOrder> selectByUserId(String userId);
}