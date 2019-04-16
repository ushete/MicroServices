package com.example.EmuService;

import java.util.ArrayList;
import java.util.List;

public class TxDetail {
	private String p;
	private String arnum;
	private String authId;
	private String clearId;
	private int port;
	private String claimId;
	private List<Cbk> cbkList = new ArrayList<>();
	
	public TxDetail() {		
	}
	
	public TxDetail(String p, String arnum, String authId, String clearId, int port) {
		this.p = p;
		this.arnum = arnum;
		this.authId = authId;
		this.clearId = clearId;		
		this.setPort(port);
	}
	
	public String getP() {
		return p;
	}
	public String getArnum() {
		return arnum;
	}
	public String getAuthId() {
		return authId;
	}
	public String getClearId() {
		return clearId;
	}
	public void setP(String p) {
		this.p = p;
	}
	public void setArnum(String arnum) {
		this.arnum = arnum;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public void setClearId(String clearId) {
		this.clearId = clearId;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public List<Cbk> getCbkList() {
		return cbkList;
	}

	public void setCbkList(List<Cbk> cbkList) {
		this.cbkList = cbkList;
	}
	
	
}


