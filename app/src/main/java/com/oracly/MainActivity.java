package com.oracly;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
	public static final String MAIN_FRAGMENT_TAG = "main_fragment_tag";
	private MainFragment mMainFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentManager fm = getSupportFragmentManager();
		mMainFragment =  (MainFragment) fm.findFragmentByTag(MAIN_FRAGMENT_TAG);
		
		if(mMainFragment == null)
		{
			mMainFragment = new MainFragment();
			fm.beginTransaction()
					.add(R.id.activity_main, mMainFragment, MAIN_FRAGMENT_TAG)
					.commit();
			
			//load data here
			loadGameData();
		}
	}
	
	private void loadGameData()
	{
		
	}
}
