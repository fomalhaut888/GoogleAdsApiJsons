package com.leosys.adwords.bu4.lead10.jsons.response;

public class IntResult {
	
	private int result;
	
	private String description;
	
	public IntResult() {
	}

	public IntResult(int result, String description) {
			this.result = result;
			this.description = description;
	}

	public int getResult() {
			return result;
	}

	public String getDescription() {
			return description;
	}
}
