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

public class Q11Activity extends Activity {
	private boolean result;
	private String result1 = "no";
	private int eq = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_q11);

		final Button next = (Button) findViewById(R.id.nextq11);
		final RadioButton a = (RadioButton) findViewById(R.id.q11a);
		final RadioButton b = (RadioButton) findViewById(R.id.q11b);
		final RadioButton c = (RadioButton) findViewById(R.id.q11c);
		final RadioButton d = (RadioButton) findViewById(R.id.q11d);
		final RadioButton e = (RadioButton) findViewById(R.id.q11e);
		final RadioButton f = (RadioButton) findViewById(R.id.q11f);
		final RadioButton g = (RadioButton) findViewById(R.id.q11g);
		final RadioButton h = (RadioButton) findViewById(R.id.q11h);
		final MediaPlayer soundnext = MediaPlayer.create(Q11Activity.this , R.raw.button6);
		final MediaPlayer soundback = MediaPlayer.create(Q11Activity.this , R.raw.button1);
		final MediaPlayer soundradio = MediaPlayer.create(Q11Activity.this , R.raw.button9);
		final Intent intentlogin = getIntent();
		final Button back = (Button) findViewById(R.id.anse);
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
				Intent i = new Intent(Q11Activity.this , MainActivity.class);
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
					if (result1 == "no") {
				    } else {
					if (result == true) {
						eq = eq + 1;
					}
					Intent i = new Intent(Q11Activity.this, Q12Activity.class);
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
		getMenuInflater().inflate(R.menu.q11, menu);
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
