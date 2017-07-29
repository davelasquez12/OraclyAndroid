package com.oracly.models.game_models;

/**
 * Created by David on 7/29/2017.
 */

public class Team
{
	private String mNameShort;
	private String mNameLong;
	private String mLogoSrc;
	private String mScore, mRecord;
	private boolean mIsHome;
	
	public Team(String nameShort, String nameLong, String logoSrc, String score, String record, boolean isHome)
	{
		mNameShort = nameShort;
		mNameLong = nameLong;
		mLogoSrc = logoSrc;
		mScore = score;
		mRecord = record;
		mIsHome = isHome;
	}
	
	public String getNameShort()
	{
		return mNameShort;
	}
	
	public void setNameShort(String nameShort)
	{
		mNameShort = nameShort;
	}
	
	public String getNameLong()
	{
		return mNameLong;
	}
	
	public void setNameLong(String nameLong)
	{
		mNameLong = nameLong;
	}
	
	public String getLogoSrc()
	{
		return mLogoSrc;
	}
	
	public void setLogoSrc(String logoSrc)
	{
		mLogoSrc = logoSrc;
	}
	
	public String getScore()
	{
		return mScore;
	}
	
	public void setScore(String score)
	{
		mScore = score;
	}
	
	public String getRecord()
	{
		return mRecord;
	}
	
	public void setRecord(String record)
	{
		mRecord = record;
	}
	
	public boolean isHome()
	{
		return mIsHome;
	}
	
	public void setHome(boolean home)
	{
		mIsHome = home;
	}
}
