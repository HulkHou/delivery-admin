/*Table structure for table `t_collect` */

DROP TABLE IF EXISTS `t_collect`;
CREATE TABLE `t_collect` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(64) NOT NULL COMMENT '用户编号',
  `collect_type` int(11) DEFAULT NULL COMMENT '类型 1-shop 2-food',
  `collect_item` varchar(64) NOT NULL COMMENT '收藏内容ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='用户收藏表';