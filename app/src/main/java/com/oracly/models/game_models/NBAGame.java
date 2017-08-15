package com.oracly.models.game_models;

import com.oracly.models.game_info.GameStatus;
import com.oracly.models.game_info.League;

import org.joda.time.DateTime;

/**
 * Created by David on 7/29/2017.
 */

public class NBAGame extends TeamGame
{
	private String mQuarter, mTimeLeft;
	private String mPlayoffHeaderLong, mPlayoffHeaderShort;
	
	public NBAGame() {}
	
	public NBAGame(int gameId, Team homeTeam, Team awayTeam, League league, String homeTeamScore,
				   String awayTeamScore, GameStatus gameStatus, DateTime gameDate,
				   String gameDateTimeUTC, String gameDateHyphensUTC, String quarter,
				   String timeLeft, String playoffHeaderLong, String playoffHeaderShort)
	{
		super(gameId, homeTeam, awayTeam, league, homeTeamScore, awayTeamScore, gameStatus,
				gameDate, gameDateTimeUTC, gameDateHyphensUTC);
		mQuarter = quarter;
		mTimeLeft = timeLeft;
		mPlayoffHeaderLong = playoffHeaderLong;
		mPlayoffHeaderShort = playoffHeaderShort;
	}
	
	public String getQuarter()
	{
		return mQuarter;
	}
	
	public void setQuarter(String quarter)
	{
		mQuarter = quarter;
	}
	
	public String getTimeLeft()
	{
		return mTimeLeft;
	}
	
	public void setTimeLeft(String timeLeft)
	{
		mTimeLeft = timeLeft;
	}
	
	public String getPlayoffHeaderLong()
	{
		return mPlayoffHeaderLong;
	}
	
	public void setPlayoffHeaderLong(String playoffHeaderLong)
	{
		mPlayoffHeaderLong = playoffHeaderLong;
	}
	
	public String getPlayoffHeaderShort()
	{
		return mPlayoffHeaderShort;
	}
	
	public void setPlayoffHeaderShort(String playoffHeaderShort)
	{
		mPlayoffHeaderShort = playoffHeaderShort;
	}
	
	//Add @Exclude here once Firebase is added as a dependency
	public boolean isPlayoffGame()
	{
		if(mPlayoffHeaderShort.equals(""))
			return false;
		
		return true;
	}
}
