package com.oracly.models.game_models;

import com.oracly.models.game_info.GameStatus;
import com.oracly.models.game_info.League;

import org.joda.time.DateTime;

/**
 * Created by David on 7/29/2017.
 */

public abstract class TeamGame extends Game
{
	private Team mHomeTeam, mAwayTeam;
	private String mHomeTeamScore, mAwayTeamScore;
	
	public TeamGame() {}
	
	public TeamGame(int gameId, Team homeTeam, Team awayTeam, League league, String homeTeamScore,
					String awayTeamScore, GameStatus gameStatus,  DateTime gameDate,
					String gameDateTimeUTC, String gameDateHyphensUTC)
	{
		super(gameId, gameStatus, league , gameDate, gameDateTimeUTC, gameDateHyphensUTC);
		mHomeTeam = homeTeam;
		mAwayTeam = awayTeam;
		mHomeTeamScore = homeTeamScore;
		mAwayTeamScore = awayTeamScore;
	}
	
	public Team getHomeTeam()
	{
		return mHomeTeam;
	}
	
	public void setHomeTeam(Team homeTeam)
	{
		mHomeTeam = homeTeam;
	}
	
	public Team getAwayTeam()
	{
		return mAwayTeam;
	}
	
	public void setAwayTeam(Team awayTeam)
	{
		mAwayTeam = awayTeam;
	}
	
	public String getHomeTeamScore()
	{
		return mHomeTeamScore;
	}
	
	public void setHomeTeamScore(String homeTeamScore)
	{
		mHomeTeamScore = homeTeamScore;
	}
	
	public String getAwayTeamScore()
	{
		return mAwayTeamScore;
	}
	
	public void setAwayTeamScore(String awayTeamScore)
	{
		mAwayTeamScore = awayTeamScore;
	}
}
