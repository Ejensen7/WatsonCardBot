package com.erikjensen.Scryfall;

import com.google.gson.annotations.SerializedName;

public class CardLegality {
	
	@SerializedName("standard")
	private String standard;
	
	@SerializedName("future")
	private String future;
	
	@SerializedName("frontier")
	private String frontier;
	
	@SerializedName("modern")
	private String modern;
	
	@SerializedName("legacy")
	private String legacy;
	
	@SerializedName("pauper")
	private String pauper;
	
	@SerializedName("vintage")
	private String vintage;
	
	@SerializedName("penny")
	private String penny;
	
	@SerializedName("commander")
	private String commander;
	
	@SerializedName("1v1")
	private String oneVOne;
	
	@SerializedName("duel")
	private String duel;
	
	@SerializedName("brawl")
	private String brawl;
	
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getFuture() {
		return future;
	}
	public void setFuture(String future) {
		this.future = future;
	}
	public String getFrontier() {
		return frontier;
	}
	public void setFrontier(String frontier) {
		this.frontier = frontier;
	}
	public String getModern() {
		return modern;
	}
	public void setModern(String modern) {
		this.modern = modern;
	}
	public String getLegacy() {
		return legacy;
	}
	public void setLegacy(String legacy) {
		this.legacy = legacy;
	}
	public String getPauper() {
		return pauper;
	}
	public void setPauper(String pauper) {
		this.pauper = pauper;
	}
	public String getVintage() {
		return vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}
	public String getPenny() {
		return penny;
	}
	public void setPenny(String penny) {
		this.penny = penny;
	}
	public String getCommander() {
		return commander;
	}
	public void setCommander(String commander) {
		this.commander = commander;
	}
	public String getOneVOne() {
		return oneVOne;
	}
	public void setOneVOne(String oneVOne) {
		this.oneVOne = oneVOne;
	}
	public String getDuel() {
		return duel;
	}
	public void setDuel(String duel) {
		this.duel = duel;
	}
	public String getBrawl() {
		return brawl;
	}
	public void setBrawl(String brawl) {
		this.brawl = brawl;
	}
	
}
