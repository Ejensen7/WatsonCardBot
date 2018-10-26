package com.erikjensen.Scryfall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class ScryfallRequest {
	
	private static final Logger log = LoggerFactory.getLogger(ScryfallRequest.class);
	
	
	public static void MakeCall(Boolean random, Map<String, String> details) {
		try {
			SearchInfo searchInfo = new SearchInfo();
			URL url;
			if(random)
				url = new URL("https://api.scryfall.com/cards/random"+searchInfo.buildQuery(details));
			else
				url = new URL("https://api.scryfall.com/cards/search"+searchInfo.buildQuery(details));
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			while ((output = br.readLine()) != null) {
				JSONObject main = new JSONObject(output);
				JSONArray items = main.getJSONArray("data");
				List<CardInfo> cards = new ArrayList<CardInfo>();
				for(int i = 0; i < items.length(); i++) {
					cards.add(makeCardInfo(items.getJSONObject(i)));
				}
			}
			
			

			conn.disconnect();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error(ex.getLocalizedMessage());
		}
	}
	
	private static CardInfo makeCardInfo(JSONObject cardItem) {
		Gson gson = new Gson();
		CardInfo card = gson.fromJson(cardItem.toString(), CardInfo.class);
		return card;
	}

}
