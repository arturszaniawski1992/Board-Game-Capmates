package com.capgemini.boardgamecapmates.statistics;

public class StatisticsEntity {
	private int points;
	private int position;
	private long id;

	public StatisticsEntity(int points, int position, long id) {
		super();
		this.points = points;
		this.position = position;
		this.id = id;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
