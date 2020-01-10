package com.leosys.adwords.bu4.lead10.jsons.request;

public class OrderBy{
	
	private String field;
	
	private Boolean desc = false;
	
	public OrderBy() {
	}
	
	public OrderBy(String field, Boolean desc) {
			this.field = field;
			this.desc = desc;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Boolean getDesc() {
		return desc;
	}

	public void setDesc(Boolean desc) {
		this.desc = desc;
	}
}