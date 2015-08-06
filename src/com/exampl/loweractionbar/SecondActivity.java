package com.exampl.loweractionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;

public class SecondActivity extends ActionBarActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	    // If your minSdkVersion is 11 or higher, instead use:
	    // getActionBar().setDisplayHomeAsUpEnabled(true);
	}
}
