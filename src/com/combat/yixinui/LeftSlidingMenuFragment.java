/**
 * 
 */
package com.combat.yixinui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/**
 * @Project yixinui	
 * @author houxb
 * @Date 2016-2-24
 */
public class LeftSlidingMenuFragment extends Fragment implements OnClickListener {

	private View yixinBtnLayout;
	private View circleBtnLayout;
	private View settingBtnLayout;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
					Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.main_left_fragment, container, false);
		yixinBtnLayout = view.findViewById(R.id.yixinBtnLayout);
		yixinBtnLayout.setOnClickListener(this);
		circleBtnLayout = view.findViewById(R.id.circleBtnLayout);
		circleBtnLayout.setOnClickListener(this);
		settingBtnLayout = view.findViewById(R.id.settingBtnLayout);
		settingBtnLayout.setOnClickListener(this);
		
		System.out.println();
		return view;
	}
	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
