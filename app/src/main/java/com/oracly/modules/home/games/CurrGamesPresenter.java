package com.oracly.modules.home.games;

/**
 * Created by David on 7/10/2017.
 */

public class CurrGamesPresenter implements ICurrGamesPresenter
{
	//CurrGamesInteractor mCurrGamesInteractor;
	ICurrGamesRV mReyclerView;
	
	public CurrGamesPresenter(ICurrGamesRV view)
	{
		mReyclerView = view;
		//mCurrGamesInteractor = new CurrGamesInteractor();
	}
	
	@Override
	public void loadNFLGames()
	{
		
	}
	
	@Override
	public void loadNBAGames()
	{
		NBAInteractor nbaInteractor = new NBAInteractor();
		nbaInteractor.loadGames();
	}
	
	@Override
	public void loadMLBGames()
	{
		MLBInteractor mlbInteractor = new MLBInteractor();
		mlbInteractor.loadGames();
	}
}
