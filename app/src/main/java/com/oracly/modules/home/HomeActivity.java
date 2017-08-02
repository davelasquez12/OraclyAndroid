package com.oracly.modules.home;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.oracly.R;

public class HomeActivity extends AppCompatActivity
{
	public static final String MAIN_FRAGMENT_TAG = "main_fragment_tag";
	private HomeFragment mHomeFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		FragmentManager fm = getSupportFragmentManager();
		mHomeFragment =  (HomeFragment) fm.findFragmentByTag(MAIN_FRAGMENT_TAG);
		
		if(mHomeFragment == null)
		{
			mHomeFragment = new HomeFragment();
			fm.beginTransaction()
					.add(R.id.activity_home, mHomeFragment, MAIN_FRAGMENT_TAG)
					.commit();
			
			//load data here
			loadGameData();
		}
	}
	
	private void loadGameData()
	{
		
	}
}
