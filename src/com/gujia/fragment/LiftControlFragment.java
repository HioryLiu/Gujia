package com.gujia.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gujia.BaseFragment;
import com.gujia.R;

public class LiftControlFragment extends BaseFragment{

	private View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		init();
		view =inflater.inflate(R.layout.page_instruction, container,false);
		return view;
	}
	private void init(){

			
	}
	
	
	
}
