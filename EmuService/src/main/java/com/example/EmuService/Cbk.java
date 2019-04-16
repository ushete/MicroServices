package com.example.EmuService;

public class Cbk {
	private int id;
	private String type;
	private int amount;
	public int getId() {
		return id;
	}
	public Cbk(int id, String type, int amount) {
		this.id = id;
		this.type = type;
		this.amount = amount;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
