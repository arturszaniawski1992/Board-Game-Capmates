package com.capgemini.boardgamecapmates.dao;

import com.capgemini.boardgamecapmates.player.Level;

public class LoginWithStatistics {
	private Long Id;
	private String login;
	private Level level;
	private double points;
	
	public LoginWithStatistics(Long id, String login, Level level, double points) {
		super();
		Id = id;
		this.login = login;
		this.level = level;
		this.points = points;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
