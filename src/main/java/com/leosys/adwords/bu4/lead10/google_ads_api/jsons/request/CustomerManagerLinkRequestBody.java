package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

import java.util.Set;

public class CustomerManagerLinkRequestBody {
	
	private Set<String> statuses;
	
	public CustomerManagerLinkRequestBody() {
	}

	public Set<String> getStatuses() {
			return statuses;
	}

	public void setStatuses(Set<String> statuses) {
			this.statuses = statuses;
	}
}
