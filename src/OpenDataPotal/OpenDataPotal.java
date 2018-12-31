package OpenDataPotal;

import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;

import Utils.HttpUtils;

public class OpenDataPotal {
	private String ServiceKey = "yJtjzVRlbJncrau3ZGu10ywN0SRALcl4RBmz%2F7QuHzniFj%2FN4P2cPw9QFEfGWhwTiKXzVYR2w%2BkAU2dFhbEw4A%3D%3D";
	private URIBuilder builder;
		
	public OpenDataPotal(){
		builder = new URIBuilder();
	}
	
	public void setServiceKey(String serviceKey) {
		ServiceKey = serviceKey;
	}
	
	
	public String getWeather(String baseDate, String baseTime, String nx, String ny, String resType) throws Exception {
		builder.setScheme("http");
		builder.setHost("newsky2.kma.go.kr");
		builder.setPath("/service/SecndSrtpdFrcstInfoService2/ForecastGrib");
		builder.addParameter("base_date", baseDate);
		builder.addParameter("base_time", baseTime);
		builder.addParameter("nx", nx);
		builder.addParameter("ny", ny);
		builder.addParameter("_type", resType);
		builder.addParameter("pageNo", "1");
		builder.addParameter("numOfRows", "10");
		StringBuilder sb = new StringBuilder();
		String url = builder.build().toURL().toString();
		sb.append(url);
		sb.append(String.format("&%s=%s", "ServiceKey", ServiceKey));
		
		String encoding = "utf-8";
		builder.clearParameters();
		
		return HttpUtils.get(sb.toString(), encoding);
	}
	
	public JSONObject getWeatherJSonObject(String baseDate, String baseTime, String nx, String ny) throws Exception {
		return new JSONObject(getWeather(baseDate, baseTime, nx, ny, "json"));
	}
}
