package org.astrolibrary.dailymoonforecast;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
 
public class MainActivity extends Activity {
 
	private WebView webView;
	 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
 
		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://astrolibrary.org/NOW/dmf.php");
		Eula.show(this);
 
	}
  
 
}