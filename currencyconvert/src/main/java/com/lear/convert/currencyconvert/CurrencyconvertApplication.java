package com.lear.convert.currencyconvert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.lear.convert.currencyconvert")
@EnableDiscoveryClient
public class CurrencyconvertApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconvertApplication.class, args);
	}

}
