package com.capgemini.boardgamecapmates.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.interfaces.SortRanking;
@Service
public class SortRankingService implements SortRanking {
	/*
	 * Sorting method for the Ranking List.
	 */
	@Override
	public List<LoginWithStatisticsTo> sortRankingList(List<LoginWithStatisticsTo> loginsWithStats) {

		Collections.sort(loginsWithStats, Comparator.comparing(LoginWithStatisticsTo::getLevel)
				.thenComparing(LoginWithStatisticsTo::getPoints).reversed());
		return loginsWithStats;
	}

}
