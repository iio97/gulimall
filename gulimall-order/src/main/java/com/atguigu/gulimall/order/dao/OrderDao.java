package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zlq
 * @email 632728133@qq.com
 * @date 2020-09-19 22:42:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
