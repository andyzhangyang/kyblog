package com.zhang.common.config.mybatisplus;/*
  @Desc
  @Author 张阳
  @date 2020-7-11 21:17
*/

import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

public class MybatisPlusConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer scannerConfigurer =new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage("com.zhang.blog.com.common.mapper*");
        return scannerConfigurer;
    }
    /*
     *
     * @Description mbp分页插件
     * @Param []
     * @author 张阳
     * @date 2020-7-11 21:24
     * @return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

    public H2KeyGenerator getH2KEyGenerator(){
        return new  H2KeyGenerator();
    }
}
