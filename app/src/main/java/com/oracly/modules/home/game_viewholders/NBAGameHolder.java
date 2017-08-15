package com.oracly.modules.home.game_viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.oracly.R;
import com.oracly.models.game_info.GameStatus;
import com.oracly.models.game_models.Game;
import com.oracly.models.game_models.NBAGame;
import com.oracly.tools.GameColorSelector;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by David on 8/14/2017.
 */

public class NBAGameHolder extends GameHolder
{
	@InjectView(R.id.home_team_name) protected TextView mHomeTeam;
	@InjectView(R.id.away_team_name) protected TextView mAwayTeam;
	@InjectView(R.id.home_team_logo) protected ImageView mHomeTeamLogo;
	@InjectView(R.id.away_team_logo) protected ImageView mAwayTeamLogo;
	@InjectView(R.id.home_team_record) protected TextView mHomeTeamRecord;
	@InjectView(R.id.away_team_record) protected TextView mAwayTeamRecord;
	@InjectView(R.id.home_team_score) protected TextView mHomeTeamScore;
	@InjectView(R.id.away_team_score) protected TextView mAwayTeamScore;
	@InjectView(R.id.playoff_header_text_view) protected TextView mPlayoffHeader;
	@InjectView(R.id.playoff_header_container) protected LinearLayout mPlayoffContainer;
	@InjectView(R.id.game_start_time) protected TextView mGameStartTime;
	@InjectView(R.id.nba_quarter_time_rem_or_status) protected TextView mQuarterTimeRemOrStatus;
	@InjectView(R.id.num_comments) protected TextView mNumComments;
	@InjectView(R.id.num_oracles) protected TextView mNumOracles;
	
	
	public NBAGameHolder(View itemView)
	{
		super(itemView);
		ButterKnife.inject(this, itemView);
	}
	
	@Override
	public void bindGameData(Game game, Context context, GameColorSelector colorSelector)
	{
		mGame = game;
		NBAGame nbaGame = (NBAGame) game;
		
		mHomeTeam.setText(nbaGame.getHomeTeam().getNameShort());
		Picasso.with(context).load(nbaGame.getHomeTeam().getLogoSrc()).into(mHomeTeamLogo);
		mHomeTeamRecord.setText(nbaGame.getHomeTeam().getRecord());
		
		mAwayTeam.setText(nbaGame.getAwayTeam().getNameShort());
		Picasso.with(context).load(nbaGame.getAwayTeam().getLogoSrc()).into(mAwayTeamLogo);
		mAwayTeamRecord.setText(nbaGame.getAwayTeam().getRecord());
		
		GameStatus gameStatus = nbaGame.getGameStatus();
		
		if(gameStatus.isLive())				//game is live
		{
			if(gameStatus.isPostponed())	//Something can occur mid-game to postpone the game
			{
				
			}
		}
		else if(gameStatus.isEnded())		//game ended
		{
			
		}
		else								//game has not started
		{
			if(gameStatus.isCanceled())
			{
				
			}
			else if(gameStatus.isPostponed())
			{
				
			}
			else if(gameStatus.isDelayed())
			{
				
			}
		}
	}
}
