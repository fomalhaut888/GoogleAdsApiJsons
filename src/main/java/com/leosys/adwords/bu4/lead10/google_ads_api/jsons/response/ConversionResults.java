package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.response;

import java.util.List;

import com.leosys.adwords.bu4.lead10.jsons.response.IntResult;

public interface ConversionResults {
	
	public static class ActionNames extends IntResult{
		
			private List<ConversionActionName> conversionActionNames;
			
			public ActionNames() {}
	
			public ActionNames(int result, String description, 
					List<ConversionActionName> conversionActionNames) {
					super(result, description);
					this.conversionActionNames = conversionActionNames;
			}

			public List<ConversionActionName> getConversionActionNames() {
					return conversionActionNames;
			}

			public void setConversionActionNames(List<ConversionActionName> conversionActionNames) {
					this.conversionActionNames = conversionActionNames;
			}	
	}
	
	public static class GeoActionNames extends IntResult{
		
			private List<GeoConversionActionName> geoConversionActionNames;
			
			public GeoActionNames() {}
	
			public GeoActionNames(int result, String description, 
					List<GeoConversionActionName> geoConversionActionNames) {
					super(result, description);
					this.geoConversionActionNames = geoConversionActionNames;
			}

			public List<GeoConversionActionName> getGeoConversionActionNames() {
				return geoConversionActionNames;
			}

			public void setGeoConversionActionNames(List<GeoConversionActionName> geoConversionActionNames) {
				this.geoConversionActionNames = geoConversionActionNames;
			}
	}
	
	public static class UserLocationActionNames extends IntResult{
		
			private List<UserLocationConversionActionName> userLocationConversionActionNames;
			
			public UserLocationActionNames() {}
	
			public UserLocationActionNames(int result, String description, 
					List<UserLocationConversionActionName> userLocationConversionActionNames) {
					super(result, description);
					this.userLocationConversionActionNames = userLocationConversionActionNames;
			}

			public List<UserLocationConversionActionName> getUserLocationConversionActionNames() {
				return userLocationConversionActionNames;
			}

			public void setUserLocationConversionActionNames(
					List<UserLocationConversionActionName> userLocationConversionActionNames) {
				this.userLocationConversionActionNames = userLocationConversionActionNames;
			}
	}
	
	public static class UserLocationConversionActionName extends ConversionActionName{
		
			private long countryCriterionId;
			
			private boolean targetingLocation;
			
			private GeoTarget geoTarget;
			
			public UserLocationConversionActionName() {
					super();
			}
			
			public UserLocationConversionActionName(String conversionActionName, 
					double conversions, double allConversions, long countryCriterionId, 
					boolean targetingLocation, GeoTarget geoTarget) {
					super(conversionActionName, conversions, allConversions);
					this.countryCriterionId = countryCriterionId;
					this.targetingLocation = targetingLocation;
					this.geoTarget = geoTarget;
			}
	
			public long getCountryCriterionId() {
					return countryCriterionId;
			}
	
			public void setCountryCriterionId(long countryCriterionId) {
					this.countryCriterionId = countryCriterionId;
			}
			
			public GeoTarget getGeoTarget() {
					return geoTarget;
			}
	
			public void setGeoTarget(GeoTarget geoTarget) {
					this.geoTarget = geoTarget;
			}
			
			public boolean isTargetingLocation() {
					return targetingLocation;
			}

			public void setTargetingLocation(boolean targetingLocation) {
					this.targetingLocation = targetingLocation;
			}
			
			public static class GeoTarget{
				
					private String name;
					
					private String value;
					
					public GeoTarget() {
					}
					
					public GeoTarget(String name, String value) {
							this.name = name;
							this.value = value;
					}
	
					public String getName() {
						return name;
					}
	
					public void setName(String name) {
						this.name = name;
					}
	
					public String getValue() {
						return value;
					}
	
					public void setValue(String value) {
						this.value = value;
					}
			}
	}
	
	public static class GeoConversionActionName extends ConversionActionName{
			
			private long countryCriterionId;
			
			private String locationType;
			
			private GeoTarget geoTarget;
			
			public GeoConversionActionName() {
					super();
			}
			
			public GeoConversionActionName(String conversionActionName, 
					double conversions, double allConversions, long countryCriterionId, 
					String locationType, GeoTarget geoTarget) {
					super(conversionActionName, conversions, allConversions);
					this.countryCriterionId = countryCriterionId;
					this.locationType = locationType;
					this.geoTarget = geoTarget;
			}

			public long getCountryCriterionId() {
					return countryCriterionId;
			}

			public void setCountryCriterionId(long countryCriterionId) {
					this.countryCriterionId = countryCriterionId;
			}
			
			public GeoTarget getGeoTarget() {
					return geoTarget;
			}

			public void setGeoTarget(GeoTarget geoTarget) {
					this.geoTarget = geoTarget;
			}
			
			public String getLocationType() {
					return locationType;
			}

			public void setLocationType(String locationType) {
					this.locationType = locationType;
			}
			
			public static class GeoTarget{
				
					private String name;
					
					private String value;
					
					public GeoTarget() {
					}
					
					public GeoTarget(String name, String value) {
							this.name = name;
							this.value = value;
					}

					public String getName() {
						return name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getValue() {
						return value;
					}

					public void setValue(String value) {
						this.value = value;
					}
			}
	}
	
	public static class ConversionActionName{
		
			private String conversionActionName;
			
			private double conversions;
			
			private double allConversions;
			
			public ConversionActionName() {
			}
			
			public ConversionActionName(String conversionActionName, 
					double conversions, double allConversions) {
					
					this.conversionActionName = conversionActionName;
					this.conversions = conversions;
					this.allConversions = allConversions;
			}

			public String getConversionActionName() {
				return conversionActionName;
			}

			public double getConversions() {
				return conversions;
			}

			public double getAllConversions() {
				return allConversions;
			}

			public void setConversionActionName(String conversionActionName) {
				this.conversionActionName = conversionActionName;
			}

			public void setConversions(double conversions) {
				this.conversions = conversions;
			}

			public void setAllConversions(double allConversions) {
				this.allConversions = allConversions;
			}
	}
}
