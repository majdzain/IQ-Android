package com.majdzain.iq;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultActivity extends Activity {
private int R1;
private double R2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		TextView name = (TextView)findViewById(R.id.qin1);
		TextView age = (TextView)findViewById(R.id.ager);
		TextView smart = (TextView)findViewById(R.id.smartr);
		TextView smart1 = (TextView)findViewById(R.id.smart1r);
		TextView smart2 = (TextView)findViewById(R.id.smart2r);
		final MediaPlayer soundfinish = MediaPlayer.create(ResultActivity.this, R.raw.startup_2);
		soundfinish.start();
		age.setText("عمرك متناسب مع نتيجة الذكاء");
        final Intent intentresult = getIntent();
		
		String namel = intentresult.getExtras().getString("name");
		int agel = intentresult.getExtras().getInt("age");
		int smartl = intentresult.getExtras().getInt("smart");
		int re = intentresult.getExtras().getInt("eq");
		
	    R1 = re * 100;
		R2 = R1 / 40;
		String r2 = String.valueOf(R2);
		smart.setText(r2);
		name.setText(namel);
		
		if(R2 <= 25)
			smart1.setText("درجة ذكائك ضعيفة جدا");
		if(R2 >= 25 && R2 <= 40)
			smart1.setText("درجة ذكائك محدودة");
		if(R2 >= 40 && R2 <= 55)
			smart1.setText("الحد العام للذكاء (في الحدود الأولى)");
		if(R2 >= 55 && R2 <= 70)
			smart1.setText("الحد العام للذكاء (في الحدود المرتفعة)");
		if(R2 >= 70 && R2 <= 80)
			smart1.setText("درجة ذكائك عالم");
		if(R2 >= 80 && R2 <= 90)
			smart1.setText("درجة ذكائك عبقري");
		if(R2 >= 90 && R2 <= 100)
			smart1.setText("درجة ذكائك نادرة جدا");
		
		if(smartl == R2)
			smart2.setText("توقعك كان صحيحا");
	    if(smartl < R2)
	    	smart2.setText("أنت متواضع (توقعك كان أقل من النتيجة(");
	    if(smartl > R2)
	    	smart2.setText("توقعك كان كثير عن النتيجة");
	    
	    
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
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
