package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

import java.util.List;
import java.util.Set;

import com.leosys.adwords.bu4.lead10.jsons.request.OrderBy;

public class GeoReportRequestBody extends ReportRequestBody {
	
	private String geoTargetSegment;
	
	private Long countryCriterionId;
	
	private Set<String> statuses;
	
	private List<OrderBy> orderBys;
	
	public GeoReportRequestBody() {
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

	public Long getCountryCriterionId() {
		return countryCriterionId;
	}

	public void setCountryCriterionId(Long countryCriterionId) {
		this.countryCriterionId = countryCriterionId;
	}

	public String getGeoTargetSegment() {
		return geoTargetSegment;
	}

	public void setGeoTargetSegment(String geoTargetSegment) {
		this.geoTargetSegment = geoTargetSegment;
	}
}
