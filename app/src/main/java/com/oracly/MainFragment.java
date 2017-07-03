package com.oracly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;


public class MainFragment extends Fragment
{
	private Toolbar mToolbar;
	private ViewPager mViewPager;
	private TabLayout mTabLayout;
	private ProgressBar mProgressBar;
	private MainVPAdapter mMainVPAdapter;
	
	
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		setHasOptionsMenu(true);
		mMainVPAdapter = new MainVPAdapter(getChildFragmentManager());
	}
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		mToolbar = (Toolbar) view.findViewById(R.id.oracly_toolbar);
		mViewPager = (ViewPager) view.findViewById(R.id.viewpager_main);
		mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout_main);
		mProgressBar = (ProgressBar) view.findViewById(R.id.progress_bar_main);
		
		setupViewPager();
		return view;
	}
	
	private void setupViewPager()
	{
		mViewPager.setAdapter(mMainVPAdapter);
		mViewPager.setCurrentItem(0);
		mTabLayout.setupWithViewPager(mViewPager);
		
	}
}
