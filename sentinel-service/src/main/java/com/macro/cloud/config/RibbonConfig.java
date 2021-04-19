package com.macro.cloud.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @SentinelRestTemplate包装RestTemplate
 * Sentinel 支持对服务间调用进行保护，对故障应用进行熔断操作，这里我们使用RestTemplate来调用nacos-user-service服务所提供的接口
 */
@Configuration
public class RibbonConfig {

    /**
     * 使用@SentinelRestTemplate来包装下RestTemplate实例
     * @return
     */
    @Bean
    @SentinelRestTemplate
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
