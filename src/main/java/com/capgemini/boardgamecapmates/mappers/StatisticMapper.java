package com.capgemini.boardgamecapmates.mappers;

import org.springframework.stereotype.Component;

import com.capgemini.boardgamecapmates.dto.StatisticsTo;
import com.capgemini.boardgamecapmates.entity.StatisticEntity;

@Component
public class StatisticMapper {

	/*
	 * Mapper used to convert Entities to TO-supports sections Statics and
	 * rankings.
	 */
	public static StatisticEntity map(StatisticsTo statisticsTo) {
		return new StatisticEntity(statisticsTo.getId(), statisticsTo.getLevel(), statisticsTo.getPoints());
	}

	/*
	 * Mapper used to convert TO to Entities-supports sections Statics and
	 * rankings.
	 */
	public static StatisticsTo map(StatisticEntity statisticEntity) {
		return new StatisticsTo(statisticEntity.getId(), statisticEntity.getLevel(), statisticEntity.getPoints());
	}

}
