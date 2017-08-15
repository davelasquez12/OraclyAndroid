package com.oracly.modules.home.nav_drawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oracly.R;
import com.oracly.models.game_info.LeagueInfo;
import com.squareup.picasso.Picasso;

/**
 * Created by David on 8/14/2017.
 */

public class NavDrawerRecyclerViewAdapter extends RecyclerView.Adapter<LeagueItemHolder>
{
	@Override
	public LeagueItemHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		LayoutInflater inflater = LayoutInflater.from(parent.getContext());
		View view = inflater.inflate(R.layout.list_league_nav_drawer_item, parent, false);
		return new LeagueItemHolder(view);
	}
	
	@Override
	public void onBindViewHolder(LeagueItemHolder holder, int position)
	{
		Picasso.with(holder.getContext())
				.load(LeagueInfo.LEAGUE_ICON_SRC_LIST_NAV_DRAWER[position])
				.into(holder.mLeagueIconImageView);
		
		holder.mLeagueTextView.setText(LeagueInfo.LEAGUE_NAME_LIST_NAV_DRAWER[position]);
	}
	
	@Override
	public int getItemCount()
	{
		return LeagueInfo.LEAGUE_NAME_LIST_NAV_DRAWER.length;
	}
}
