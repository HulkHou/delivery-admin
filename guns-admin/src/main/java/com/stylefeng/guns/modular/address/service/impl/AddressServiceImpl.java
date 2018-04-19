package com.stylefeng.guns.modular.address.service.impl;

import com.stylefeng.guns.modular.system.model.Address;
import com.stylefeng.guns.modular.system.dao.AddressMapper;
import com.stylefeng.guns.modular.address.service.IAddressService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地址表 服务实现类
 * </p>
 *
 * @author hulk123
 * @since 2018-03-26
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
