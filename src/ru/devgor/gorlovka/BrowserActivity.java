package ru.devgor.gorlovka;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class BrowserActivity extends Activity {
	private WebView mWebView;
	private ProgressBar proGress;

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_browser);
	    Uri url = getIntent().getData();
	    mWebView = (WebView) findViewById(R.id.webview);
	    mWebView.getSettings().setJavaScriptEnabled(true);
	    mWebView.loadUrl(url.toString()); 
	    mWebView.setWebViewClient(new WebViewClient());
	    
	    //proGress = (ProgressBar) findViewById(R.id.progressBar1);
	   // proGress.setVisibility(View.VISIBLE);
	   //setValue(mWebView.getProgress());
	    
	    findViewById(R.id.reloadbut).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mWebView.reload();
			}
		});
	}
	//private void setValue(int a) {
	//	this.proGress.setProgress(a / 10);
		
	//}
	@Override
	public void onBackPressed() {
	    if(mWebView.canGoBack()) {
	        mWebView.goBack();
	    } else {
	        super.onBackPressed();
	    }
	
	}

	public void onProgressChanged(WebView view, int progress) 
	{
    proGress.setProgress(progress);
    
 }

}
