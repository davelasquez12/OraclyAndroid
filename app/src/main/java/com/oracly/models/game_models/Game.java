package com.oracly.models.game_models;

import com.oracly.models.game_info.GameStatus;
import com.oracly.models.game_info.League;

import org.joda.time.DateTime;

/**
 * Created by David on 7/29/2017.
 */

public abstract class Game
{
	private GameStatus mGameStatus;
	private League mLeague;
	private int mGameId;
	private DateTime mGameDate;
	private String mGameDateHyphensUTC; //Formatted as: "yyyy-MM-dd"
	private String mGameDateTimeUTC;	//Shows the datetime in the format: "yyyy-MM-dd'T'HH:mm'Z'"
	private int mTotalUsersWhoPredicted;
	private int mTotalPredictions;
	//@Exclude //Uncomment when Firebase is setup
	private OracleGame mOracleGame;
	
	public Game() {}
	
	public Game(int gameId, GameStatus gameStatus, League league , DateTime gameDate,
				String gameDateTimeUTC, String gameDateHyphensUTC)
	{
		mGameId = gameId;
		mGameStatus = gameStatus;
		mLeague = league;
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
	
	public int getTotalUsersWhoPredicted()
	{
		return mTotalUsersWhoPredicted;
	}
	
	public void setTotalUsersWhoPredicted(int totalUsersWhoPredicted)
	{
		mTotalUsersWhoPredicted = totalUsersWhoPredicted;
	}
	
	public int getTotalPredictions()
	{
		return mTotalPredictions;
	}
	
	public void setTotalPredictions(int totalPredictions)
	{
		mTotalPredictions = totalPredictions;
	}
	
	public OracleGame getOracleGame()
	{
		return mOracleGame;
	}
	
	public void setOracleGame(OracleGame oracleGame)
	{
		mOracleGame = oracleGame;
	}
}
