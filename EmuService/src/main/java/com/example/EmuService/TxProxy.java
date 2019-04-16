package com.example.EmuService;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="DwhService", url="http://localhost:8091")
@FeignClient(name="DwhService")
@RibbonClient(name="DwhService")
public interface TxProxy {
	@GetMapping("/txs/{p}/{arnum}")
	public TxDetail getTxDetails(@PathVariable(name="p") String p, @PathVariable(name="arnum") String arnum);
	
}
