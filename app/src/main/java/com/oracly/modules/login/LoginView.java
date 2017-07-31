package com.oracly.modules.login;

/**
 * Created by David on 7/31/2017.
 */

public interface LoginView
{
	void showNoInternetErrorMessage();
	void showProgressBar();
	void hideProgressBar();
	void onLoginSuccessful();
	void onLoginFailed();
}
