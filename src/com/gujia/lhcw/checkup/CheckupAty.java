package com.gujia.lhcw.checkup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.gujia.R;
import com.gujia.util.TitleBuilder;

public class CheckupAty extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_checkup);
		
		init();
		
		findViewById(R.id.btn_detail).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(CheckupAty.this,ResultDetailAty.class));
			}
		});
		
		findViewById(R.id.btn_tendency).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(CheckupAty.this,ResultTendencyAty.class));
			}
		});
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("健康检测")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				CheckupAty.this.finish();
			}
		});
	}

}
