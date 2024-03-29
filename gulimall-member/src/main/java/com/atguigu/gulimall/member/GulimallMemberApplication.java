package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.member.dao")
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
//        try{
            SpringApplication.run(GulimallMemberApplication.class, args);
//        }catch (RuntimeException e){
//            System.out.println(e);
//        }

    }

}
