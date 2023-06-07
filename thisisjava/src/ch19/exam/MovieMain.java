package ch19.exam;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movieAPI api = new movieAPI();
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어:");
		String sword = scan.nextLine();
		String result = api.getMovie(sword);
//		System.out.println(result);
		
		JSONObject obj = new JSONObject(result);
		JSONArray items = obj.getJSONArray("items");
		for (int i =0; i<items.length();i++) {
			//렝스라는 메서드
//			System.out.println(((JSONObject)items.get(i)).getString("title");
			JSONObject item = items.getJSONObject(i);
			System.out.print(item.getString("title")+"\t");
			System.out.print(item.getString("link")+"\t");
			System.out.print(item.getString("image")+"\t");
			System.out.println();
			
		}
		System.out.println();
		

	}

}
