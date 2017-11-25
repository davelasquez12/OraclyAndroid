package com.oracly.modules.home.nav_drawer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.oracly.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by David on 8/14/2017.
 */

class LeagueItemHolder extends RecyclerView.ViewHolder
{
	@BindView(R.id.list_item_league_textview) TextView mLeagueTextView;
	@BindView(R.id.list_item_league_icon_imageview) ImageView mLeagueIconImageView;
	
	public LeagueItemHolder(View itemView)
	{
		super(itemView);
		ButterKnife.bind(this, itemView);
		
		itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				
			}
		});
	}
	
	Context getContext()
	{
		return this.itemView.getContext();
	}
	
	void onLeagueItemClicked()
	{
		
	}
}
