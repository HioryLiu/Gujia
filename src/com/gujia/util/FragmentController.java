package com.gujia.util;

import java.util.ArrayList;

import com.gujia.fragment.CheckupFragment;
import com.gujia.fragment.LiftControlFragment;
import com.gujia.fragment.SeatHeatFragment;
import com.gujia.fragment.WeighFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class FragmentController {

	private int containerId;
	private static FragmentManager fm;
	private ArrayList<Fragment> fragments;
	
	private static FragmentController controller;

	public static FragmentController getInstance(FragmentActivity activity, int containerId) {
		if (controller == null) {
			controller = new FragmentController(activity, containerId);
		}
		return controller;
	}

	private FragmentController(FragmentActivity activity, int containerId) {
		System.out.println("������ʼ��kaishi");
		this.containerId = containerId;
		fm = activity.getSupportFragmentManager();
		initFragment();
	}

	private void initFragment() {
		fragments = new ArrayList<Fragment>();
		System.out.println("Fragment��ʼ����ӿ�ʼ");
		fragments.add(new LiftControlFragment());
		fragments.add(new SeatHeatFragment());
		fragments.add(new CheckupFragment());
		fragments.add(new WeighFragment());
		System.out.println("������");
		
		FragmentTransaction ft = fm.beginTransaction();
		for(Fragment fragment : fragments) {
			ft.add(containerId, fragment);
		}
		ft.commit();
		System.out.println("�ύ�ɹ�");
	}

	public void showFragment(int position) {
//		hideFragments();
		System.out.println("��ַ�ǣ�"+position);
		Fragment fragment = fragments.get(position);
		FragmentTransaction ft = fm.beginTransaction();
		System.out.println("��ʼ����show������ʾ����");
		ft.replace(containerId, fragment).commit();
	}
	
	public void hideFragments() {
		FragmentTransaction ft = fm.beginTransaction();
		for(Fragment fragment : fragments) {
			if(fragment != null) {
				ft.hide(fragment);
			}
		}
		ft.commit();
		System.out.println("���سɹ�");
	}
	
	public Fragment getFragment(int position) {
		return fragments.get(position);
	}
	public FragmentManager getFm(){
		return fm;
	}
}