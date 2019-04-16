package com.example.EmuService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmuController {
	@Autowired
	private TxProxy proxy;
	private RestTemplate template = new RestTemplate();

	@GetMapping("/cbks/{p}/{arnum}/{clmId}")
	public TxDetail getTxDetails(@PathVariable String p, @PathVariable String arnum, @PathVariable String clmId) {
		Map<String, String> params = new HashMap<>();
		params.put("p", p);
		params.put("arnum", arnum);
		TxDetail tx = template.getForObject("http://localhost:8091/txs/{p}/{arnum}", TxDetail.class, params);
		tx.setClaimId(clmId);
		tx.getCbkList().add(new Cbk(1, "First Cbk", 100));
		tx.getCbkList().add(new Cbk(2, "Representment", 200));
		return tx;
	}
	
	@GetMapping("/cbksFeign/{p}/{arnum}/{clmId}")
	public TxDetail getTxDetailsFeign(@PathVariable String p, @PathVariable String arnum, @PathVariable String clmId) {
		
		TxDetail tx = proxy.getTxDetails(p, arnum); 
				
				//template.getForObject("http://localhost:8091/txs/{p}/{arnum}", TxDetail.class, params);
		tx.setClaimId(clmId);
		tx.getCbkList().add(new Cbk(1, "First Cbk", 100));
		tx.getCbkList().add(new Cbk(2, "Representment", 200));
		return tx;
	}
}
