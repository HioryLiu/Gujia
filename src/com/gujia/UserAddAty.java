package com.gujia;

import android.app.Activity;
import android.os.Bundle;

import com.gujia.util.TitleBuilder;

public class UserAddAty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		init();
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("�����û�")
		.setLeftText("����");
	}
}
