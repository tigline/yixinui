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

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
					Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.main_left_fragment, container, false);
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
