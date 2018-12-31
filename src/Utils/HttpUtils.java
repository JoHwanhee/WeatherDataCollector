package Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpUtils {
	
	public static String get(String url, String resEncoding) throws Exception {
		HttpClient httpclient = null;
		HttpGet httpget = null;
		HttpEntity entity = null;
		InputStreamReader is = null;
		StringBuilder sb = null;
		
		try {
			httpclient = HttpClientBuilder.create().build();
			httpget = new HttpGet(url);
			HttpResponse response = httpclient.execute(httpget);
			entity = response.getEntity();

			if (entity != null) {
				is = new InputStreamReader(response.getEntity().getContent(), resEncoding);
				BufferedReader rd = new BufferedReader(is);
				
				String line = null;
				sb = new StringBuilder();
				while ( (line = rd.readLine()) != null) {
					sb.append(line);
				}				
			}
			httpget.abort();
			EntityUtils.consume(entity);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(is != null) {
				is.close();
			}
		}
		
		return sb.toString();
	}
}
