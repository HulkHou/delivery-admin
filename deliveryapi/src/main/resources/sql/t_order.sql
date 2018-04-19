DROP TABLE IF EXISTS `t_order`;

CREATE TABLE IF NOT EXISTS `t_order` (
`order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单信息表自增id',
`order_sn` varchar(20) NOT NULL COMMENT '订单号',
`user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户id，同t_user的id',
`shop_id` int(11) NOT NULL DEFAULT '0' COMMENT '店家id，同t_shop的id',
`order_status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '订单状态。0，待店铺确认；1，店铺确认；2，外卖已送出；3，已送达；4，取消；5，完成；',
`address_id` int(11) NOT NULL DEFAULT '0' COMMENT '地址id，同t_address的id',
`postscript` varchar(255) DEFAULT NULL COMMENT '订单附言，由用户提交订单前填写',
`is_invoice` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0，不提供；1，提供',
`goods_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '商品总金额',
`shipping_fee` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '配送费用',
`order_amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '应付款金额',
`create_time` datetime NOT NULL COMMENT '订单生成时间',
`confirm_time` datetime NOT NULL COMMENT '订单确认时间',
`shipping_time` datetime NOT NULL COMMENT '订单配送时间',
PRIMARY KEY (`order_id`),
UNIQUE KEY `order_sn` (`order_sn`),
KEY `user_id` (`user_id`),
KEY `order_status` (`order_status`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='订单信息表';