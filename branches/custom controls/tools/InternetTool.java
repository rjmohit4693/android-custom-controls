package com.liupeinye.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class InternetTool {
	public static InputStream getInputStream(URL url) throws IOException
	{
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(5 * 1000);
		return connection.getInputStream();
	}
}
