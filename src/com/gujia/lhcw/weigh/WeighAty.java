package com.gujia.lhcw.weigh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.gujia.R;
import com.gujia.util.TitleBuilder;
import com.gujia.util.ToastUtils;

public class WeighAty extends Activity{
	
	private TextView showText;
	
	@SuppressLint("ResourceAsColor") @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_weigh);
		
		findViewById(R.id.btn_clear).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//清零操作，称重检测是否为自动检测？
				ToastUtils.showToast(WeighAty.this, "已清零", Toast.LENGTH_SHORT);
				showText=(TextView) findViewById(R.id.show_text);
				showText.setText("60kg");
				showText.setTextColor(R.color.main_green);
			}
		});
		init();
	}
	
	private void init(){
		new TitleBuilder(this)
		.setTitleText("称重")
		.setLeftImage(R.drawable.icon_back)
		.setLeftOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				WeighAty.this.finish();
			}
		});
	}

}
