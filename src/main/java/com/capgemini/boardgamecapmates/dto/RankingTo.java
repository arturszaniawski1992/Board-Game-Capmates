package com.capgemini.boardgamecapmates.dto;

import java.util.List;

public class RankingTo {
	private List<LoginWithStatisticsTo> loginsWithStatistics;
	private Long userPositionOnList;

	public RankingTo(List<LoginWithStatisticsTo> loginsWithStatistics, Long userPositionOnList) {
		this.loginsWithStatistics = loginsWithStatistics;
		this.userPositionOnList = userPositionOnList;
	}

	public List<LoginWithStatisticsTo> getLoginsWithStatistics() {
		return loginsWithStatistics;
	}

	public void setLoginsWithStatistics(List<LoginWithStatisticsTo> loginsWithStatistics) {
		this.loginsWithStatistics = loginsWithStatistics;
	}

	public Long getUserPositionOnList() {
		return userPositionOnList;
	}

	public void setUserPositionOnList(Long userPositionOnList) {
		this.userPositionOnList = userPositionOnList;
	}

}
