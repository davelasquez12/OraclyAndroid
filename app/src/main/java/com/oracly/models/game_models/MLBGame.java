package com.oracly.models.game_models;

import com.oracly.models.game_info.GameStatus;
import com.oracly.models.game_info.League;

import org.joda.time.DateTime;

/**
 * Created by David on 7/29/2017.
 */

public class MLBGame extends TeamGame
{
	private String mInning, mNumOutsStr, mPlayoffHeader;
	private String mBasesStatus;	//E.g. baserunner on 1st ("100"), baserunners on 2nd and 3rd ("011"), bases are loaded("111"), bases are empty ("000"), etc
	private Boolean mIsHomeBatting;
	
	public MLBGame() {}
	
	public MLBGame(int gameId, Team homeTeam, Team awayTeam, League league, String homeTeamScore,
				   String awayTeamScore, GameStatus gameStatus, DateTime gameDate,
				   String gameDateTimeUTC, String gameDateHyphensUTC, String inning,
				   String numOutsStr, String playoffHeader, String basesStatus, Boolean isHomeBatting)
	{
		super(gameId, homeTeam, awayTeam, league, homeTeamScore, awayTeamScore, gameStatus,
				gameDate, gameDateTimeUTC, gameDateHyphensUTC);
		
		mInning = inning;
		mNumOutsStr = numOutsStr;
		mPlayoffHeader = playoffHeader;
		mBasesStatus = basesStatus;
		mIsHomeBatting = isHomeBatting;
	}
	
	//Add @Exclude here once Firebase is added as a dependency
	public boolean isPlayoffGame()
	{
		if(mPlayoffHeader.equals(""))
			return false;
		
		return true;
	}
	
	public String getInning()
	{
		return mInning;
	}
	
	public void setInning(String inning)
	{
		mInning = inning;
	}
	
	public String getNumOutsStr()
	{
		return mNumOutsStr;
	}
	
	public void setNumOutsStr(String numOutsStr)
	{
		mNumOutsStr = numOutsStr;
	}
	
	public String getPlayoffHeader()
	{
		return mPlayoffHeader;
	}
	
	public void setPlayoffHeader(String playoffHeader)
	{
		mPlayoffHeader = playoffHeader;
	}
	
	public String getBasesStatus()
	{
		return mBasesStatus;
	}
	
	public void setBasesStatus(String basesStatus)
	{
		mBasesStatus = basesStatus;
	}
	
	public Boolean getHomeBatting()
	{
		return mIsHomeBatting;
	}
	
	public void setHomeBatting(Boolean homeBatting)
	{
		mIsHomeBatting = homeBatting;
	}
}
