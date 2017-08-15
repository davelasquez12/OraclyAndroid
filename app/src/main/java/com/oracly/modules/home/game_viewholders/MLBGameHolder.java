package com.oracly.modules.home.game_viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.oracly.models.game_models.Game;
import com.oracly.models.game_models.MLBGame;
import com.oracly.tools.GameColorSelector;

/**
 * Created by David on 8/14/2017.
 */

public class MLBGameHolder extends GameHolder
{
	public MLBGameHolder(View itemView)
	{
		super(itemView);
	}
	
	@Override
	public void bindGameData(Game game, Context context, GameColorSelector colorSelector)
	{
		mGame = game;
		MLBGame mlbGame = (MLBGame) game;
		
		
	}
}
