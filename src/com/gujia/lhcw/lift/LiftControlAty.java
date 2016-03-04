package com.gujia.lhcw.lift;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.gujia.R;
import com.gujia.util.TitleBuilder;
import com.gujia.util.ToastUtils;

public class LiftControlAty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_lift_control);
		
		init();
		findViewById(R.id.sofa_up).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ToastUtils.showToast(LiftControlAty.this, "up", Toast.LENGTH_SHORT);
			}
		});
		findViewById(R.id.sofa_down).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ToastUtils.showToast(LiftControlAty.this, "down", Toast.LENGTH_SHORT);
			}
		});
		
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("��������")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				LiftControlAty.this.finish();
			}
		});
	}
}
