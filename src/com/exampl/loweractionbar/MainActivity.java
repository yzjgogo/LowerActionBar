package com.exampl.loweractionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
/**
 * ����menu
 * @author Administrator
 *
 */
@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity implements OnClickListener{

	private Button bt_custom_abTheme;
	private Button bt_custom_abTextColor,bt_actonbar_voerlay,bt_actonbar_split;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//ʹ��support��ʱ��ʾActionBar���Ͻǵ�ͼ�꣬��ûʹ��support�������嵥�ļ�����android:logo="@drawable/ic_launcher"����ͼ��
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setIcon(R.drawable.ic_launcher);
		bt_custom_abTheme = (Button) findViewById(R.id.bt_custom_abTheme);
		bt_custom_abTheme.setOnClickListener(this);
		bt_custom_abTextColor = (Button) findViewById(R.id.bt_custom_abTextColor);
		bt_custom_abTextColor.setOnClickListener(this);
		bt_actonbar_voerlay = (Button) findViewById(R.id.bt_actonbar_voerlay);
		bt_actonbar_voerlay.setOnClickListener(this);
		bt_actonbar_split = (Button) findViewById(R.id.bt_actonbar_split);
		bt_actonbar_split.setOnClickListener(this);
	}
	/**
	 * ��ʼ���˵�ѡ��
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_actions, menu);
		return true;
	}
	/**
	 * ���ĳһ���˵�ʱִ�еķ���
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		/*
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
		*/
		switch (item.getItemId()) {
		case R.id.action_search:
			Toast.makeText(this, "�������˵�", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.action_settings:
			Toast.makeText(this, "�����ò˵�", Toast.LENGTH_SHORT).show();			
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	public void click(View v){
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt_custom_abTheme:
			Intent intent = new Intent(this, CustomabThemeActivity.class);
			startActivity(intent);
			break;
		case R.id.bt_custom_abTextColor:
			Intent intentTextColor = new Intent(this, CustomabTextColorActivity.class);
			startActivity(intentTextColor);			
			break;
		case R.id.bt_actonbar_voerlay:
			Intent intentOverlay = new Intent(this, ActionBarOverLayActivity.class);
			startActivity(intentOverlay);			
			break;
		case R.id.bt_actonbar_split:
			Intent intentSplit = new Intent(this, SplitActionBarActivity.class);
			startActivity(intentSplit);			
			break;
		default:
			break;
		}
	}
}
