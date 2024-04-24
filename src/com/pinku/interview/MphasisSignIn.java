package com.pinku.interview;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class MphasisSignIn {
	
	
	public static void main(String[] args) {
		List<String> logs = new ArrayList<>();
		
		logs.add("12 10 sign-in");
        logs.add("5 105 sign-out");
        logs.add("12 100 sign-out");
        logs.add("5 80 sign-in");
        logs.add("8 120 sign-out");
        logs.add("8 101 sign-in");
		
		System.out.println(processEvent(logs, 30));
		
		
		
		
	}

	private static List<String> processEvent(List<String> logs, int maximumTime) {
		
		Map<String, UserInfo> map = new HashMap<>();
		
		for(String str : logs) {
			
			String[] s = str.split(" ");
			UserInfo user = null;
			if(map.containsKey(s[0])) {
				user = map.get(s[0]);
			}else {
				user = new UserInfo();
				user.id = s[0];
				map.put(s[0], user);
				
			}
			
			if("sign-in".equalsIgnoreCase(s[2].trim())) {
				user.login = Integer.parseInt(s[1].trim());
				user.duration = Math.abs(user.login-user.logout);
			}else {
				user.logout = Integer.parseInt(s[1].trim());
				user.duration = Math.abs(user.login-user.logout);
			}
			
		}
		
		List<UserInfo> list = map.values()
				.stream()
				.filter(user -> (user.duration <= maximumTime) && user.login != 0 && user.logout != 0)
				.collect(Collectors.toList());
		
		Collections.sort(list, (l1, l2) -> (int)(Integer.parseInt(l1.id) - Integer.parseInt(l2.id)));
	//	List<Integer> l = list.stream().map(user -> Integer.valueOf(user.id)).collect(Collectors.toList());
		return list.stream().map(user -> user.id).collect(Collectors.toList());
	}

	
	
	
}

class UserInfo {
	
	public String id;
	public int login;
	public int logout;
	public int duration;
}
