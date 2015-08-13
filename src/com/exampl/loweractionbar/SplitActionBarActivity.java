package com.exampl.loweractionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

@SuppressWarnings("deprecation")
public class SplitActionBarActivity extends ActionBarActivity implements ActionBar.TabListener{
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_split_actionbar);
		ActionBar supportActionBar = getSupportActionBar();
		supportActionBar.setDisplayShowHomeEnabled(true);
		supportActionBar.setIcon(R.drawable.bar_logo);
		supportActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		supportActionBar.addTab(supportActionBar.newTab().setText("Tab1").setTabListener(this));
		supportActionBar.addTab(supportActionBar.newTab().setText("Tab2").setTabListener(this));
		supportActionBar.addTab(supportActionBar.newTab().setText("Tab3").setTabListener(this));
	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.split_actionbar_menu, menu);
		return true;
	}
}
