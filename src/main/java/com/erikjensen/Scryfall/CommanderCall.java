package com.erikjensen.Scryfall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommanderCall {
	
	private static final Logger log = LoggerFactory.getLogger(CommanderCall.class);
	
	public static void randomCommander(String colors) {
		
		try {
			URL url = new URL("https://api.scryfall.com/cards/random");
			Map<String, String> params = new HashMap<>();
			params.put("q", "is%3Acommander");
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			
			//System.out.println(conn.get);

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();
			
		} catch (Exception ex) {
			log.error(ex.getLocalizedMessage());
		}
		
	}

}
