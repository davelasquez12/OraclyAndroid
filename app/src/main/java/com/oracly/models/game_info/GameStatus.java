package com.oracly.models.game_info;

/**
 * Created by David on 7/29/2017.
 */

public class GameStatus
{
	private boolean mIsLive, mIsEnded, mIsPostponed, mIsDelayed, mIsCanceled;
	private String mDescription; //used to store "Postponed", "Final", or "Final OT" for games that have ended or postponed
	
	public GameStatus() {}
	
	public GameStatus(boolean isLive, boolean isEnded, boolean isPostponed, boolean isDelayed,
					  boolean isCanceled, String description)
	{
		mIsLive = isLive;
		mIsEnded = isEnded;
		mIsPostponed = isPostponed;
		mIsDelayed = isDelayed;
		mIsCanceled = isCanceled;
		mDescription = description;
	}
	
	public boolean isLive()
	{
		return mIsLive;
	}
	
	public void setLive(boolean live)
	{
		mIsLive = live;
	}
	
	public boolean isEnded()
	{
		return mIsEnded;
	}
	
	public void setEnded(boolean ended)
	{
		mIsEnded = ended;
	}
	
	public boolean isPostponed()
	{
		return mIsPostponed;
	}
	
	public void setPostponed(boolean postponed)
	{
		mIsPostponed = postponed;
	}
	
	public boolean isDelayed()
	{
		return mIsDelayed;
	}
	
	public void setDelayed(boolean delayed)
	{
		mIsDelayed = delayed;
	}
	
	public boolean isCanceled()
	{
		return mIsCanceled;
	}
	
	public void setCanceled(boolean canceled)
	{
		mIsCanceled = canceled;
	}
	
	public String getDescription()
	{
		return mDescription;
	}
	
	public void setDescription(String description)
	{
		mDescription = description;
	}
}
