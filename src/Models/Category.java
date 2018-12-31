package Models;

public class Category {

	// todo: change this to data structure
	public static String parse(String category) {
		String res = "";
		
		if(category.equals("PTY")) {
			res = "강수형태";
		}
		else if (category.equals("REH")) {
			res = "습도";
		}
		else if (category.equals("SKY")) {
			res = "하늘상태";
		}
		else if (category.equals("T1H")) {
			res = "습도";
		}
		else if (category.equals("RN1")) {
			res = "1시간 강수량";
		}
		else if (category.equals("REH")) {
			res = "기온";
		}
		else if (category.equals("UUU")) {
			res = "동서바람성분";
		}
		else if (category.equals("VVV")) {
			res = "남북바람성분";
		}
		else if (category.equals("VEC")) {
			res = "풍향";
		}
		else if (category.equals("WSD")) {
			res = "풍속";
		}
		else {
			res = category;
		}
		
		return res;
	} 
}
