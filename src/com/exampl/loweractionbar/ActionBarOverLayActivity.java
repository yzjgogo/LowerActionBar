package com.exampl.loweractionbar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class ActionBarOverLayActivity extends ActionBarActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actionbar_overlay);
		ActionBar supportActionBar = getSupportActionBar();
		supportActionBar.setDisplayShowHomeEnabled(true);
		supportActionBar.setIcon(R.drawable.ic_launcher);
	}
}
