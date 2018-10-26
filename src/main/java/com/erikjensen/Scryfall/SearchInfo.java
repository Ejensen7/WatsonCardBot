package com.erikjensen.Scryfall;

import java.util.Map;

public class SearchInfo {
	
	private String query;
	
	
	public String buildQuery(Map<String, String> details) {
		query = "?q=";
		if(details.size() == 0)
			return "";
		else {
			int count = details.size();
			for(Map.Entry<String, String> entry : details.entrySet()) {
				if(count <= 1)
					query += entry.getKey() + "%3A" + entry.getValue();
				else
					query += entry.getKey() + "%3A" + entry.getValue() + "+";
				count-=1;
			}
			
		}
				
		return query;
	}
	

}
