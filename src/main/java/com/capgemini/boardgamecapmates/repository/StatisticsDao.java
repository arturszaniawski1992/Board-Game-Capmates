package com.capgemini.boardgamecapmates.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.capgemini.boardgamecapmates.dto.StatisticsTo;
import com.capgemini.boardgamecapmates.entity.StatisticEntity;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.interfaces.StatisticDao;
import com.capgemini.boardgamecapmates.mappers.StatisticMapper;

@Repository
public class StatisticsDao implements StatisticDao {
	private Map<Long, StatisticEntity> statistics = new HashMap<>();

	public Map<Long, StatisticEntity> getStatistics() {
		return statistics;
	}

	@PostConstruct
	public void initializer() {

		StatisticEntity s1 = new StatisticEntity(1L, Level.BEGINNER, 0.0);
		StatisticEntity s2 = new StatisticEntity(2L, Level.BEGINNER, 0.0);
		StatisticEntity s3 = new StatisticEntity(3L, Level.BEGINNER, 0.0);
		StatisticEntity s4 = new StatisticEntity(4L, Level.BEGINNER, 0.0);
		StatisticEntity s5 = new StatisticEntity(5L, Level.BEGINNER, 0.0);
		StatisticEntity s6 = new StatisticEntity(6L, Level.BEGINNER, 0.0);
		StatisticEntity s7 = new StatisticEntity(7L, Level.BEGINNER, 0.0);

		statistics.put(1L, s1);
		statistics.put(2L, s2);
		statistics.put(3L, s3);
		statistics.put(4L, s4);
		statistics.put(5L, s5);
		statistics.put(6L, s6);
		statistics.put(7L, s7);

	}

	public void setStatistics(Map<Long, StatisticEntity> statistics) {
		this.statistics = statistics;
	}

	@Override
	public void update(StatisticsTo statisticsTo) {
		StatisticEntity statisticsEntity = statistics.get(statisticsTo.getId());
		statisticsEntity.setLevel(statisticsTo.getLevel());
		statisticsEntity.setPoints(statisticsTo.getPoints());
		statistics.replace(statisticsEntity.getId(), statisticsEntity);

	}

	@Override
	public void add(StatisticsTo statisticsTo) {
		StatisticEntity statisticEntity = StatisticMapper.map(statisticsTo);
		statistics.put(statisticEntity.getId(), statisticEntity);
	}

	@Override
	public void add(StatisticEntity statisticsEntity) {
		StatisticsTo statisticsTo = StatisticMapper.map(statisticsEntity);
		statistics.put(statisticsTo.getId(), statisticsEntity);
	}

}
