package com.leosys.adwords.bu4.lead10.jsons.google_ads_api.response;

import java.util.List;
import java.util.Map;

import com.leosys.adwords.bu4.lead10.jsons.response.IntResult;

public interface AdGroupResults {
	
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
