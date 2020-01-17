package com.leosys.adwords.bu4.lead10.google_ads_api.jsons.response;

import java.util.List;
import java.util.Map;

import com.leosys.adwords.bu4.lead10.jsons.response.IntResult;

public interface CustomerResults {
	
	public static class Clients extends IntResult {
		
			private List<Map<String, Object>> customerClients;
			
			public Clients() {}
			
			public Clients(int result, String description, List<Map<String, Object>> customerClients) {
					super(result, description);
					this.customerClients = customerClients;
			}
	
			public List<Map<String, Object>> getCustomerClients() {
					return customerClients;
			}

			public void setCustomerClients(List<Map<String, Object>> customerClients) {
				this.customerClients = customerClients;
			}
	}
	
	public static class CustomerClientLinksResult extends IntResult {
		
			private List<CustomerClientLink> customerClientLinks;
			
			public CustomerClientLinksResult() {}
			
			public CustomerClientLinksResult(int result, String description, List<CustomerClientLink> customerClientLinks) {
					super(result, description);
					this.customerClientLinks = customerClientLinks;
			}
	
			public List<CustomerClientLink> getCustomerClientLinks() {
					return customerClientLinks;
			}
	}
	
	public static class CustomerManagerLinksResult extends IntResult {
		
			private List<CustomerManagerLink> customerManagerLinks;
			
			public CustomerManagerLinksResult(){}
	
			public CustomerManagerLinksResult(int result, String description, List<CustomerManagerLink> customerManagerLinks) {
					super(result, description);
					this.customerManagerLinks = customerManagerLinks;
			}
	
