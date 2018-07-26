package com.capgemini.boardgamecapmates.dto;

public class PlayerStatisticsTo {
	private StatisticsTo playerStatistics;

	public PlayerStatisticsTo(StatisticsTo playerStatistics) {
		super();
		this.playerStatistics = playerStatistics;
	}

	public StatisticsTo getPlayerStatistics() {
		return playerStatistics;
	}

	public void setPlayerStatistics(StatisticsTo playerStatistics) {
		this.playerStatistics = playerStatistics;
	}

}
