package com.erikjensen.Scryfall;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class CardInfo {
	
	@SerializedName("object")
	public String object;
	
	@SerializedName("id")
	public String id;

	@SerializedName("oracle_id")
	public String oracle_id;

	@SerializedName("multiverse_ids")
	public List<String> multiverse_ids;

	@SerializedName("mtgo_id")
	public String mtgo_id;

	@SerializedName("mtog_foil_id")
	public String mtog_foil_id;

	@SerializedName("name")
	public String name;

	@SerializedName("lang")
	public String lang;

	@SerializedName("uri")
	public String uri;

	@SerializedName("scryfall_uri")
	public String scryfall_uri;

	@SerializedName("layout")
	public String layout;

	@SerializedName("highres_image")
	public String highres_image;

	@SerializedName("image_uris")
	public Map<String, String> image_uris;

	@SerializedName("mana_cost")
	public String mana_cost;

	@SerializedName("cmc")
	public String cmc;

	@SerializedName("type_line")
	public String type_line;

	@SerializedName("oracle_text")
	public String oracle_text;

	@SerializedName("power")
	public String power;

	@SerializedName("toughness")
	public String toughness;

	@SerializedName("colors")
	public List<String> colors;

	@SerializedName("color_identity")
	public List<String> color_identity;

	@SerializedName("legality")
	public CardLegality legality;

	@SerializedName("reserved")
	public Boolean reserved;

	@SerializedName("foil")
	public Boolean foil;

	@SerializedName("nonfoil")
	public Boolean nonfoil;

	@SerializedName("oversized")
	public Boolean oversized;

	@SerializedName("reprint")
	public Boolean reprint;

	@SerializedName("set")
	public String set;

	@SerializedName("set_name")
	public String set_name;

	@SerializedName("set_uri")
	public String set_uri;

	@SerializedName("set_search_uri")
	public String set_search_uri;

	@SerializedName("scryfall_set_uri")
	public String scryfall_set_uri;

	@SerializedName("rulings_uri")
	public String rulings_uri;

	@SerializedName("prints_search_uri")
	public String prints_search_uri;

	@SerializedName("collector_number")
	public String collector_number;

	@SerializedName("digital")
	public Boolean digital;

	@SerializedName("rarity")
	public String rarity;

	@SerializedName("flavor_text")
	public String flavor_text;

	@SerializedName("illustration_id")
	public String illustration_id;

	@SerializedName("artist")
	public String artist;

	@SerializedName("frame")
	public String frame;

	@SerializedName("full_art")
	public Boolean full_art;

	@SerializedName("border_color")
	public String border_color;

	@SerializedName("timeshifted")
	public Boolean timeshifted;

	@SerializedName("colorshifted")
	public Boolean colorshifted;

	@SerializedName("futureshifted")
	public Boolean futureshifted;

	@SerializedName("story_spotlight")
	public Boolean story_spotlight;

	@SerializedName("edhrec_rank")
	public String edhrec_rank;

	@SerializedName("tix")
	public String tix;
	
	@SerializedName("related_uris")
	public RelatedURIs related_uris;

	@SerializedName("purchase_uris")
	public PurchaseURIs purchase_uris;

	public CardLegality getLegality() {
		return legality;
	}

	public RelatedURIs getRelated_uris() {
		return related_uris;
	}

	public PurchaseURIs getPurchase_uris() {
		return purchase_uris;
	}

	public String getObject() {
		return object;
	}

	public String getId() {
		return id;
	}

	public String getOracle_id() {
		return oracle_id;
	}

	public List<String> getMultiverse_ids() {
		return multiverse_ids;
	}

	public String getMtgo_id() {
		return mtgo_id;
	}

	public String getMtog_foil_id() {
		return mtog_foil_id;
	}

	public String getName() {
		return name;
	}

	public String getLang() {
		return lang;
	}

	public String getUri() {
		return uri;
	}

	public String getScryfall_uri() {
		return scryfall_uri;
	}

	public String getLayout() {
		return layout;
	}

	public String getHighres_image() {
		return highres_image;
	}

	public Map<String, String> getImage_uris() {
		return image_uris;
	}

	public String getMana_cost() {
		return mana_cost;
	}

	public String getCmc() {
		return cmc;
	}

	public String getType_line() {
		return type_line;
	}

	public String getOracle_text() {
		return oracle_text;
	}

	public String getPower() {
		return power;
	}

	public String getToughness() {
		return toughness;
	}

	public List<String> getColors() {
		return colors;
	}

	public List<String> getColor_identity() {
		return color_identity;
	}

	public Boolean getReserved() {
		return reserved;
	}

	public Boolean getFoil() {
		return foil;
	}

	public Boolean getNonfoil() {
		return nonfoil;
	}

	public Boolean getOversized() {
		return oversized;
	}

	public Boolean getReprint() {
		return reprint;
	}

	public String getSet() {
		return set;
	}

	public String getSet_name() {
		return set_name;
	}

	public String getSet_uri() {
		return set_uri;
	}

	public String getSet_search_uri() {
		return set_search_uri;
	}

	public String getScryfall_set_uri() {
		return scryfall_set_uri;
	}

	public String getRulings_uri() {
		return rulings_uri;
	}

	public String getPrints_search_uri() {
		return prints_search_uri;
	}

	public String getCollector_number() {
		return collector_number;
	}

	public Boolean getDigital() {
		return digital;
	}

	public String getRarity() {
		return rarity;
	}

	public String getFlavor_text() {
		return flavor_text;
	}

	public String getIllustration_id() {
		return illustration_id;
	}

	public String getArtist() {
		return artist;
	}

	public String getFrame() {
		return frame;
	}

	public Boolean getFull_art() {
		return full_art;
	}

	public String getBorder_color() {
		return border_color;
	}

	public Boolean getTimeshifted() {
		return timeshifted;
	}

	public Boolean getColorshifted() {
		return colorshifted;
	}

	public Boolean getFutureshifted() {
		return futureshifted;
	}

	public Boolean getStory_spotlight() {
		return story_spotlight;
	}

	public String getEdhrec_rank() {
		return edhrec_rank;
	}

	public String getTix() {
		return tix;
	}

}
