package com.leosys.adwords.bu4.lead10.jsons.google_ads_api.request.campaign;

import java.util.List;
import java.util.Set;

import com.leosys.adwords.bu4.lead10.jsons.google_ads_api.request.ReportRequestBody;
import com.leosys.adwords.bu4.lead10.jsons.request.OrderBy;

public class CampaignReportRequestBody extends ReportRequestBody {
	
	private String name;
	
	private Set<String> statuses;
	
	private List<OrderBy> orderBys;
	
	public CampaignReportRequestBody() {
	}

	public Set<String> getStatuses() {
		return statuses;
	}

	public void setStatuses(Set<String> statuses) {
		this.statuses = statuses;
	}

	public List<OrderBy> getOrderBys() {
		return orderBys;
	}

	public void setOrderBys(List<OrderBy> orderBys) {
		this.orderBys = orderBys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
