package com.exampl.loweractionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

@SuppressWarnings("deprecation")
public class CustomabTextColorActivity extends ActionBarActivity implements ActionBar.TabListener{
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_abtextcolor);
		ActionBar supportActionBar = getSupportActionBar();
		//向低版本兼容的方法   
//		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		supportActionBar.setDisplayShowHomeEnabled(true);
		supportActionBar.setIcon(R.drawable.ic_launcher);
	    // If your minSdkVersion is 11 or higher, instead use:
	    // getActionBar().setDisplayHomeAsUpEnabled(true);
		//实现ActionBar Tab
		//也可以不setText，而是自定义tab的样式，进styles.xml看看
		supportActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		supportActionBar.addTab(supportActionBar.newTab()
                .setTabListener(this));
 
		supportActionBar.addTab(supportActionBar.newTab()
                .setTabListener(this));
 
		supportActionBar.addTab(supportActionBar.newTab().setText("tab3")
                .setTabListener(this));
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.menu_custom_abtextcolor, menu);
		return true;
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
}
