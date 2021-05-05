package w4GameBackend.Entities;

import w4GameBackend.Interfaces.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignTitle;
	private double discountRate;
	
	public Campaign() {
		super();
	}
	
	public Campaign(int id, String campaignTitle, double discountRate) {
		super();
		this.id = id;
		this.campaignTitle = campaignTitle;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignTitle() {
		return campaignTitle;
	}

	public void setCampaignTitle(String campaignTitle) {
		this.campaignTitle = campaignTitle;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
