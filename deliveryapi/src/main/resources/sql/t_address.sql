/*Table structure for table `t_address` */

DROP TABLE IF EXISTS `t_address`;

CREATE TABLE `t_address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` varchar(11) NOT NULL COMMENT '用户编号',
  `address_tag` varchar(30) DEFAULT NULL COMMENT '地址标签',
  `is_default` int(1) NOT NULL DEFAULT '0' COMMENT '是否默认地址 0-不默认 1-默认',
  `consignee` varchar(30) DEFAULT NULL COMMENT '收货人姓名',
  `phone` varchar(16) DEFAULT NULL COMMENT '收货人电话',
  `street` varchar(255) DEFAULT NULL COMMENT '街道地址',
  `build_name` varchar(30) DEFAULT NULL COMMENT '大楼名称',
  `unit_no` varchar(30) DEFAULT NULL COMMENT '门牌号',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='地址表';