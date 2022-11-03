package com.majdzain.iq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;
import android.widget.TextView;

public class StartActivity extends Activity {
	MediaPlayer soundstart;
	boolean sound_, soundbutton_, soundcheck_;
	String language_;
	TextView fn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_start);
		soundstart = MediaPlayer.create(StartActivity.this, R.raw.startup_11);
		fn1 = (TextView) findViewById(R.id.fn1);
		SharedPreferences getprefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		sound_ = getprefs.getBoolean("soundstart", true);    
		language_ = getprefs.getString("language", "arabic");
		setViewLanguage();
		if (sound_){
			soundstart.start();
		}
		Thread Splash = new Thread() {
			public void run() {
				try {
					sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(StartActivity.this,MainActivity.class);
					startActivity(i);
				}
			}
		};
		Splash.start();
	}

	private void setViewLanguage() {
		if (language_.contentEquals("arabic")) {
			fn1.setText(R.string.fn1);
		} else if(language_.contentEquals("english")){
			fn1.setText(R.string.fn1_e);
		}
	}

	@Override
	protected void onPause() {
		super.onPause();
		soundstart.release();
		finish();
	}
}
