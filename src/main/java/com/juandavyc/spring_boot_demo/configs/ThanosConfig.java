package com.juandavyc.spring_boot_demo.configs;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties // permite configurar valores sin usar @value
@PropertySource("classpath:configs/thanos.properties") // cargo las configuraciones

public class ThanosConfig
{

}
