package com.oracly.base;


public interface Mvp
{
	interface View
	{
		void showProgressBar();
		void hideProgressBar();
		void showInternetError();
		boolean isInternetAvailable();
		void closeSoftKeyboard();
	}
	
	interface Model
	{
		
	}
	
	interface Presenter<V>
	{
		void takeView(V View);
		boolean hasView();
		V getView();
	}
}
