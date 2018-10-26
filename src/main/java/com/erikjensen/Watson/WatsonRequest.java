package com.erikjensen.Watson;

import com.google.gson.JsonObject;


public class WatsonRequest {
	
	private JsonObject jsonObject;
	
	public WatsonRequest() {
		jsonObject = new JsonObject();
		jsonObject.addProperty("alternate_intents", true);
	}
	
	public void setContext(WatsonContext context) {
		jsonObject.add("context", context.getContext());
	}
	
	public JsonObject getRequest() {
		return jsonObject;
	}

}
