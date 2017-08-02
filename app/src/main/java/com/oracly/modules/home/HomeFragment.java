package com.oracly.modules.home;

import android.content.Intent;
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

import com.oracly.R;
import com.oracly.modules.login.LoginActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class HomeFragment extends Fragment implements HomeView
{
	@InjectView(R.id.home_toolbar) protected Toolbar mToolbar;
	@InjectView(R.id.viewpager_home) protected ViewPager mViewPager;
	@InjectView(R.id.tab_layout_home) protected TabLayout mTabLayout;
	@InjectView(R.id.progress_bar_home) protected ProgressBar mProgressBar;
	private HomeVPAdapter mHomeVPAdapter;
	public static boolean isUserLoggedIn = false;
	private HomePresenterImpl mHomePresenter;
	
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		setHasOptionsMenu(true);
		mHomePresenter = new HomePresenterImpl(this);
		mHomePresenter.checkIfUserIsLoggedIn();
		mHomeVPAdapter = new HomeVPAdapter(getChildFragmentManager());
	}
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		ButterKnife.inject(this, view);
		setupViewPager();
		return view;
	}
	
	private void setupViewPager()
	{
		mViewPager.setAdapter(mHomeVPAdapter);
		mViewPager.setCurrentItem(0);
		mTabLayout.setupWithViewPager(mViewPager);
	}
	
	@Override
	public void openLoginActivity()
	{
		Intent i = new Intent(getActivity(), LoginActivity.class);
		startActivity(i);
		getActivity().finish();
	}
}
