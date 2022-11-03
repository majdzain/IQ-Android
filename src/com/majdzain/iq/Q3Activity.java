package com.majdzain.iq;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Q3Activity extends Activity {
	private boolean result;
	private String result1 = "no";
	private int eq = 0;
	MediaPlayer soundback , soundnext , soundradio; 
	Button next , back;
	RadioButton a , b , c , d , e , f , g , h;
	Intent intentlogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qu3);
		next = (Button) findViewById(R.id.nextq3);
		back = (Button) findViewById(R.id.anse);
		a = (RadioButton) findViewById(R.id.q3a);
		b = (RadioButton) findViewById(R.id.q3b);
		c = (RadioButton) findViewById(R.id.q3c);
		d = (RadioButton) findViewById(R.id.q3d);
		e = (RadioButton) findViewById(R.id.q3e);
		f = (RadioButton) findViewById(R.id.q3f);
		g = (RadioButton) findViewById(R.id.q3g);
        h = (RadioButton) findViewById(R.id.q3h);
		soundnext = MediaPlayer.create(Q3Activity.this , R.raw.button6);
		soundback = MediaPlayer.create(Q3Activity.this , R.raw.button1);
        soundradio = MediaPlayer.create(Q3Activity.this , R.raw.button9);
		intentlogin = getIntent();
		next.setSoundEffectsEnabled(false);
		back.setSoundEffectsEnabled(false);
		a.setSoundEffectsEnabled(false);
		b.setSoundEffectsEnabled(false);
		c.setSoundEffectsEnabled(false);
		d.setSoundEffectsEnabled(false);
		e.setSoundEffectsEnabled(false);
		f.setSoundEffectsEnabled(false);
		g.setSoundEffectsEnabled(false);
		h.setSoundEffectsEnabled(false);
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				b.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
				f.setChecked(false);
				g.setChecked(false);
				h.setChecked(false);
			}
		});
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
				f.setChecked(false);
				g.setChecked(false);
				h.setChecked(false);
			}
		});
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				b.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
				f.setChecked(false);
				g.setChecked(false);
				h.setChecked(false);
			}
		});
		d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				b.setChecked(false);
				c.setChecked(false);
				e.setChecked(false);
				f.setChecked(false);
				g.setChecked(false);
				h.setChecked(false);
			}
		});
		e.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				b.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				f.setChecked(false);
				g.setChecked(false);
				h.setChecked(false);
			}
		});
		f.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				b.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
				g.setChecked(false);
				h.setChecked(false);
			}
		});
		g.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				b.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
				f.setChecked(false);
				h.setChecked(false);
			}
		});
		h.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				a.setChecked(false);
				b.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
				g.setChecked(false);
				f.setChecked(false);
			}
		});
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundback.start();
				Intent i = new Intent(Q3Activity.this , MainActivity.class);
				startActivity(i);
			}
		});

		next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				soundnext.start();
					if (a.isChecked()) {
						result = true;
						result1 = "yes";
					} else if (b.isChecked()) {
						result = false;
						result1 = "yes";
					} else if (c.isChecked()) {
						result = false;
						result1 = "yes";
					} else if (d.isChecked()) {
						result = false;
						result1 = "yes";
					} else if (e.isChecked()) {
						result = false;
						result1 = "yes";
					} else if (f.isChecked()) {
						result = false;
						result1 = "yes";
					} else if (g.isChecked()) {
						result = false;
						result1 = "yes";
					} else if (h.isChecked()) {
						result = false;
						result1 = "yes";
					}
					if(result1 == "no"){
				} else {
					if (result == true) {
						eq = eq + 1;
					}
					Intent i = new Intent(Q3Activity.this, Q4Activity.class);
					String name = intentlogin.getExtras().getString("name");
					int age = intentlogin.getExtras().getInt("age");
					int smart = intentlogin.getExtras().getInt("smart");
					eq = eq + intentlogin.getExtras().getInt("eq");
					i.putExtra("name", name);
					i.putExtra("age", age);
					i.putExtra("smart", smart);
					i.putExtra("eq", eq);
					startActivity(i);
				}
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.qu3, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		}
		return false;
	}
}
