package com.majdzain.iq;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;

public class QuestionPagerAdapter extends FragmentPagerAdapter {

	boolean sound_button, sound_check;
	String[] number_action_question, number_question_question,
			number_image_question, number_checks_question;
	String name;
	String age, smart;

	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return number_action_question[position];
	}

	public QuestionPagerAdapter(FragmentManager fm, String[] num_act_que,
			String[] num_que_que, String[] num_img_que, String[] num_che_que,
			boolean soundbutton, boolean soundcheck, String Name, String Age,
			String Smart) {
		super(fm);
		number_action_question = num_act_que;
		number_question_question = num_que_que;
		number_image_question = num_img_que;
		number_checks_question = num_che_que;
		sound_button = soundbutton;
		sound_check = soundcheck;
		name = Name;
		age = Age;
		smart = Smart;
	}

	@Override
	public Fragment getItem(int arg0) {
		QuestionFragment qf = new QuestionFragment();
		Bundle bun = new Bundle();
		bun.putString(qf.key_string_name_question, name);
		bun.putString(qf.key_integer_age_question, age);
		bun.putString(qf.key_integer_smart_question, smart);
		bun.putBoolean(qf.key_boolean_sound_button, sound_button);
		bun.putBoolean(qf.key_boolean_sound_check, sound_check);
		bun.putString(qf.key_number_checks_question,number_checks_question[arg0]);
		bun.putInt(qf.key_number_image_question, getNumberImage(arg0));
		bun.putString(qf.key_number_qusetion_question,number_question_question[arg0]);
		bun.putInt(qf.key_number_page, arg0 + 1);
		qf.setArguments(bun);
		return qf;
	}

	

	private int getNumberImage(int arg0) {
		int id = 0;
		switch (arg0) {
		case 0:
			id = R.drawable.number1;
			break;
		case 1:
			id = R.drawable.number2;
			break;
		case 2:
			id = R.drawable.number3;
			break;
		case 3:
			id = R.drawable.number4;
			break;
		case 4:
			id = R.drawable.number5;
			break;
		case 5:
			id = R.drawable.number6;
			break;
		case 6:
			id = R.drawable.number7;
			break;
		case 7:
			id = R.drawable.number8;
			break;
		case 8:
			id = R.drawable.number9;
			break;
		case 9:
			id = R.drawable.number10;
			break;
		case 10:
			id = R.drawable.number11;
			break;
		case 11:
			id = R.drawable.number12;
			break;
		case 12:
			id = R.drawable.number13;
			break;
		case 13:
			id = R.drawable.number14;
			break;
		case 14:
			id = R.drawable.number15;
			break;
		case 15:
			id = R.drawable.number16;
			break;
		case 16:
			id = R.drawable.number17;
			break;
		case 17:
			id = R.drawable.number18;
			break;
		case 18:
			id = R.drawable.number19;
			break;
		case 19:
			id = R.drawable.number20;
			break;
		case 20:
			id = R.drawable.number21;
			break;
		case 21:
			id = R.drawable.number22;
			break;
		case 22:
			id = R.drawable.number23;
			break;
		case 23:
			id = R.drawable.number24;
			break;
		case 24:
			id = R.drawable.number25;
			break;
		case 25:
			id = R.drawable.number26;
			break;
		case 26:
			id = R.drawable.number27;
			break;
		case 27:
			id = R.drawable.number28;
			break;
		case 28:
			id = R.drawable.number29;
			break;
		case 29:
			id = R.drawable.number30;
			break;
		case 30:
			id = R.drawable.number31;
			break;
		case 31:
			id = R.drawable.number32;
			break;
		case 32:
			id = R.drawable.number33;
			break;
		case 33:
			id = R.drawable.number34;
			break;
		case 34:
			id = R.drawable.number35;
			break;
		case 35:
			id = R.drawable.number36;
			break;
		case 36:
			id = R.drawable.number37;
			break;
		case 37:
			id = R.drawable.number38;
			break;
		case 38:
			id = R.drawable.number39;
			break;
		case 39:
			id = R.drawable.number40;
			break;
		}
		return id;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 41;
	}

}
