package com.oracly.modules.home.game_viewholders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.oracly.models.game_models.Game;
import com.oracly.tools.GameColorSelector;

/**
 * Created by David on 8/14/2017.
 */

public abstract class GameHolder extends RecyclerView.ViewHolder
{
	protected Intent mIntent;
	protected Game mGame;
	
	public GameHolder(View itemView)
	{
		super(itemView);
	}
	
	public abstract void bindGameData(Game game, Context context, GameColorSelector colorSelector);
}
