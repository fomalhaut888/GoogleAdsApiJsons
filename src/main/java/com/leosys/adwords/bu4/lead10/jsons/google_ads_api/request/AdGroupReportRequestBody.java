package com.leosys.adwords.bu4.lead10.jsons.google_ads_api.request;

import java.util.List;
import java.util.Set;

import com.leosys.adwords.bu4.lead10.jsons.google_ads_api.request.ReportRequestBody;
import com.leosys.adwords.bu4.lead10.jsons.request.OrderBy;

public class AdGroupReportRequestBody extends ReportRequestBody {
	
	private Set<String> statuses;
	
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
}
