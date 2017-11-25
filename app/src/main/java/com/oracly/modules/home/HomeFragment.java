package com.oracly.modules.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.oracly.R;
import com.oracly.modules.home.nav_drawer.HomeNavDrawerFragment;
import com.oracly.modules.login.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeFragment extends Fragment implements HomeView
{
	@BindView(R.id.home_toolbar) protected Toolbar mToolbar;
	@BindView(R.id.viewpager_home) protected ViewPager mViewPager;
	@BindView(R.id.tab_layout_home) protected TabLayout mTabLayout;
	@BindView(R.id.progress_bar_home) protected ProgressBar mProgressBar;
	@BindView(R.id.home_nav_drawer_layout) protected DrawerLayout mDrawerLayout;
	private HomeNavDrawerFragment mDrawerFragment;
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
		mHomePresenter.checkIfUserIsLoggedIn(getActivity().getIntent());
		mHomeVPAdapter = new HomeVPAdapter(getChildFragmentManager());
	}
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		ButterKnife.bind(this, view);
		setupToolbar();
		setupViewPager();
		setupNavDrawer();
		return view;
	}
	
	private void setupToolbar()
	{
		((HomeActivity) getActivity()).setSupportActionBar(mToolbar);
		((HomeActivity) getActivity()).getSupportActionBar().setTitle("Home");
		((HomeActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(true);
	}
	
	private void setupViewPager()
	{
		mViewPager.setAdapter(mHomeVPAdapter);
		mViewPager.setCurrentItem(0);
		mTabLayout.setupWithViewPager(mViewPager);
	}
	
	private void setupNavDrawer()
	{
		mDrawerFragment = (HomeNavDrawerFragment) getChildFragmentManager().findFragmentById(R.id.fragment_home_nav_drawer);
		mDrawerFragment.setup(mDrawerLayout, mToolbar);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
	{
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.menu_toolbar_home_activity, menu);
	}
	
	@Override
	public void openLoginActivity()
	{
		Intent i = new Intent(getActivity(), LoginActivity.class);
		startActivity(i);
		getActivity().finish();
	}
}
