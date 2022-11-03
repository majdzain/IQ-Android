package com.majdzain.iq;

import android.os.Bundle;
import android.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuestionFragment extends Fragment implements OnClickListener {
	public static final String key_number_action_question = "k_n_a_q";
	public static final String key_number_qusetion_question = "k_n_q_q";
	public static final String key_number_image_question = "k_n_i_q";
	public static final String key_number_checks_question = "k_n_c_q";
	public static final String key_boolean_sound_button = "k_b_s_b";
	public static final String key_boolean_sound_check = "k_b_s_c";
	public static final String key_string_name_question = "k_s_n_q";
	public static final String key_integer_age_question = "k_i_a_q";
	public static final String key_integer_smart_question = "k_i_s_q";
	public static final String key_number_layout_question = "k_n_l_q";
	public static final String key_number_page = "k_n_p";
	int image_id, page_number;
	Button page;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_basic, container, false);
		Bundle bun = getArguments();
		if (bun != null) {
			image_id = bun.getInt(key_number_image_question);
			page_number = bun.getInt(key_number_page);
			setValuses(view, image_id);
		}
		return view;
	}

	private void setValuses(View view1, int image) {
		ImageView iv = (ImageView) view1
				.findViewById(R.id.image_number_question);
		iv.setBackgroundResource(image);
		page = (Button) view1.findViewById(R.id.start);
		page.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		String name_class = String.valueOf(page_number);
		try {
			Class action = Class.forName("com.majdzain.iq.Q" + name_class + "Activity");
			Intent i = new Intent(v.getContext() , action);
			startActivity(i);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
