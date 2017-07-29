package com.oracly.models.game_models;

import com.oracly.models.game_info.GameStatus;
import com.oracly.models.game_info.League;

import org.joda.time.DateTime;

/**
 * Created by David on 7/29/2017.
 */

public abstract class Game
{
	protected GameStatus mGameStatus;
	protected League mLeague;
	protected int mGameId;
	protected DateTime mGameDate;
	protected String mGameDateHyphensUTC; //Formatted as: "yyyy-MM-dd"
	protected String mGameDateTimeUTC;	//Shows the datetime in the format: "yyyy-MM-dd'T'HH:mm'Z'"
	
	public Game() {}
	
	public Game(GameStatus gameStatus, League league, int gameId, DateTime gameDate,
				String gameDateTimeUTC, String gameDateHyphensUTC)
	{
		mGameStatus = gameStatus;
		mLeague = league;
		mGameId = gameId;
		mGameDate = gameDate;
		mGameDateHyphensUTC = gameDateHyphensUTC;
		mGameDateTimeUTC = gameDateTimeUTC;
	}
	
	public GameStatus getGameStatus()
	{
		return mGameStatus;
	}
	
	public void setGameStatus(GameStatus gameStatus)
	{
		mGameStatus = gameStatus;
	}
	
	public League getLeague()
	{
		return mLeague;
	}
	
	public void setLeague(League league)
	{
		mLeague = league;
	}
	
	public int getGameId()
	{
		return mGameId;
	}
	
	public void setGameId(int gameId)
	{
		mGameId = gameId;
	}
	
	public DateTime getGameDate()
	{
		return mGameDate;
	}
	
	public void setGameDate(DateTime gameDate)
	{
		mGameDate = gameDate;
	}
	
	public String getGameDateHyphensUTC()
	{
		return mGameDateHyphensUTC;
	}
	
	public void setGameDateHyphensUTC(String gameDateHyphensUTC)
	{
		mGameDateHyphensUTC = gameDateHyphensUTC;
	}
	
	public String getGameDateTimeUTC()
	{
		return mGameDateTimeUTC;
	}
	
	public void setGameDateTimeUTC(String gameDateTimeUTC)
	{
		mGameDateTimeUTC = gameDateTimeUTC;
	}
}
