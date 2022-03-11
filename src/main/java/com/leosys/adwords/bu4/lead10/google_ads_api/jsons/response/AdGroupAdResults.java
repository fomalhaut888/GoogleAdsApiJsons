package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.response;

import java.util.List;
import java.util.Map;

import com.leosys.adwords.bu4.lead10.jsons.response.IntResult;

public interface AdGroupAdResults {
	
	public static class DisapprovedAds extends IntResult {
		
			private List<Map<String, Object>> disapprovedAds;
			
			public DisapprovedAds() {}
			
			public DisapprovedAds(int result, String description, List<Map<String, Object>> disapprovedAds) {
					super(result, description);
					this.disapprovedAds = disapprovedAds;
			}

			public List<Map<String, Object>> getDisapprovedAds() {
					return disapprovedAds;
			}
	}
	
	public static class Reports extends IntResult {
		
			private List<Map<String, Object>> performances;
			
			public Reports() {}
			
			public Reports(int result, String description, List<Map<String, Object>> performances) {
					super(result, description);
					this.performances = performances;
			}

			public List<Map<String, Object>> getPerformances() {
					return performances;
			}
	}
}
