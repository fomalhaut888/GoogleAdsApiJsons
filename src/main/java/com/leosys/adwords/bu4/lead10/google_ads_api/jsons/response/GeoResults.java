package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.response;

import java.util.List;
import java.util.Map;

import com.leosys.adwords.bu4.lead10.jsons.response.IntResult;

public interface GeoResults {
	
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
	
	public static class TargetConstantResult extends IntResult{
			
			private TargetConstant targetConstant;
			
			public TargetConstantResult(int result, String description, TargetConstant targetConstant) {
					super(result, description);
					this.targetConstant = targetConstant;
			}

			public TargetConstant getTargetConstant() {
					return targetConstant;
			}
	}
	
	public static class TargetConstant{
			
			private long id;

			private String resourceName;
			
			private String canonicalName;
			
			private String name;
			
			private String countryCode;
			
			private String status;
			
			private String targetType;
			
			public TargetConstant(long id, String resourceName, String canonicalName, String name, String countryCode,
					String status, String targetType) {
					super();
					this.id = id;
					this.resourceName = resourceName;
					this.canonicalName = canonicalName;
					this.name = name;
					this.countryCode = countryCode;
					this.status = status;
					this.targetType = targetType;
			}

			public long getId() {
					return id;
			}

			public String getResourceName() {
					return resourceName;
			}

			public String getCanonicalName() {
					return canonicalName;
			}

			public String getName() {
					return name;
			}

			public String getCountryCode() {
					return countryCode;
			}

			public String getStatus() {
					return status;
			}

			public String getTargetType() {
					return targetType;
			}
	}
}
