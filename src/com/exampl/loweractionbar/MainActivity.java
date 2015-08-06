package com.exampl.loweractionbar;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
/**
 * ����menu
 * @author Administrator
 *
 */
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
}
