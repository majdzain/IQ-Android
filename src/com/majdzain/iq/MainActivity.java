package com.majdzain.iq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button begin, begin1;
	MediaPlayer sound_button_start;
	boolean sound_button_boolean, sound_check_boolean;
	SharedPreferences sp;
	TextView qin1, qin2, qin3, qtext1, qtext2, qtext4, qtext6, qtext7, qtext8, qtext9, qtext10, qtext11, qtext12,
			qtext13, qtext14, qtext15, qtext16, qtext17, qtext18, qtext19, qtext20, qtext21, qtext22, qtext23, qtext24,
			qtext25, qtext26, qtext27, qtext28, qtext29, qtext30, qtext31, qtext32, qtext33, qtext34, qtext35, qtext36,
			qtext37, qtext38, qtext39, qtext40;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setValuses();
		String language_words = sp.getString("language", "arabic");
		setViewLanguage(language_words);
		if (language_words.contentEquals("arabic"))
			Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show();
		else
			Toast.makeText(this, R.string.toast_e, Toast.LENGTH_LONG).show();
		begin.setSoundEffectsEnabled(false);
		begin1.setSoundEffectsEnabled(false);
		sound_button_boolean = sp.getBoolean("soundbutton", true);
		begin.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (sound_button_boolean)
					sound_button_start.start();
				Intent i = new Intent(MainActivity.this, LoginActivity.class);
				startActivity(i);
			}
		});
		begin1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (sound_button_boolean)
					sound_button_start.start();
				Intent i = new Intent(MainActivity.this, LoginActivity.class);
				startActivity(i);
			}
		});

	}

	private void setValuses() {
		begin = (Button) findViewById(R.id.begin);
		begin1 = (Button) findViewById(R.id.begin1);
		sound_button_start = MediaPlayer.create(MainActivity.this, R.raw.button16);
		sp = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
		qin1 = (TextView) findViewById(R.id.qtext1);
		qin2 = (TextView) findViewById(R.id.qtext2);
		qin3 = (TextView) findViewById(R.id.qtext3);
		qtext1 = (TextView) findViewById(R.id.qin1);
		qtext2 = (TextView) findViewById(R.id.qin2);
		qtext4 = (TextView) findViewById(R.id.qin4);
		qtext6 = (TextView) findViewById(R.id.qin6);
		qtext7 = (TextView) findViewById(R.id.qin7);
		qtext8 = (TextView) findViewById(R.id.qin8);
		qtext9 = (TextView) findViewById(R.id.qin9);
		qtext10 = (TextView) findViewById(R.id.qin10);
		qtext11 = (TextView) findViewById(R.id.qin11);
		qtext12 = (TextView) findViewById(R.id.qin12);
		qtext13 = (TextView) findViewById(R.id.qin13);
		qtext14 = (TextView) findViewById(R.id.qin14);
		qtext15 = (TextView) findViewById(R.id.qin15);
		qtext16 = (TextView) findViewById(R.id.qin16);
		qtext17 = (TextView) findViewById(R.id.qin17);
		qtext18 = (TextView) findViewById(R.id.qin18);
		qtext19 = (TextView) findViewById(R.id.qin19);
		qtext20 = (TextView) findViewById(R.id.qin20);
		qtext21 = (TextView) findViewById(R.id.qin21);
		qtext22 = (TextView) findViewById(R.id.qin22);
		qtext23 = (TextView) findViewById(R.id.qin23);
		qtext24 = (TextView) findViewById(R.id.qin24);
		qtext25 = (TextView) findViewById(R.id.qin25);
		qtext26 = (TextView) findViewById(R.id.qin26);
		qtext27 = (TextView) findViewById(R.id.qin27);
		qtext28 = (TextView) findViewById(R.id.qin28);
		qtext29 = (TextView) findViewById(R.id.qin29);
		qtext30 = (TextView) findViewById(R.id.qin30);
		qtext31 = (TextView) findViewById(R.id.qin31);
		qtext32 = (TextView) findViewById(R.id.qin32);
		qtext33 = (TextView) findViewById(R.id.qin33);
		qtext34 = (TextView) findViewById(R.id.qin34);
		qtext35 = (TextView) findViewById(R.id.qin35);
		qtext36 = (TextView) findViewById(R.id.qin36);
		qtext37 = (TextView) findViewById(R.id.qin37);
		qtext38 = (TextView) findViewById(R.id.qin38);
		qtext39 = (TextView) findViewById(R.id.qin39);
		qtext40 = (TextView) findViewById(R.id.qin40);

	}

	private void setViewLanguage(String language_words) {
		if (language_words.contentEquals("arabic")) {
			qin1.setText(R.string.text1);
			qin2.setText(R.string.text2);
			qin3.setText(R.string.text3);
			qtext1.setText(R.string.in1);
			qtext2.setText(R.string.in2);
			qtext4.setText(R.string.in4);
			qtext6.setText(R.string.in6);
			qtext7.setText(R.string.in7);
			qtext8.setText(R.string.in8);
			qtext9.setText(R.string.in9);
			qtext10.setText(R.string.in10);
			qtext11.setText(R.string.in11);
			qtext12.setText(R.string.in12);
			qtext13.setText(R.string.in13);
			qtext14.setText(R.string.in14);
			qtext15.setText(R.string.in15);
			qtext16.setText(R.string.in16);
			qtext17.setText(R.string.in17);
			qtext18.setText(R.string.in18);
			qtext19.setText(R.string.in19);
			qtext20.setText(R.string.in20);
			qtext21.setText(R.string.in21);
			qtext22.setText(R.string.in22);
			qtext23.setText(R.string.in23);
			qtext24.setText(R.string.in24);
			qtext25.setText(R.string.in25);
			qtext26.setText(R.string.in26);
			qtext27.setText(R.string.in27);
			qtext28.setText(R.string.in28);
			qtext29.setText(R.string.in29);
			qtext30.setText(R.string.in30);
			qtext31.setText(R.string.in31);
			qtext32.setText(R.string.in32);
			qtext33.setText(R.string.in33);
			qtext34.setText(R.string.in34);
			qtext35.setText(R.string.in35);
			qtext36.setText(R.string.in36);
			qtext37.setText(R.string.in37);
			qtext38.setText(R.string.in38);
			qtext39.setText(R.string.in39);
			qtext40.setText(R.string.in40);
		} else if (language_words.contentEquals("english")) {
			qin1.setText(R.string.text1_e);
			qin2.setText(R.string.text2_e);
			qin3.setText(R.string.text3_e);
			qtext1.setText(R.string.in1_e);
			qtext2.setText(R.string.in2_e);
			qtext4.setText(R.string.in4_e);
			qtext6.setText(R.string.in6_e);
			qtext7.setText(R.string.in7_e);
			qtext8.setText(R.string.in8_e);
			qtext9.setText(R.string.in9_e);
			qtext10.setText(R.string.in10_e);
			qtext11.setText(R.string.in11_e);
			qtext12.setText(R.string.in12_e);
			qtext13.setText(R.string.in13_e);
			qtext14.setText(R.string.in14_e);
			qtext15.setText(R.string.in15_e);
			qtext16.setText(R.string.in16_e);
			qtext17.setText(R.string.in17_e);
			qtext18.setText(R.string.in18_e);
			qtext19.setText(R.string.in19_e);
			qtext20.setText(R.string.in20_e);
			qtext21.setText(R.string.in21_e);
			qtext22.setText(R.string.in22_e);
			qtext23.setText(R.string.in23_e);
			qtext24.setText(R.string.in24_e);
			qtext25.setText(R.string.in25_e);
			qtext26.setText(R.string.in26_e);
			qtext27.setText(R.string.in27_e);
			qtext28.setText(R.string.in28_e);
			qtext29.setText(R.string.in29_e);
			qtext30.setText(R.string.in30_e);
			qtext31.setText(R.string.in31_e);
			qtext32.setText(R.string.in32_e);
			qtext33.setText(R.string.in33_e);
			qtext34.setText(R.string.in34_e);
			qtext35.setText(R.string.in35_e);
			qtext36.setText(R.string.in36_e);
			qtext37.setText(R.string.in37_e);
			qtext38.setText(R.string.in38_e);
			qtext39.setText(R.string.in39_e);
			qtext40.setText(R.string.in40_e);
		}

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case R.id.about:

			break;
		case R.id.settings:
			Intent i = new Intent(MainActivity.this, Preference.class);
			startActivity(i);
			break;
		case R.id.exit:
			finish();
			break;
		case R.id.how_to_play:

			break;
		}
		return false;
	}
}
