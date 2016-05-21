-- 数据库初始化脚本--

--创建数据库
CREATE DATABASE springBatch;
--使用数据库
use springBatch;
--创建秒杀库存表
CREATE TABLE `batch`(
  `batch_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR(120) NOT NULL COMMENT '名称',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  PRIMARY KEY (batch_id),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='跑批表';

--初始化数据
  INSERT INTO
    batch (name)
  VALUES
    ('第一个跑批'),('第二个跑批');



