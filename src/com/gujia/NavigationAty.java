package com.gujia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

import com.gujia.lhcw.checkup.CheckupAty;
import com.gujia.lhcw.lift.LiftControlAty;
import com.gujia.lhcw.seatheat.SeatHeatAty;
import com.gujia.lhcw.weigh.WeighAty;
import com.gujia.user.UserQueryAty;

public class NavigationAty extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_navigation);
		
		//顾家人
		findViewById(R.id.gujiaPerson).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(NavigationAty.this,UserQueryAty.class));
//				getSupportFragmentManager().beginTransaction().add(R.id.fragment_content, new LiftControlFragment()).commit();
			}
		});
		findViewById(R.id.gujiaPerson).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(NavigationAty.this,UserQueryAty.class));
			}
		});
		//升降控制
		findViewById(R.id.lift_control).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(NavigationAty.this,LiftControlAty.class));
			}
		});
		//座椅加热
		findViewById(R.id.seat_heat).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(NavigationAty.this,SeatHeatAty.class));
			}
		});
		//健康检查
		findViewById(R.id.checkup).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(NavigationAty.this,CheckupAty.class));
			}
		});
		//称重
		findViewById(R.id.weigh).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(NavigationAty.this,WeighAty.class));
			}
		});
		
		
	}
	
	
}
