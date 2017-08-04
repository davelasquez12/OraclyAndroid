package com.oracly.modules.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.oracly.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by David on 8/3/2017.
 */

public class SignUpActivity extends AppCompatActivity
{
	@InjectView(R.id.signup_username_edittext) protected EditText mUsernameET;
	@InjectView(R.id.signup_email_edit_text) protected EditText mEmailET;
	@InjectView(R.id.signup_password_edit_text) protected EditText mPasswordET;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		ButterKnife.inject(this);
	}
	
	@OnClick(R.id.signup_create_account_button)
	protected void onCreateAccountBtnClicked()
	{
		
	}
}
