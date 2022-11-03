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

public class Q7Activity extends Activity {
	private boolean result;
	private String result1 = "no";
	private int eq = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_q7);

		final Button next = (Button) findViewById(R.id.nextq7);
		final RadioButton a = (RadioButton) findViewById(R.id.q790);
		final RadioButton b = (RadioButton) findViewById(R.id.q7100);
		final RadioButton c = (RadioButton) findViewById(R.id.q7140);
		final RadioButton d = (RadioButton) findViewById(R.id.q7256);
		final RadioButton e = (RadioButton) findViewById(R.id.q7128);
		final Button back = (Button) findViewById(R.id.anse);
		final MediaPlayer soundnext = MediaPlayer.create(Q7Activity.this , R.raw.button6);
		final MediaPlayer soundback = MediaPlayer.create(Q7Activity.this , R.raw.button1);
		final MediaPlayer soundradio = MediaPlayer.create(Q7Activity.this , R.raw.button9);
		final Intent intentlogin = getIntent();
		next.setSoundEffectsEnabled(false);
		back.setSoundEffectsEnabled(false);
		a.setSoundEffectsEnabled(false);
		b.setSoundEffectsEnabled(false);
		c.setSoundEffectsEnabled(false);
		d.setSoundEffectsEnabled(false);
		e.setSoundEffectsEnabled(false);
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundradio.start();
				b.setChecked(false);
				c.setChecked(false);
				d.setChecked(false);
				e.setChecked(false);
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
			}
		});
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				soundback.start();
				Intent i = new Intent(Q7Activity.this , MainActivity.class);
				startActivity(i);
			}
		});

		next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
                    soundnext.start();
					if (a.isChecked()) {
						result = false;
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
						result = true;
						result1 = "yes";
					}
					if (result1 == "no") {
				    } else {
					if (result == true) {
						eq = eq + 1;
					}
					Intent i = new Intent(Q7Activity.this, Q8Activity.class);
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
		getMenuInflater().inflate(R.menu.q7, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
