package com.gujia.lhcw.checkup;

import com.gujia.R;
import com.gujia.util.TitleBuilder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ResultDetailAty extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_result_detail);
		init();
		
		findViewById(R.id.btn_to_tendency).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(ResultDetailAty.this, ResultTendencyAty.class));
			}
		});
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("详细结果")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ResultDetailAty.this.finish();
			}
		}).setRightImage(R.drawable.icon_share)
		.setRightOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//分享操作
			}
		});
	}
}
