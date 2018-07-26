package com.capgemini.boardgamecapmates.interfaces;

import java.util.List;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;

public interface SortRanking {
	
	/*
	 * A sorting method for cur list rent results and statistics for players.
	 * @param list of actual statistics of players.
	 */
	public List<LoginWithStatisticsTo> sortRankingList(List<LoginWithStatisticsTo> loginsWithStats);

}
