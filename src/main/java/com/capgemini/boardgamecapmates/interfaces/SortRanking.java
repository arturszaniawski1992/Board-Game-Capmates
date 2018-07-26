package com.capgemini.boardgamecapmates.interfaces;

import java.util.List;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;

public interface SortRanking {
	List<LoginWithStatisticsTo> sortRankingList(List<LoginWithStatisticsTo> loginsWithStats);

}
