package com.oracly.models.game_info;

import android.util.SparseArray;

import com.oracly.R;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by David on 7/29/2017.
 */

public abstract class LeagueInfo
{
	//Used to generate the proper views in the game list recycler views
	public final static int DATE_HEADER_ID = 0;
	public final static int HEADER_ID = 1;
	
	//League IDs
	//public final static int NFL_ID = 10;
	public final static int NBA_ID = 11;
	public final static int MLB_ID = 12;
	//public final static int NHL_ID = 13;
	
	
	//League Names
	public final static String NBA_LEAGUE_NAME = "NBA";
	public final static String MLB_LEAGUE_NAME = "MLB";
	
	//Used only for the league list displayed in the Home Navigation Drawer Fragment. These two
	//arrays must correspond with league name to league icon.
	public final static String[] LEAGUE_NAME_LIST_NAV_DRAWER = {"NBA", "MLB"};
	public final static int[] LEAGUE_ICON_SRC_LIST_NAV_DRAWER = {R.drawable.nba_logo, R.drawable.mlb_logo};
	
	private final static SparseArray<String> LEAGUE_ID_NAME_MAP = new SparseArray<>();
	static
	{
		LEAGUE_ID_NAME_MAP.put(NBA_ID, NBA_LEAGUE_NAME);
		LEAGUE_ID_NAME_MAP.put(MLB_ID, MLB_LEAGUE_NAME);
	}
	
	private final static Map<String, Integer> LEAGUE_NAME_MAP = new HashMap<>();
	static
	{
		LEAGUE_NAME_MAP.put(NBA_LEAGUE_NAME, NBA_ID);
		LEAGUE_NAME_MAP.put(MLB_LEAGUE_NAME, MLB_ID);
	}
	
	public final static int NUM_LEAGUES = LEAGUE_ID_NAME_MAP.size();
	
	public static String getLeagueNameFromId(int id)
	{
		return LEAGUE_ID_NAME_MAP.get(id);
	}
	
	public static int getLeagueIdFromName(String leagueName)
	{
		return LEAGUE_NAME_MAP.get(leagueName);
	}
}
