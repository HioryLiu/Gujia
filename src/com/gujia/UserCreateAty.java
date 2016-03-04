package com.gujia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import com.gujia.util.TitleBuilder;
import com.gujia.util.ToastUtils;

public class UserCreateAty extends Activity {

	private EditText usernameEdit;
	String username;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_create_user);
	
		usernameEdit=(EditText) findViewById(R.id.usernameEdit);
		
		
		findViewById(R.id.createButton).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				username=usernameEdit.getText().toString();
				if (username.equals("")) {
					ToastUtils.showToast(UserCreateAty.this, "输入内容为空", Toast.LENGTH_SHORT);
				}else {
					startActivity(new Intent(UserCreateAty.this, NavigationAty.class));
				}
			}
		});
		
		init();
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("创建用户")
		.setLeftText("返回")
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				UserCreateAty.this.finish();
				
			}
		});
	}
}
