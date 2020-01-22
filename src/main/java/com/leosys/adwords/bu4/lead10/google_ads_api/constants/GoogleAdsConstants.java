package com.leosys.adwords.bu4.lead10.google_ads_api.constants;

public class GoogleAdsConstants {
	
	public static class Fields{
		
			public static enum UserLocationView{
					COUNTRY_CRITERION_ID(getTable()), RESOURCE_NAME(getTable()), TARGETING_LOCATION(getTable()),
					CAMPAIGN_ID(Campaign.getTable(), Campaign.ID.getValue()), 
					CAMPAIGN_NAME(Campaign.getTable(), Campaign.NAME.getValue()), 
					CAMPAIGN_STATUS(Campaign.getTable(), Campaign.STATUS.getValue()), 
					CAMPAIGN_RESOURCE_NAME(Campaign.getTable(), Campaign.RESOURCE_NAME.getValue()),
					CUSTOMER_ID(Customer.getTable(), Customer.ID.getValue()),
					CUSTOMER_DESCRIPTIVE_NAME(Customer.getTable(), Customer.DESCRIPTIVE_NAME.getValue()),
					CUSTOMER_RESOURCE_NAME(Customer.getTable(), Customer.RESOURCE_NAME.getValue());
				
					private String schema;
					
					private String value;
					
					private UserLocationView(String schema){
							this.schema = schema;
							this.value = this.toString();
					}
					
					private UserLocationView(String schema, String value){
							this.schema = schema;
							this.value = value;
					}
					
