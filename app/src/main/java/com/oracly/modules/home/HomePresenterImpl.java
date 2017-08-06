package com.oracly.modules.home;

import android.content.Intent;

/**
 * Created by David on 8/2/2017.
 */

class HomePresenterImpl implements HomePresenter
{
	private HomeView mView;
	
	HomePresenterImpl(HomeView view)
	{
		mView = view;
	}
	
	@Override
	public void checkIfUserIsLoggedIn(Intent intent)
	{
		boolean newAccountCreated = intent.getBooleanExtra("new_account_created", false);
		
		if(!newAccountCreated && !HomeFragment.isUserLoggedIn)
			mView.openLoginActivity();
			
	}
}
