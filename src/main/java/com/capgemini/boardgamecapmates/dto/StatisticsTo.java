package com.capgemini.boardgamecapmates.dto;

import com.capgemini.boardgamecapmates.enums.Level;

public class StatisticsTo {
	private Long id;
	private Level level;
	private double points;

	public StatisticsTo(Long id, Level level, double points) {
		this.id = id;
		this.level = level;
		this.points = points;
	}

	public Long getId() {
		return id;
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
