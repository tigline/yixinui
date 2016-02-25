package com.combat.yixinui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends SlidingFragmentActivity implements OnClickListener {

	private Fragment mContent;
	private ImageButton ivTitleBtnLeft;
	protected SlidingMenu mSlidingMenu;
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSlidingMenu();
        setContentView(R.layout.activity_main);
        initView();
    }

	/**
	 * 
	 */
	private void initView() {
		ivTitleBtnLeft = (ImageButton)this.findViewById(R.id.ivTitleBtnLeft);
		ivTitleBtnLeft.setOnClickListener(this);	
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
		
		mSlidingMenu = getSlidingMenu();
		mSlidingMenu.setMode(SlidingMenu.LEFT);
		mSlidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		mSlidingMenu.setFadeDegree(0.55f); //淡入淡出比例
		mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		mSlidingMenu.setShadowDrawable(R.drawable.shadow);
		mSlidingMenu.setFadeEnabled(true);
		mSlidingMenu.setBehindScrollScale(0.333f);
		
		
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ivTitleBtnLeft:
			mSlidingMenu.showMenu(true);
			break;
		default:
			break;
		}	
	}

	/**
	 * @param fragment
	 */
	public void switchContent(Fragment fragment) {
		
		mContent = fragment;
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, fragment)
		.commit();
		getSlidingMenu().showContent();
	}
}
