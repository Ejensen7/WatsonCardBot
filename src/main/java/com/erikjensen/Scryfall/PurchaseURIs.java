package com.erikjensen.Scryfall;

import com.google.gson.annotations.SerializedName;

public class PurchaseURIs {
	
	@SerializedName("amazon")
	public String amazon;
	
	@SerializedName("ebay")
	public String ebay;
	
	@SerializedName("tcgplayer")
	public String tcgplayer;
	
	@SerializedName("magiccardmarket")
	public String magiccardmarket;
	
	@SerializedName("cardhoarder")
	public String cardhoarder;
	
	@SerializedName("card_kingdom")
	public String card_kingdom;
	
	@SerializedName("mtgo_traders")
	public String mtgo_traders;
	
	@SerializedName("coolstuffinc")
	public String coolstuffinc;

	public String getAmazon() {
		return amazon;
	}

	public String getEbay() {
		return ebay;
	}

	public String getTcgplayer() {
		return tcgplayer;
	}

	public String getMagiccardmarket() {
		return magiccardmarket;
	}

	public String getCardhoarder() {
		return cardhoarder;
	}

	public String getCard_kingdom() {
		return card_kingdom;
	}

	public String getMtgo_traders() {
		return mtgo_traders;
	}

	public String getCoolstuffinc() {
		return coolstuffinc;
	}
	
	
}
