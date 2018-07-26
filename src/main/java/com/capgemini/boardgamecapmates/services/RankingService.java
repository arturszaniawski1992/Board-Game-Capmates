package com.capgemini.boardgamecapmates.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.boardgamecapmates.aspect.TrackTime;
import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.dto.RankingTo;
import com.capgemini.boardgamecapmates.interfaces.RankingServiceDao;

public class RankingService implements RankingServiceDao {

	private SortRankingService sortRankingService;
	@Autowired
	public RankingService(SortRankingService sortRankingService) {
		this.sortRankingService = sortRankingService;
	}
	@TrackTime
	@Override
	public RankingTo getRanking(Long Id, List<LoginWithStatisticsTo> loginsWithStats) {
		loginsWithStats = sortRankingService.sortRankingList(loginsWithStats);
		Long positionOnList = -1L;
		for (LoginWithStatisticsTo iterator : loginsWithStats) {
			if (iterator.getUserId().equals(Id)) {
				positionOnList = (long) loginsWithStats.indexOf(iterator);
			}
		}
		return new RankingTo(loginsWithStats, positionOnList);
	}

}
