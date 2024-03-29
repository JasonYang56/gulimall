package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "gulimall-coupon")
public interface MemberCouponService {
    @GetMapping("/coupon/coupon/memberCoupons")
    public R memberCoupons();
}
