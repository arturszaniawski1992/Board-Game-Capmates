package com.capgemini.boardgamecapmates.dto;

import com.capgemini.boardgamecapmates.enums.MatchStatus;

public class MatchTo {
	private Long id;
	private StatisticsTo playerStatistics;
	private MatchStatus status;

	public MatchTo() {
	}

	public MatchTo(Long id, StatisticsTo playerStatistics, MatchStatus status) {
		super();
		this.id = id;
		this.playerStatistics = playerStatistics;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatisticsTo getPlayerStatistics() {
		return playerStatistics;
	}

	public void setPlayerStatistics(StatisticsTo playerStatistics) {
		this.playerStatistics = playerStatistics;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

}
