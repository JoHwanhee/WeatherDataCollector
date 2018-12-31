import org.json.JSONArray;
import org.json.JSONObject;

import Models.Category;
import OpenDataPotal.OpenDataPotal;

public class Main {

	public static void main(String[] args) {
		try {
			OpenDataPotal openDataPotal = new OpenDataPotal();
			JSONObject josn = openDataPotal.getWeatherJSonObject("20181231","0600","60","127");
			
			String result = josn.getJSONObject("response")
				.getJSONObject("header")
				.getString("resultCode");
			
			if(result.equals("0000")) {
				System.out.println("서울 특별시 날씨 예보 (2018. 12. 31. 월 06:00 기준)");
				JSONArray items = josn.getJSONObject("response")
						.getJSONObject("body")
						.getJSONObject("items")
						.getJSONArray("item")
						;
				
				for (Object item : items) {
					JSONObject jObject = (JSONObject)item;
					
					System.out.println(Category.parse(jObject.getString("category").toString()) + ":"+jObject.getDouble("obsrValue"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
