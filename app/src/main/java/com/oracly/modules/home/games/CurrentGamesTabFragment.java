package com.oracly.modules.home.games;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CurrentGamesTabFragment extends Fragment implements ICurrGamesRV
{
	private CurrGamesPresenter mPresenter;
	
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		mPresenter = new CurrGamesPresenter(this);
	}
	
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onGamesLoadedSuccess()
	{
		
	}
	
	@Override
	public void onGamesLoadedFailed()
	{
		
	}
	
	
}
