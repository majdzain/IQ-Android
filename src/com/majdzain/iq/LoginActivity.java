package com.majdzain.iq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText name,age,smart;
	String Name , Age_ , Smart_;
	int Age , Smart;
	String res = "Yes";
	static SharedPreferences sp2 , sp1;
	public static String ourfile = "age_smart_name";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_login);
		ImageButton start = (ImageButton) findViewById(R.id.startqu);
		start.setSoundEffectsEnabled(false);
	    name = (EditText) findViewById(R.id.name);
		age = (EditText) findViewById(R.id.age);
	    smart = (EditText) findViewById(R.id.smart);
		sp2 = getSharedPreferences(ourfile , 0);
		sp1 = PreferenceManager.getDefaultSharedPreferences(LoginActivity.this);
	    final MediaPlayer sound = MediaPlayer.create(LoginActivity.this, R.raw.button20);
		Name = name.getText().toString();
		Age_ = age.getText().toString();
		Smart_ = smart.getText().toString();
		start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				sound.start();
				try{
					Age = Integer.parseInt(Age_);
					Smart = Integer.parseInt(Smart_);
				}catch(Exception e){
					
				}
				try{
				Intent i = new Intent(LoginActivity.this, Q1Activity.class);
				i.putExtra("age", Age);
				i.putExtra("smart", Smart);
				i.putExtra("name", Name);
				startActivity(i);
			    }catch(Exception e){}
				}
		});

	}
}
