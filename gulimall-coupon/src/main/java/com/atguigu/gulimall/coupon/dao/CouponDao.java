package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zlq
 * @email 632728133@qq.com
 * @date 2020-09-19 22:28:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
