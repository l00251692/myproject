package com.sking.aim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		Intent intent = new Intent();
		intent.setClass(SplashActivity.this, MainActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
	}
	

}

