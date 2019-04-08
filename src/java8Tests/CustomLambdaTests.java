package java8Tests;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

public class CustomLambdaTests {

	public static void main(String args[]) {
		UrlGetter oulGetter = (path) -> {
			String ret = "";
			try {
				URL url =  new URL(path);
				URLConnection con =  url.openConnection();
				InputStream in = con.getInputStream();
				String encoding = con.getContentEncoding();  // ** WRONG: should use "con.getContentType()" instead but it returns something like "text/html; charset=UTF-8" so this value must be parsed to extract the actual encoding
				encoding = encoding == null ? "UTF-8" : encoding;
				ret = IOUtils.toString(in, encoding);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
			
			
		};
		System.out.println(oulGetter.getUrl("https://www.uol.com.br/"));
		
		
	}
	
	interface UrlGetter{
		public String getUrl(String url);
	}
}