					public static String getTable() {
							return "user_location_view";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getSchema() {
							return schema;
					}
	
					public String getValue() {
							return value;
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(UserLocationView ulv: values()) {
									if(ulv.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static UserLocationView getInstanceByName(String name) {
							for(UserLocationView ulv: values()) {
									if(ulv.getName().equals(name)) {
											return ulv;
									}
							}
							return null;
					}
					
					public static UserLocationView getInstanceByValue(String schema, String value) {
							for(UserLocationView ulv: values()) {
									if(ulv.getSchema().equals(schema) && ulv.getValue().equals(value)) {
											return ulv;
									}
							}
							return null;
					}
			}
		
			public static enum GeographicView{
					COUNTRY_CRITERION_ID(getTable()), LOCATION_TYPE(getTable()), RESOURCE_NAME(getTable()),
					CAMPAIGN_ID(Campaign.getTable(), Campaign.ID.getValue()), 
					CAMPAIGN_NAME(Campaign.getTable(), Campaign.NAME.getValue()), 
					CAMPAIGN_STATUS(Campaign.getTable(), Campaign.STATUS.getValue()), 
					CAMPAIGN_RESOURCE_NAME(Campaign.getTable(), Campaign.RESOURCE_NAME.getValue()),
					CUSTOMER_ID(Customer.getTable(), Customer.ID.getValue()),
					CUSTOMER_DESCRIPTIVE_NAME(Customer.getTable(), Customer.DESCRIPTIVE_NAME.getValue()),
					CUSTOMER_RESOURCE_NAME(Customer.getTable(), Customer.RESOURCE_NAME.getValue());
				
					private String schema;
					
					private String value;
					
					private GeographicView(String schema){
							this.schema = schema;
							this.value = this.toString();
					}
					
					private GeographicView(String schema, String value){
							this.schema = schema;
							this.value = value;
					}
				
					public static String getTable() {
							return "geographic_view";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getSchema() {
							return schema;
					}
	
					public String getValue() {
							return value;
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(GeographicView gv: values()) {
									if(gv.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static GeographicView getInstanceByName(String name) {
							for(GeographicView gv: values()) {
									if(gv.getName().equals(name)) {
											return gv;
									}
							}
							return null;
					}
					
					public static GeographicView getInstanceByValue(String schema, String value) {
							for(GeographicView gv: values()) {
									if(gv.getSchema().equals(schema) && gv.getValue().equals(value)) {
											return gv;
									}
							}
							return null;
					}
			}
			
			public static enum Customer{
					ID, DESCRIPTIVE_NAME, MANAGER, RESOURCE_NAME;
				
					public static String getTable() {
							return "customer";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getValue() {
							return toString();
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(Customer c: values()) {
									if(c.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static Customer getInstanceByName(String name) {
							for(Customer c: values()) {
									if(c.getName().equals(name)) {
											return c;
									}
							}
							return null;
					}
					
					public static Customer getInstanceByValue(String value) {
							for(Customer c: values()) {
									if(c.getValue().equals(value)) {
											return c;
									}
							}
							return null;
					}
			}
			
			public static enum AdGroup{
					ID(AdGroup.getTable()), NAME(AdGroup.getTable()), STATUS(AdGroup.getTable()), 
					RESOURCE_NAME(AdGroup.getTable()), 
					CAMPAIGN_ID(Campaign.getTable(), Campaign.ID.getValue()), 
					CAMPAIGN_NAME(Campaign.getTable(), Campaign.NAME.getValue()), 
					CAMPAIGN_STATUS(Campaign.getTable(), Campaign.STATUS.getValue()),
					CAMPAIGN_RESOURCE_NAME(Campaign.getTable(), Campaign.RESOURCE_NAME.getValue());
				
					private String schema;
					
					private String value;
					
					private AdGroup(String schema){
							this.schema = schema;
							this.value = this.toString();
					}
					
					private AdGroup(String schema, String value){
							this.schema = schema;
							this.value = value;
					}
				
					public static String getTable() {
							return "ad_group";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getSchema() {
							return schema;
					}

					public String getValue() {
							return value;
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(AdGroup a: values()) {
									if(a.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static AdGroup getInstanceByName(String name) {
							for(AdGroup a: values()) {
									if(a.getName().equals(name)) {
											return a;
									}
							}
							return null;
					}
					
					public static AdGroup getInstanceByValue(String schema, String value) {
							for(AdGroup a: values()) {
									if(a.getSchema().equals(schema) && a.getValue().equals(value)) {
											return a;
									}
							}
							return null;
					}
			}
			
			public static enum Campaign{
					ID, NAME, STATUS, RESOURCE_NAME;
				
					public static String getTable() {
							return "campaign";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getValue() {
							return toString();
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(Campaign c: values()) {
									if(c.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static Campaign getInstanceByName(String name) {
							for(Campaign c: values()) {
									if(c.getName().equals(name)) {
											return c;
									}
							}
							return null;
					}
					
					public static Campaign getInstanceByValue(String value) {
							for(Campaign c: values()) {
									if(c.getValue().equals(value)) {
											return c;
									}
							}
							return null;
					}
			}
			
			public static enum CustomerManagerLink{
					MANAGER_CUSTOMER, MANAGER_LINK_ID, RESOURCE_NAME, STATUS;
				
					public static String getTable() {
							return "customer_manager_link";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getValue() {
							return toString();
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(CustomerManagerLink cml: values()) {
									if(cml.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static CustomerManagerLink getInstanceByName(String name) {
							for(CustomerManagerLink cml: values()) {
									if(cml.getName().equals(name)) {
											return cml;
									}
							}
							return null;
					}
					
					public static CustomerManagerLink getInstanceByValue(String value) {
							for(CustomerManagerLink cml: values()) {
									if(cml.getValue().equals(value)) {
											return cml;
									}
							}
							return null;
					}
			}
			
			public static enum CustomerClientLink{
					CLIENT_CUSTOMER, HIDDEN, MANAGER_LINK_ID, RESOURCE_NAME, STATUS;
				
					public static String getTable() {
							return "customer_client_link";
					}
					
					public String getName() {
							return toString();
					}
					
					public String getValue() {
							return toString();
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(CustomerClientLink ccl: values()) {
									if(ccl.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static CustomerClientLink getInstanceByName(String name) {
							for(CustomerClientLink ccl: values()) {
									if(ccl.getName().equals(name)) {
											return ccl;
									}
							}
							return null;
					}
					
					public static CustomerClientLink getInstanceByValue(String value) {
							for(CustomerClientLink ccl: values()) {
									if(ccl.getValue().equals(value)) {
											return ccl;
									}
							}
							return null;
					}
			}
			
			public static enum CustomerClient{
					ID, RESOURCE_NAME, DESCRIPTIVE_NAME, HIDDEN, TEST_ACCOUNT, MANAGER,
					LEVEL;
				
					public static String getTable() {
							return "customer_client";
					}
				
					public String getName() {
							return toString();
					}
					
					public String getValue() {
							return toString();
					}
					
					@Override
					public String toString() {
							return super.toString().toLowerCase();
					}
					
					public static boolean isName(String name) {
							for(CustomerClient cc: values()) {
									if(cc.getName().equals(name)) {
											return true;
									}
							}
							return false;
					}
					
					public static CustomerClient getInstanceByName(String name) {
							for(CustomerClient cc: values()) {
									if(cc.getName().equals(name)) {
											return cc;
									}
							}
							return null;
					}
					
					public static CustomerClient getInstanceByValue(String value) {
							for(CustomerClient cc: values()) {
									if(cc.getValue().equals(value)) {
											return cc;
									}
							}
							return null;
					}
			}
	}
	
	public static enum Segments{
			DATE, CONVERSION_ACTION, CONVERSION_ACTION_NAME, CONVERSION_ACTION_CATEGORY,
			GEO_TARGET_AIRPORT(true), GEO_TARGET_CANTON(true), GEO_TARGET_CITY(true), 
			GEO_TARGET_COUNTY(true), GEO_TARGET_DISTRICT(true), GEO_TARGET_METRO(true), 
			GEO_TARGET_MOST_SPECIFIC_LOCATION(true), GEO_TARGET_POSTAL_CODE(true), 
			GEO_TARGET_PROVINCE(true), GEO_TARGET_REGION(true), GEO_TARGET_STATE(true);
		
			private boolean geo = false;
			
			private Segments() {
			}
			
			private Segments(boolean geo) {
					this.geo = geo;
			}
		
			public static String getTable() {
					return "segments";
			}
		
			public String getName() {
					return toString();
			}
			
			public String getValue() {
					return toString();
			}
			
			public boolean isGeo() {
					return geo;
			}
			
			@Override
			public String toString() {
					return super.toString().toLowerCase();
			}
			
			public static boolean isName(String name) {
					for(Segments s: values()) {
							if(s.getName().equals(name)) {
									return true;
							}
					}
					return false;
			}
			
			public static Segments getInstanceByName(String name) {
					for(Segments s: values()) {
							if(s.getName().equals(name)) {
									return s;
							}
					}
					return null;
			}
			
			public static Segments getInstanceByValue(String value) {
					for(Segments s: values()) {
							if(s.getValue().equals(value)) {
									return s;
							}
					}
					return null;
			}
	}
	
	public static enum Metrics{
			IMPRESSIONS, CLICKS, CTR, AVERAGE_CPC, COST_MICROS,
			CONVERSIONS, ALL_CONVERSIONS;
		
			public static String getTable() {
					return "metrics";
			}
			
			public String getName() {
					return toString();
			}
			
			public String getValue() {
					return toString();
			}
			
			@Override
			public String toString() {
					return super.toString().toLowerCase();
			}
			
			public static boolean isName(String name) {
					for(Metrics m: values()) {
							if(m.getName().equals(name)) {
									return true;
							}
					}
					return false;
			}
			
			public static Metrics getInstanceByName(String name) {
					for(Metrics m: values()) {
							if(m.getName().equals(name)) {
									return m;
							}
					}
					return null;
			}
			
			public static Metrics getInstanceByValue(String value) {
					for(Metrics m: values()) {
							if(m.getValue().equals(value)) {
									return m;
							}
					}
					return null;
			}
	}
	
	public static enum PredefinedDateRange{
			TODAY, YESTERDAY, LAST_7_DAYS, LAST_BUSINESS_WEEK, THIS_MONTH,
			LAST_MONTH, LAST_14_DAYS, LAST_30_DAYS, THIS_WEEK_SUN_TODAY, THIS_WEEK_MON_TODAY,
			LAST_WEEK_SUN_SAT, LAST_WEEK_MON_SUN;
		
			public String getValue() {
					return toString();
			}
		
			public static boolean isValue(String value) {
					for(PredefinedDateRange p: values()) {
							if(p.getValue().equals(value)) {
									return true;
							}
					}
					return false;
			}
			
			public static PredefinedDateRange getInstance(String value) {
					for(PredefinedDateRange p: values()) {
							if(p.getValue().equals(value)) {
									return p;
							}
					}
					return null;
			}
	}
	
	public static class Statuses{
		
			public static enum AdGroup{
					//ENABLED, PAUSED, REMOVED, UNKNOWN, UNSPECIFIED;//An error happened where UNKNOWN or UNSPECIFIED were added into the statuses' condition.
					ENABLED, PAUSED, REMOVED, UNKNOWN;
				
					public String getValue() {
							return toString();
					}
				
					public static boolean isValue(String value) {
							for(AdGroup ag: values()) {
									if(ag.getValue().equals(value)) {
											return true;
									}
							}
							return false;
					}
					
					public static AdGroup getInstance(String value) {
							for(AdGroup ag: values()) {
									if(ag.getValue().equals(value)) {
											return ag;
									}
							}
							return null;
					}
			}
			
			public static enum Campaign{
					//ENABLED, PAUSED, REMOVED, UNKNOWN, UNSPECIFIED;//An error happened where UNKNOWN or UNSPECIFIED were added into the statuses' condition.
					ENABLED, PAUSED, REMOVED, UNKNOWN;
				
					public String getValue() {
							return toString();
					}
				
					public static boolean isValue(String value) {
							for(Campaign c: values()) {
									if(c.getValue().equals(value)) {
											return true;
									}
							}
							return false;
					}
					
					public static Campaign getInstance(String value) {
							for(Campaign c: values()) {
									if(c.getValue().equals(value)) {
											return c;
									}
							}
							return null;
					}
			}
			
			public static enum CustomerClientLink{
					ACTIVE, CANCELED, INACTIVE, PENDING, REFUSED, UNKNOWN, UNSPECIFIED;
					
					public String getValue() {
							return toString();
					}
					
					public static boolean isValue(String value) {
							for(CustomerClientLink ccl: values()) {
									if(ccl.getValue().equals(value)) {
											return true;
									}
							}
							return false;
					}
					
					public static CustomerClientLink getInstance(String value) {
							for(CustomerClientLink ccl: values()) {
									if(ccl.getValue().equals(value)) {
											return ccl;
									}
							}
							return null;
					}
			}
			
			public static enum CustomerManagerLink{
					ACTIVE, CANCELED, INACTIVE, PENDING, REFUSED, UNKNOWN, UNSPECIFIED;
					
					public String getValue() {
							return toString();
					}
					
					public static boolean isValue(String value) {
							for(CustomerManagerLink cml: values()) {
									if(cml.getValue().equals(value)) {
											return true;
									}
							}
							return false;
					}
					
					public static CustomerManagerLink getInstance(String value) {
							for(CustomerManagerLink cml: values()) {
									if(cml.getValue().equals(value)) {
											return cml;
									}
							}
							return null;
					}
			}
	}
}
