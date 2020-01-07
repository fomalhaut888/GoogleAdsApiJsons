package com.leosys.adwords.bu4.lead10.jsons.google_ads_api.response;

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
