package com.oracly.modules.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;

import com.oracly.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by David on 7/11/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginView
{
	private LoginPresenterImpl mLoginPresenter;
	
	@InjectView(R.id.login_email_edit_text) protected EditText mLoginEmailET;
	@InjectView(R.id.login_password_edit_text) protected EditText mPasswordET;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ButterKnife.inject(this);
		mLoginPresenter = new LoginPresenterImpl(this);
	}
	
	@Override
	public void showNoInternetErrorMessage()
	{
		
	}
	
	@Override
	public void showProgressBar()
	{
		
	}
	
	@Override
	public void hideProgressBar()
	{
		
	}
	
	@Override
	public void onLoginSuccessful()
	{
		
	}
	
	@Override
	public void onLoginFailed()
	{
		
	}
	
	@OnClick(R.id.login_button)
	public void onLoginButtonClicked()
	{
		String email = mLoginEmailET.getText().toString();
		String password = mPasswordET.getText().toString();
		mLoginPresenter.validateLogin(email, password);
	}
}
