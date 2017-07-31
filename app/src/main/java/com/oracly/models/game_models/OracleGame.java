package com.oracly.models.game_models;

import com.oracly.models.oracle_models.Oracle;

import java.util.List;

/**
 * Created by David on 7/29/2017.
 */

/*This class is used when a user makes the first oracle (prediction) on a game. The game id is assigned and a list
  is created to store all the user's oracles for this game.*/
public class OracleGame
{
	private String mGameId;
	private List<Oracle> mOracleList;
	
	public OracleGame() {}
	
	public OracleGame(String gameId, List<Oracle> oracleList)
	{
		mGameId = gameId;
		mOracleList = oracleList;
	}
	
	public String getGameId()
	{
		return mGameId;
	}
	
	public void setGameId(String gameId)
	{
		mGameId = gameId;
	}
	
	public List<Oracle> getOracleList()
	{
		return mOracleList;
	}
	
	public void setOracleList(List<Oracle> oracleList)
	{
		mOracleList = oracleList;
	}
}
