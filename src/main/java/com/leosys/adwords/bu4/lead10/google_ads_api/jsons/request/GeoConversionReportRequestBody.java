package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

public class GeoConversionReportRequestBody extends ConversionReportRequestBody {
	
	private String geoTargetSegment;
	
	private Long countryCriterionId;
	
	public GeoConversionReportRequestBody() {
	}

	public String getGeoTargetSegment() {
		return geoTargetSegment;
	}

	public void setGeoTargetSegment(String geoTargetSegment) {
		this.geoTargetSegment = geoTargetSegment;
	}

	public Long getCountryCriterionId() {
		return countryCriterionId;
	}

	public void setCountryCriterionId(Long countryCriterionId) {
		this.countryCriterionId = countryCriterionId;
	}
}
