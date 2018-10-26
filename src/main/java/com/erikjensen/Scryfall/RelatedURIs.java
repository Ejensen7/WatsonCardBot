package com.erikjensen.Scryfall;

import com.google.gson.annotations.SerializedName;

public class RelatedURIs {
	
	@SerializedName("gatherer")
	private String gatherer;
	
	@SerializedName("tcg_player_decks")
	private String tcgPlayerDecks;
	
	@SerializedName("edhrec")
	private String edhrec;
	
	@SerializedName("mtg_top_eight")
	private String mtgTopEight;

	public String getGatherer() {
		return gatherer;
	}

	public String getTcgPlayerDecks() {
		return tcgPlayerDecks;
	}

	public String getEdhrec() {
		return edhrec;
	}

	public String getMtgTopEight() {
		return mtgTopEight;
	}
	
	
}
