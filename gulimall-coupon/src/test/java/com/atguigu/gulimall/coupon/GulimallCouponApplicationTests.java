package com.atguigu.gulimall.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testCpuCount(){
		//to test how many cpus are there in my laptop
		System.out.println("cpu count is===>"+Runtime.getRuntime().availableProcessors());
	}

}
