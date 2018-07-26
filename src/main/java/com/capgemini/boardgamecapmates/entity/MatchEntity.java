package com.capgemini.boardgamecapmates.entity;

import com.capgemini.boardgamecapmates.enums.MatchStatus;

public class MatchEntity {
	private Long playerId;
	private StatisticEntity playerStatistics;
	private MatchStatus status;
	
	public MatchEntity(Long playerId, StatisticEntity playerStatistics, MatchStatus status) {
		super();
		this.playerId = playerId;
		this.playerStatistics = playerStatistics;
		this.status = status;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public StatisticEntity getPlayerStatistics() {
		return playerStatistics;
	}

	public void setPlayerStatistics(StatisticEntity playerStatistics) {
		this.playerStatistics = playerStatistics;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	
}
