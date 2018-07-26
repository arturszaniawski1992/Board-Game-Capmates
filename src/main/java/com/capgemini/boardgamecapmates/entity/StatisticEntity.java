package com.capgemini.boardgamecapmates.entity;

import com.capgemini.boardgamecapmates.enums.Level;

public class StatisticEntity {
	private Long Id;
	private Level level;
	private double points;

	public StatisticEntity(Long id, Level level, double points) {
		super();
		Id = id;
		this.level = level;
		this.points = points;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

}
