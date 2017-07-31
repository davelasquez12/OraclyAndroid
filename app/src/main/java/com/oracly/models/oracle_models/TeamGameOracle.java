package com.oracly.models.oracle_models;

import com.oracly.models.game_models.TeamGame;

/**
 * Created by David on 7/29/2017.
 */

//Used for when a user submits an "oracle" (i.e., a prediction) on a specific outcome of a game.
public class TeamGameOracle extends Oracle
{
	private TeamGame mGame;
	private String mHomeTeamFinalScorePrediction, mAwayTeamFinalScorePrediction;
	
	public TeamGameOracle(int gameId, TeamGame game, String homeTeamFinalScorePrediction,
						  String awayTeamFinalScorePrediction)
	{
		mGame = game;
		mHomeTeamFinalScorePrediction = homeTeamFinalScorePrediction;
		mAwayTeamFinalScorePrediction = awayTeamFinalScorePrediction;
	}
	
	public boolean isUserFinalScorePredictionCorrect()
	{
		if(mGame.getGameStatus().isEnded())
		{
			if(mGame.getHomeTeamScore().equals(mHomeTeamFinalScorePrediction) &&
					mGame.getAwayTeamScore().equals(mAwayTeamFinalScorePrediction)){
				return true;
			}
		}
		
		return false;
	}
	
	public TeamGame getGame()
	{
		return mGame;
	}
	
	public void setGame(TeamGame game)
	{
		mGame = game;
	}
	
	public String getHomeTeamFinalScorePrediction()
	{
		return mHomeTeamFinalScorePrediction;
	}
	
	public void setHomeTeamFinalScorePrediction(String homeTeamFinalScorePrediction)
	{
		mHomeTeamFinalScorePrediction = homeTeamFinalScorePrediction;
	}
	
	public String getAwayTeamFinalScorePrediction()
	{
		return mAwayTeamFinalScorePrediction;
	}
	
	public void setAwayTeamFinalScorePrediction(String awayTeamFinalScorePrediction)
	{
		mAwayTeamFinalScorePrediction = awayTeamFinalScorePrediction;
	}
}
