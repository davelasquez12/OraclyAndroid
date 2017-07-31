package com.oracly.modules.home.games;

/**
 * Created by David on 7/10/2017.
 */

public interface ICurrGamesRV
{
	void onGamesLoadedSuccess(/*List<Game> gameList*/);
	void onGamesLoadedFailed(/*int errorCode*/);
}
