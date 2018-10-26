package com.erikjensen.Scryfall;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


public class SearchInfoTest {
	
	@Test
	public void testBuildQuery() {
		SearchInfo searchInfo = new SearchInfo();
		Map<String, String> input = new HashMap<String, String>();
		input.put("c", "blue");
		input.put("pow", "2");
		input.put("t", "merfolk");
		
		String output = searchInfo.buildQuery(input);
		Assert.assertEquals("q=c%3Ablue+t%3Amerfolk+pow%3A2", output);
	}

}
