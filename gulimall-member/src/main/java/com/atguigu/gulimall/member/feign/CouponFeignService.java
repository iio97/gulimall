package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  远程调用的接口
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {


  /*
      声明式远程调用
   */
  @RequestMapping("/coupon/coupon/member/list")
  R membercoupons();

}
