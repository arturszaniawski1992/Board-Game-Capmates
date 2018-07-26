package com.capgemini.boardgamecapmates.interfaces;

import com.capgemini.boardgamecapmates.dto.MatchTo;
import com.capgemini.boardgamecapmates.dto.PlayerStatisticsTo;

public interface CalculateStatistics {
	PlayerStatisticsTo calculateStatistic(MatchTo matchTo);
}
