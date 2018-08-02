package com.capgemini.boardgamecapmates.dto;

public class ProfileByParametersTo {
	private long id;
	private String login;
	private double points;

	public ProfileByParametersTo(long id, String login, double points) {
		super();
		this.id = id;
		this.login = login;
		this.points = points;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

}
