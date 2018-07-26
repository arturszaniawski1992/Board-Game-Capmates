package com.capgemini.boardgamecapmates.dto;

import com.capgemini.boardgamecapmates.enums.Level;

public class LoginWithStatisticsTo {
	private Long userId;
	private String login;
	private Level level;
	private double points;

	public LoginWithStatisticsTo(Long userId, String login, Level level, double points) {
		super();
		this.userId = userId;
		this.login = login;
		this.level = level;
		this.points = points;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
