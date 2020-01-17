package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

import java.util.List;

import com.leosys.adwords.bu4.lead10.jsons.request.OrderBy;

public class CustomerClientRequestBody{
	
	private boolean descendantsShown = false;
	
	private Boolean hidden;
	
	private Boolean testAccount;
	
	private Boolean manager;
	
	private Integer level;
	
	private List<OrderBy> orderBys;
	
	public CustomerClientRequestBody() {
	}

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Boolean getTestAccount() {
		return testAccount;
	}

	public void setTestAccount(Boolean testAccount) {
		this.testAccount = testAccount;
	}

	public Boolean getManager() {
		return manager;
	}

	public void setManager(Boolean manager) {
		this.manager = manager;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<OrderBy> getOrderBys() {
		return orderBys;
	}

	public void setOrderBys(List<OrderBy> orderBys) {
		this.orderBys = orderBys;
	}

	public boolean isDescendantsShown() {
		return descendantsShown;
	}

	public void setDescendantsShown(boolean descendantsShown) {
		this.descendantsShown = descendantsShown;
	}
}