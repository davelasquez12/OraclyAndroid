package com.oracly.models.game_info;

/**
 * Created by David on 7/29/2017.
 */

public class League
{
	private int mLeagueId;
	private String mLeagueName;
	
	public League() {}
	
	public League(int leagueId, String leagueName)
	{
		mLeagueId = leagueId;
		mLeagueName = leagueName;
	}
	
	public int getLeagueId()
	{
		return mLeagueId;
	}
	
	public void setLeagueId(int leagueId)
	{
		mLeagueId = leagueId;
	}
	
	public String getLeagueName()
	{
		return mLeagueName;
	}
	
	public void setLeagueName(String leagueName)
	{
		mLeagueName = leagueName;
	}
}
