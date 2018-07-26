package com.capgemini.boardgamecapmates.entity;

import com.capgemini.boardgamecapmates.enums.MatchStatus;

public class MatchMakingEntity {

	private Long playerId;
	private StatisticEntity PlayerStatistics;
	private MatchStatus status;

	public MatchMakingEntity(Long playerId, StatisticEntity playerStatistics, MatchStatus status) {
		super();
		this.playerId = playerId;
		PlayerStatistics = playerStatistics;
		this.status = status;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public StatisticEntity getPlayerStatistics() {
		return PlayerStatistics;
	}

	public void setPlayerStatistics(StatisticEntity playerStatistics) {
		PlayerStatistics = playerStatistics;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

}
