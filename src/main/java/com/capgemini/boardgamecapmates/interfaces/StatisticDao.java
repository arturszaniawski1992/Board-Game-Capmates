package com.capgemini.boardgamecapmates.interfaces;

import com.capgemini.boardgamecapmates.dto.StatisticsTo;
import com.capgemini.boardgamecapmates.entity.StatisticEntity;

public interface StatisticDao {
	/*
	 * Stats updating method.
	 * @param transport object of actual statistics.
	 */
	void update(StatisticsTo statisticsTo);

	/*
	 * A method that adds statistics.
	 * @param transport object of actual statistics.
	 */
	void add(StatisticsTo statisticsTo);

	/*
	 * A method that adds statistics.
	 * @param Entit of actual statistics.
	 */
	void add(StatisticEntity statisticsEntity);

}
