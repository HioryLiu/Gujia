package com.gujia.lhcw.seatheat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.gujia.R;
import com.gujia.util.TitleBuilder;

public class SeatHeatAty extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_seat_heat);
		
		init();
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("座椅加热")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				SeatHeatAty.this.finish();
			}
		});
	}

}
