DROP TABLE IF EXISTS `t_shop`;

CREATE TABLE `t_shop` (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_sn` varchar(20) NOT NULL COMMENT '门店编号 ',
  `user_id` varchar(11) NOT NULL COMMENT '门店所有人ID',
  `shop_name` varchar(10) DEFAULT NULL COMMENT '店铺名称',
  `shop_mobile` varchar(16) DEFAULT NULL COMMENT '店铺手机号码',
  `shop_img` varchar(150) DEFAULT NULL COMMENT '门店图标',
  `shop_tag` varchar(150) DEFAULT NULL COMMENT '门店口味标签',
  `shop_desc` varchar(255) DEFAULT NULL COMMENT '门店简介',
  `shop_address` varchar(255) DEFAULT NULL COMMENT '门店地址',
  `is_invoice` tinyint(1) NOT NULL DEFAULT '0' COMMENT '能否开发票 0，不提供；1，提供',
  `shipping_fee` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '配送费用',
  `shipping_free_fee` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '满免运费额度',
  `shipping_start_fee` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '起送标准',
  `shipping_start_time` datetime NOT NULL COMMENT '配送起始时间',
  `shipping_end_time` datetime NOT NULL COMMENT '配送结束时间',
  `shipping_least_time` varchar(11) NOT NULL COMMENT '最少配送时间',
  `service_start_time` datetime NOT NULL COMMENT '服务营业时间',
  `service_end_time` datetime NOT NULL COMMENT '服务结束时间',
  `shop_active` tinyint(1) NOT NULL DEFAULT '1' COMMENT '门店状态 0，休息中；1，营业中',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `update_by` varchar(64) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;