package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

import java.util.List;
import java.util.Set;

import com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request.ReportRequestBody;
import com.leosys.adwords.bu4.lead10.jsons.request.OrderBy;

public class AdGroupReportRequestBody extends ReportRequestBody {
	
	private Set<String> statuses;
	
	private Set<String> campaignStatuses;
	
	private List<OrderBy> orderBys;
	
	public AdGroupReportRequestBody() {
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

	public Set<String> getCampaignStatuses() {
		return campaignStatuses;
	}

	public void setCampaignStatuses(Set<String> campaignStatuses) {
		this.campaignStatuses = campaignStatuses;
	}
}
