package com.gujia.lhcw.checkup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.gujia.R;
import com.gujia.util.TitleBuilder;

public class ResultTendencyAty extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.page_result_tendency);
		init();
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("结果趋势")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ResultTendencyAty.this.finish();
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
