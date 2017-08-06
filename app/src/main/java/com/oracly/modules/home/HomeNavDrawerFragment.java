package com.oracly.modules.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oracly.R;

/**
 * Created by David on 8/6/2017.
 */

public class HomeNavDrawerFragment extends Fragment
{
	private ActionBarDrawerToggle mDrawerToggle;
	
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_home_nav_drawer, container, false);
		return view;
	}
	
	void setup(DrawerLayout dl, Toolbar toolbar)
	{
		mDrawerToggle = new ActionBarDrawerToggle(getActivity(), dl, toolbar, R.string.drawer_opened, R.string.drawer_closed)
		{
			@Override
			public void onDrawerOpened(View drawerView)
			{
				super.onDrawerOpened(drawerView);
			}
			
			@Override
			public void onDrawerClosed(View drawerView)
			{
				super.onDrawerClosed(drawerView);
			}
		};
		
		dl.addDrawerListener(mDrawerToggle);
		mDrawerToggle.syncState();    //adds "hamburger" menu icon and switches to "arrow" animation when drawer is opened or icon is pressed.
	}
}
