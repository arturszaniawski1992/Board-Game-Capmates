package com.capgemini.boardgamecapmates.mappers;

import org.springframework.stereotype.Component;

import com.capgemini.boardgamecapmates.dto.StatisticsTo;
import com.capgemini.boardgamecapmates.entity.StatisticEntity;

@Component
public class StatisticMapper {
	public static StatisticEntity map(StatisticsTo statisticsTo) {
		return new StatisticEntity(statisticsTo.getId(), statisticsTo.getLevel(), statisticsTo.getPoints());
	}

	public static StatisticsTo map(StatisticEntity statisticEntity) {
		return new StatisticsTo(statisticEntity.getId(), statisticEntity.getLevel(), statisticEntity.getPoints());
	}

}
