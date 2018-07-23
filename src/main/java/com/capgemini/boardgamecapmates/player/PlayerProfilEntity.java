package com.capgemini.boardgamecapmates.player;

import com.capgemini.boardgamecapmates.dao.StatisticEntity;

public class PlayerProfilEntity {

	private long id;
	private String name;
	private String lastname;
	private String password;
	private String eMail;
	private String motto;
	private StatisticEntity statisticEntity;

	public PlayerProfilEntity(long id, String name, String lastname, String password, String eMail, String motto,
			StatisticEntity statisticEntity) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.password = password;
		this.eMail = eMail;
		this.motto = motto;
		this.statisticEntity = statisticEntity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public StatisticEntity getStatisticEntity() {
		return statisticEntity;
	}

	public void setStatisticEntity(StatisticEntity statisticEntity) {
		this.statisticEntity = statisticEntity;
	}

}