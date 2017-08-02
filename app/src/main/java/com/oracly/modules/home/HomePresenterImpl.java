package com.oracly.modules.home;

/**
 * Created by David on 8/2/2017.
 */

public class HomePresenterImpl implements HomePresenter
{
	private HomeView mView;
	
	public HomePresenterImpl(HomeView view)
	{
		mView = view;
	}
	
	@Override
	public void checkIfUserIsLoggedIn()
	{
		if(!HomeFragment.isUserLoggedIn)
			mView.openLoginActivity();
			
	}
}
