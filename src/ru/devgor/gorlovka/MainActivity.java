package ru.devgor.gorlovka;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WifiManager Wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
		if (!Wifi.isWifiEnabled()) {
			Wifi.setWifiEnabled(true);
		}
		
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new
		            Intent("ru.devgor.Browser");
		    intent.setData(Uri.parse("http://m.vk.com/gorlowka"));
		    startActivity(intent);
		}
	});
	
		findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new
		            Intent("ru.devgor.Browser");
		    intent.setData(Uri.parse("http://m.vk.com/gorlowka2"));
		    startActivity(intent);
		}
	});
		
		findViewById(R.id.button3).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

			}
		});
}
	protected void onDestroy(){
		 super.onDestroy();
		 WifiManager Wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
			if (Wifi.isWifiEnabled()) {
				Wifi.setWifiEnabled(false);
			}
		
	}
}
