package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.request;

import java.util.Set;

public class AdGroupConversionReportRequestBody extends ConversionReportRequestBody {
	
	private Set<String> campaignStatuses;
	
	public AdGroupConversionReportRequestBody() {
	}

	public Set<String> getCampaignStatuses() {
			return campaignStatuses;
	}

	public void setCampaignStatuses(Set<String> campaignStatuses) {
			this.campaignStatuses = campaignStatuses;
	}
}
