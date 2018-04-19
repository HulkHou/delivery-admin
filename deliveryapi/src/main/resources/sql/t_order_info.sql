DROP TABLE IF EXISTS `t_order_info`;

CREATE TABLE IF NOT EXISTS `t_order_info` (
`order_info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单详细信息自增id',
`order_id` int(11) NOT NULL DEFAULT '0' COMMENT '订单信息表id，同t_order的id',
`food_id` int(11) NOT NULL DEFAULT '0' COMMENT '菜品id，同t_food的id',
`food_number` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '菜品数量',
PRIMARY KEY (`order_info_id`),
UNIQUE KEY `order_id` (`order_id`),
KEY `food_id` (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='订单详细信息表';