package com.oracly.modules.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;

import com.oracly.R;
import com.oracly.modules.home.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by David on 8/3/2017.
 */

public class SignUpActivity extends AppCompatActivity
{
	@BindView(R.id.signup_username_edittext) protected TextInputEditText mUsernameET;
	@BindView(R.id.signup_email_edit_text) protected TextInputEditText mEmailET;
	@BindView(R.id.signup_password_edit_text) protected TextInputEditText mPasswordET;
	@BindView(R.id.signup_confirm_email_edit_text) protected TextInputEditText mConfirmEmailET;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		ButterKnife.bind(this);
	}
	
	@OnClick(R.id.signup_create_account_button)
	protected void onCreateAccountBtnClicked()
	{
		Intent intent = new Intent(this, HomeActivity.class);
		intent.putExtra("new_account_created", true);
		startActivity(intent);
		finish();
	}
}
