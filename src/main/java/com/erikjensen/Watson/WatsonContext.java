package com.erikjensen.Watson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class WatsonContext {
	
	private JsonObject jsonObject;
	
	private Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
	
	public WatsonContext() {
		jsonObject = new JsonObject();
	}
	
	public void setContext(JsonObject context) {
		if(context != null) {
			jsonObject = context;
		}
	}
	
	public JsonObject getContext() {
		return jsonObject;
	}
	
	public void put(String key, Object context) {
		jsonObject.add(key, gson.toJsonTree(context));
	}
	
	@Override
	public String toString() {
		return gson.toJson(jsonObject);
	}

}
