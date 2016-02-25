/**
 * 
 */
package com.combat.yixinui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @Project yixinui	
 * @author houxb
 * @Date 2016-2-25
 */
public class Fragment_setting extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup caontainer, 
					Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_setting, caontainer, false);
		return view;
	}
}
