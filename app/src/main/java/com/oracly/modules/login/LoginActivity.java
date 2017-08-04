package com.oracly.modules.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.oracly.R;
import com.oracly.modules.home.HomeActivity;
import com.oracly.modules.home.HomeFragment;
import com.oracly.modules.signup.SignUpActivity;

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
		setContentView(R.layout.activity_login);
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
		HomeFragment.isUserLoggedIn = true;
		Intent intent = new Intent(this, HomeActivity.class);
		startActivity(intent);
		finish();
	}
	
	@Override
	public void onLoginFailed()
	{
		Toast.makeText(this, "Failed to login.", Toast.LENGTH_SHORT).show();
	}
	
	@OnClick(R.id.login_button)
	protected void onLoginButtonClicked()
	{
		String email = mLoginEmailET.getText().toString().trim();
		String password = mPasswordET.getText().toString();
		mLoginPresenter.validateLogin(email, password);
	}
	
	@OnClick(R.id.login_signup_button)
	protected void onSignUpButtonClicked()
	{
		Intent i = new Intent(this, SignUpActivity.class);
		startActivity(i);
	}
}
