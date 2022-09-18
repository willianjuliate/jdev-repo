package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa4 {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "Maria");
		cookies.put("Email", "mari@email.com");
		cookies.put("Phone", "999999999");
		
		System.out.println("Contains 'phone' key: "+ cookies.containsKey("Phone"));
		System.out.println("Phone number: "+ cookies.get("Phone"));
		System.out.println("ALL COOKIES");
		
		for(String key: cookies.keySet()) {
			System.out.println(key + ": "+cookies.get(key));
		}
		
	}

}
