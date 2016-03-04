package com.gujia.user;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.gujia.R;
import com.gujia.util.TitleBuilder;
import com.gujia.util.ToastUtils;

public class UserQueryAty extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_user);
		
		init();
		findViewById(R.id.btn_add_user).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ToastUtils.showToast(UserQueryAty.this, "增加用户", Toast.LENGTH_SHORT);
			}
		});
	}
	
	private void init() {
		new TitleBuilder(this)
		.setTitleText("家人健康信息")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				UserQueryAty.this.finish();
			}
		});
	}

}