			public List<CustomerManagerLink> getCustomerManagerLinks() {
					return customerManagerLinks;
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
	
	public static class Report extends IntResult {
		
			private Map<String, Object> performance;
			
			public Report() {}
	
			public Report(int result, String description, Map<String, Object> performance) {
					super(result, description);
					this.performance = performance;
			}

			public Map<String, Object> getPerformance() {
					return performance;
			}
	}
	
	public static class Customers extends IntResult {
		
			private List<Customer> customers;
			
			public Customers() {
					super();
			}
	
			public Customers(int result, String description, List<Customer> customers) {
					super(result, description);
					this.customers = customers;
			}
	
			public List<Customer> getCustomers() {
					return customers;
			}
	}
	
	public static class Customer{
		
			private long cid;
			
			private String descriptiveName;
			
			private String currencyCode;
			
			private Boolean testAccount;
			
			private Boolean manager;
			
			private String timeZone;
			
			private Boolean hasPartnersBadge;
			
			private String finalUrlSuffix;
			
			private Boolean autoTaggingEnabled;
			
			private String trackingUrlTemplate;
			
			private boolean enabled = false;
			
			public Customer() {}
			
			public Customer(long cid) {
					this.cid = cid;
			}
	
			public Customer(long cid, String descriptiveName, String currencyCode, Boolean testAccount,
					Boolean manager, String timeZone, Boolean hasPartnersBadge, String finalUrlSuffix,
					Boolean autoTaggingEnabled, String trackingUrlTemplate, boolean enabled) {
					this.cid = cid;
					this.descriptiveName = descriptiveName;
					this.currencyCode = currencyCode;
					this.testAccount = testAccount;
					this.manager = manager;
					this.timeZone = timeZone;
					this.hasPartnersBadge = hasPartnersBadge;
					this.finalUrlSuffix = finalUrlSuffix;
					this.autoTaggingEnabled = autoTaggingEnabled;
					this.trackingUrlTemplate = trackingUrlTemplate;
					this.enabled = enabled;
			}
	
			public long getCid() {
					return cid;
			}
	
			public String getDescriptiveName() {
					return descriptiveName;
			}
	
			public String getCurrencyCode() {
					return currencyCode;
			}
	
			public Boolean isTestAccount() {
					return testAccount;
			}
	
			public Boolean isManager() {
				return manager;
			}
	
			public String getTimeZone() {
				return timeZone;
			}
	
			public Boolean isHasPartnersBadge() {
				return hasPartnersBadge;
			}
	
			public String getFinalUrlSuffix() {
				return finalUrlSuffix;
			}
	
			public Boolean isAutoTaggingEnabled() {
				return autoTaggingEnabled;
			}
	
			public String getTrackingUrlTemplate() {
				return trackingUrlTemplate;
			}

			public boolean isEnabled() {
				return enabled;
			}
	}
	
	public static class CustomerManagerLink{
		
			private String resourceName;
		
			private String managerCustomer	;
			
			private long managerLinkId;
			
			private String status;
			
			public CustomerManagerLink() {}
	
			public CustomerManagerLink(String resourceName, String managerCustomer, long managerLinkId, String status) {
					this.resourceName = resourceName;
					this.managerCustomer = managerCustomer;
					this.managerLinkId = managerLinkId;
					this.status = status;
			}
	
			public String getResourceName() {
					return resourceName;
			}
	
			public String getManagerCustomer() {
					return managerCustomer;
			}
	
			public long getManagerLinkId() {
					return managerLinkId;
			}
	
			public String getStatus() {
					return status;
			}
	}
	
	public static class CustomerClientLink{
		
			private String resourceName;
			
			private String clientCustomer;
			
			private long managerLinkId;
			
			private String status;
			
			private boolean hidden;
			
			public CustomerClientLink() {}
	
			public CustomerClientLink(String resourceName, String clientCustomer, long managerLinkId, String status,
					boolean hidden) {
					
					this.resourceName = resourceName;
					this.clientCustomer = clientCustomer;
					this.managerLinkId = managerLinkId;
					this.status = status;
					this.hidden = hidden;
			}
	
			public String getResourceName() {
				return resourceName;
			}
	
			public String getClientCustomer() {
				return clientCustomer;
			}
	
			public long getManagerLinkId() {
				return managerLinkId;
			}
	
			public String getStatus() {
				return status;
			}
	
			public boolean isHidden() {
				return hidden;
			}
	}
	
	public static class CustomerClient{
		
			private long id;
			
			private String descriptiveName;
			
			private boolean hidden;
			
			private boolean testAccount;
			
			private boolean manager;
			
			private long level;
			
			public CustomerClient() {}
	
			public CustomerClient(long id, String descriptiveName, boolean hidden, boolean testAccount, 
					boolean manager, long level) {
					this.id = id;
					this.descriptiveName = descriptiveName;
					this.hidden = hidden;
					this.testAccount = testAccount;
					this.manager = manager;
					this.level = level;
			}
	
			public long getId() {
					return id;
			}
	
			public String getDescriptiveName() {
					return descriptiveName;
			}
	
			public boolean isHidden() {
					return hidden;
			}
	
			public boolean isTestAccount() {
					return testAccount;
			}
	
			public boolean isManager() {
					return manager;
			}
	
			public long getLevel() {
					return level;
			}
	}
	
	public static class FullCustomerClient extends CustomerClient{
		
			private String resourceName;
			
			private String clientCustomer;
			
			private String timeZone;
			
			private String currencyCode;
			
			public FullCustomerClient() {}
	
			public FullCustomerClient(long id, String descriptiveName, boolean hidden, boolean testAccount, boolean manager,
					long level, String resourceName, String clientCustomer, String timeZone, String currencyCode) {
				
					super(id, descriptiveName, hidden, testAccount, manager, level);
					this.resourceName = resourceName;
					this.clientCustomer = clientCustomer;
					this.timeZone = timeZone;
					this.currencyCode = currencyCode;
			}
	
			public String getResourceName() {
				return resourceName;
			}
	
			public String getClientCustomer() {
				return clientCustomer;
			}
	
			public String getTimeZone() {
				return timeZone;
			}
	
			public String getCurrencyCode() {
				return currencyCode;
			}
	}
}
