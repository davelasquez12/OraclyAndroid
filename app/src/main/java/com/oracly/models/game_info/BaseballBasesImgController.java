package com.oracly.models.game_info;

import com.oracly.R;

import java.util.HashMap;

/**
 * Created by David on 7/31/2017.
 */

public abstract class BaseballBasesImgController
{
	private static final HashMap<String, Integer> BASES_IMAGE_MAP = new HashMap<>();
	static {
		BASES_IMAGE_MAP.put("000", R.drawable.baseball_bases_empty);
		BASES_IMAGE_MAP.put("100", R.drawable.baseball_bases_1st);
		BASES_IMAGE_MAP.put("010", R.drawable.baseball_bases_2nd);
		BASES_IMAGE_MAP.put("001", R.drawable.baseball_bases_3rd);
		BASES_IMAGE_MAP.put("110", R.drawable.baseball_bases_1st_2nd);
		BASES_IMAGE_MAP.put("011", R.drawable.baseball_bases_2nd_3rd);
		BASES_IMAGE_MAP.put("101", R.drawable.baseball_bases_1st_3rd);
		BASES_IMAGE_MAP.put("111", R.drawable.baseball_bases_loaded);
	}
	
	public static int getImageDrawableKey(String baseStatus)
	{
		return BASES_IMAGE_MAP.get(baseStatus);
	}
}
