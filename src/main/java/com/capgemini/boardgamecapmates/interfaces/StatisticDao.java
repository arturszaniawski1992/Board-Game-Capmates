package com.capgemini.boardgamecapmates.interfaces;

import com.capgemini.boardgamecapmates.dto.StatisticsTo;
import com.capgemini.boardgamecapmates.entity.StatisticEntity;

public interface StatisticDao {

	void update(StatisticsTo statisticsTo);

	void add(StatisticsTo statisticsTo);

	void add(StatisticEntity statisticsEntity);

}
