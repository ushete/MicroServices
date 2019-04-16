package com.us.microservice.DwhService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WareHController {

	@Autowired
	private Environment env;

	@GetMapping("/txs/{p}/{arnum}")
	public TxDetail getTxDetails(@PathVariable String p, @PathVariable String arnum) {
		return new TxDetail(p, arnum, "AUTH123", "CLEAR123", env.getProperty("local.server.port",Integer.class));
	}
}
