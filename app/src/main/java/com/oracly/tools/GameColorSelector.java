package com.oracly.tools;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.oracly.R;

/**
 * Created by David on 8/15/2017.
 */

public class GameColorSelector
{
	private Context mContext;
	private final int mGreen, mOrange, mGray, mBlack;
	
	public GameColorSelector(Context context)
	{
		mContext = context;
		mGreen = ContextCompat.getColor(mContext, R.color.green);
		mOrange = ContextCompat.getColor(mContext, R.color.orange);
		mGray = ContextCompat.getColor(mContext, R.color.gray);
		mBlack = ContextCompat.getColor(mContext, R.color.black);
	}
	
	public int getGreen()
	{
		return mGreen;
	}
	
	public int getOrange()
	{
		return mOrange;
	}
	
	public int getGray()
	{
		return mGray;
	}
	
	public int getBlack()
	{
		return mBlack;
	}
}
