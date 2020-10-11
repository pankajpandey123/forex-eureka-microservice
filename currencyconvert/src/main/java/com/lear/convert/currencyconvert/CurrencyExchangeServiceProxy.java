package com.lear.convert.currencyconvert;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RibbonClient(name="forexservice")
@FeignClient(name="forexservice")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("curexchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
