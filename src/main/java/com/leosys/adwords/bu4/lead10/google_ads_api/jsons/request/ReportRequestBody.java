package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

import java.util.Set;

public class ReportRequestBody {
	
	private Set<String> fields;
	
	private Set<String> metrics;

	private String pdate;
	
	private String sdate;
	
	private String edate;
	
	private Boolean zeroImpressions;
	
	public ReportRequestBody() {
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public Set<String> getFields() {
		return fields;
	}

	public void setFields(Set<String> fields) {
		this.fields = fields;
	}

	public Set<String> getMetrics() {
		return metrics;
	}

	public void setMetrics(Set<String> metrics) {
		this.metrics = metrics;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public Boolean getZeroImpressions() {
		return zeroImpressions;
	}

	public void setZeroImpressions(Boolean zeroImpressions) {
		this.zeroImpressions = zeroImpressions;
	}
}
