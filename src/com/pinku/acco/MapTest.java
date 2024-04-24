package com.pinku.acco;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("S1", "Bhu");
		map.put("S1", "kumar");
		System.out.println(map);
	}
}
