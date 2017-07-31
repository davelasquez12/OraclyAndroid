package com.oracly.modules.login;

/**
 * Created by David on 7/31/2017.
 */

public class LoginPresenterImpl implements LoginPresenter
{
	private final LoginView mView;
	
	public LoginPresenterImpl(LoginView view)
	{
		mView = view;
	}
	
	@Override
	public void validateLogin(String email, String password)
	{
		mView.showProgressBar();
		
		if(email.equals("email@email.com") && password.equals("password"))
		{
			mView.hideProgressBar();
			mView.onLoginSuccessful();
		}
		else
		{
			mView.hideProgressBar();
			mView.onLoginFailed();
		}
	}
}
