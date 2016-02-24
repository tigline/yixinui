package com.combat.yixinui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends SlidingFragmentActivity implements OnClickListener {

	private Fragment mContent;
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSlidingMenu();
        setContentView(R.layout.activity_main);
    }

	/**
	 * 
	 */
	private void initSlidingMenu() {
		// TODO Auto-generated method stub
		mContent = new Fragment_yixin();
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, mContent)
		.commit();
		
		setBehindContentView(R.layout.main_left_layout);
		FragmentTransaction mFragmentTransaction = getSupportFragmentManager().beginTransaction();
		Fragment mFrag = new LeftSlidingMenuFragment();
		mFragmentTransaction.replace(R.id.main_left_fragment, mFrag);
		mFragmentTransaction.commit();
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}
