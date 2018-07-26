package com.capgemini.boardgamecapmates.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.capgemini.boardgamecapmates.aspect.TrackTime;
import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.interfaces.SortRanking;

public class SortRankingService implements SortRanking {
	@TrackTime
	@Override
	public List<LoginWithStatisticsTo> sortRankingList(List<LoginWithStatisticsTo> loginsWithStats) {

		Collections.sort(loginsWithStats, Comparator.comparing(LoginWithStatisticsTo::getLevel)
				.thenComparing(LoginWithStatisticsTo::getPoints).reversed());
		return loginsWithStats;
	}

}
