package com.capgemini.boardgamecapmates.dao;

import com.capgemini.boardgamecapmates.player.Level;

public class StatisticEntity {
	private Long id;
	private Level level;
	private double points;

	public StatisticEntity(Long id, Level level, double points) {
		super();
		this.id = id;
		this.level = level;
		this.points = points;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
