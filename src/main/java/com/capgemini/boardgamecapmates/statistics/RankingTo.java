package com.capgemini.boardgamecapmates.statistics;

import java.util.List;

import com.capgemini.boardgamecapmates.dao.LoginWithStatistics;

public class RankingTo {
	private List<LoginWithStatistics> loginWithStatistics;
	private Long userPositionInRank;
	
	public RankingTo(List<LoginWithStatistics> loginWithStatistics, Long userPositionInRank) {
		super();
		this.loginWithStatistics = loginWithStatistics;
		this.userPositionInRank = userPositionInRank;
	}

	public List<LoginWithStatistics> getLoginWithStatistics() {
		return loginWithStatistics;
	}

	public void setLoginWithStatistics(List<LoginWithStatistics> loginWithStatistics) {
		this.loginWithStatistics = loginWithStatistics;
	}

	public Long getUserPositionInRank() {
		return userPositionInRank;
	}

	public void setUserPositionInRank(Long userPositionInRank) {
		this.userPositionInRank = userPositionInRank;
	}
	
	

}
