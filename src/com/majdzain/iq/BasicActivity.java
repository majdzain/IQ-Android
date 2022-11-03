package com.majdzain.iq;

import android.app.Activity;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class BasicActivity extends Activity implements ActionBar.TabListener {
	Bundle bun_;
	Resources reso;
	boolean sound_button, sound_check;
	String ar_en , name , age , smart;
	String[] num_act_que, num_que_que, num_img_que, num_che_que;
	QuestionPagerAdapter mSectionsPagerAdapter;
    SharedPreferences sp1 ;
	ViewPager mViewPager;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic);
        sp1 = PreferenceManager.getDefaultSharedPreferences(BasicActivity.this);
        LoginActivity.sp2 = getSharedPreferences(LoginActivity.ourfile, 0);
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		bun_ = getIntent().getExtras();
		reso = getResources();
		sound_button = sp1.getBoolean("soundbutton" , true);
		sound_check = sp1.getBoolean("soundcheck" , true);
		ar_en = sp1.getString("language" , "arabic");
		age = LoginActivity.sp2.getString("age" , "Couldn't Load Data");
		smart = LoginActivity.sp2.getString("smart" , "Couldn't Load Data");
		name = LoginActivity.sp2.getString("name", "Couldn't Load Data");
		if (ar_en.contentEquals("arabic")) {
			num_act_que = reso.getStringArray(R.array.numbers_action_questions);
			num_que_que = reso.getStringArray(R.array.numbers_ques_questions);
			num_img_que = reso.getStringArray(R.array.numbers_img_questions);
			num_che_que = reso.getStringArray(R.array.numbers_checks_questions);
		} else {
			num_act_que = reso.getStringArray(R.array.numbers_action_questions__e);
			num_que_que = reso.getStringArray(R.array.numbers_ques_questions__e);
			num_img_que = reso.getStringArray(R.array.numbers_img_questions__e);
			num_che_que = reso.getStringArray(R.array.numbers_checks_questions__e);
		}

		mSectionsPagerAdapter = new QuestionPagerAdapter(getFragmentManager(),
				num_act_que, num_que_que, num_img_que, num_che_que,
				sound_button, sound_check , name , age , smart);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});

		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			actionBar.addTab(actionBar.newTab().setText(mSectionsPagerAdapter.getPageTitle(i)).setTabListener(this));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.basic, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

}
