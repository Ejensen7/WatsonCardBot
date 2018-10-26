package com.erikjensen.Watson;

import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.client.WebTarget;

import org.apache.commons.configuration2.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class WatsonCall {
	
	private static final Logger log = LoggerFactory.getLogger(WatsonCall.class);
	
	@Inject
	public WebTarget watson;
	
	@Inject
	private static Configuration config;

	public static void MakeCall(/*Context context*/) {
		/*try {*/
			
			//WatsonRequest watsonRequest = (WatsonRequest)context.getValue("WATSON_REQUEST");
			String applicationID = "watson.";
			String path = "/assistant/api/v1/" + config.getString(applicationID+"workspace") + "/message";
			
			/*Client client = ClientBuilder.newClient();
			URL url = new URL("https://gateway.watsonplatform.net");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			String input = "test";
			
			MultivaluedMap<String, Object> headers = new 

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			
			
			
			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
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
					//cards.add(makeCardInfo(items.getJSONObject(i)));
				}
			}
			
			

			conn.disconnect();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error(ex.getLocalizedMessage());
		}*/
			
	}
	
}
