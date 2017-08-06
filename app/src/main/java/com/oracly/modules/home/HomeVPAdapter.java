package com.oracly.modules.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import com.oracly.modules.home.games.CurrentGamesTabFragment;
import com.oracly.modules.home.games.RankingTabFragment;


public class HomeVPAdapter extends FragmentStatePagerAdapter
{
	private String[] mTabTitles = {"Games", "Oracles", "Ranking"};
	private Fragment[] mRegisteredFrags = new Fragment[mTabTitles.length];
	
	public HomeVPAdapter(FragmentManager fm)
	{
		super(fm);
	}
	
	@Override
	public Fragment getItem(int position)
	{
		if(position == 0)
			return new CurrentGamesTabFragment();
		else if(position == 1)
			return new OraclesTabFragment();
		else
			return new RankingTabFragment();
	}
	
	@Override
	public int getCount()
	{
		return mTabTitles.length;
	}
	
	@Override
	public CharSequence getPageTitle(int position)
	{
		return mTabTitles[position];
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position)
	{
		Fragment fragment = (Fragment) super.instantiateItem(container, position);
		mRegisteredFrags[position] = fragment;
		return fragment;
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object)
	{
		mRegisteredFrags[position] = null;
		super.destroyItem(container, position, object);
	}
	
	public Fragment getFragment(int position)
	{
		return mRegisteredFrags[position];
	}
}
