package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author JasonYang
 * @email 339197878@qq.com
 * @date 2023-04-27 18:13:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
