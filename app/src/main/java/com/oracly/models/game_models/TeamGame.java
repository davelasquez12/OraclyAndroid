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
	
	public TeamGame() {}
	
	public TeamGame(Team homeTeam, Team awayTeam, League league, GameStatus gameStatus, int gameId,
					DateTime gameDate, String gameDateTimeUTC, String gameDateHyphensUTC)
	{
		super(gameStatus, league, gameId, gameDate, gameDateTimeUTC, gameDateHyphensUTC);
		mHomeTeam = homeTeam;
		mAwayTeam = awayTeam;
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
}
