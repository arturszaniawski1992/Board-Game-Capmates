package com.capgemini.boardgamecapmates.entity;

import java.util.List;

public class GameEntity {

	private String name;
	private int minimumNumberOfPlayers;
	private int maximumNumberOfPlayers;
	private List<ProfileEntity> usersWhoOwnsGame;

	public GameEntity(String name, int minimumNumberOfPlayers, int maximumNumberOfPlayers,
			List<ProfileEntity> usersWhoOwnsGame) {
		super();
		this.name = name;
		this.minimumNumberOfPlayers = minimumNumberOfPlayers;
		this.maximumNumberOfPlayers = maximumNumberOfPlayers;
		this.usersWhoOwnsGame = usersWhoOwnsGame;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinimumNumberOfPlayers() {
		return minimumNumberOfPlayers;
	}

	public void setMinimumNumberOfPlayers(int minimumNumberOfPlayers) {
		this.minimumNumberOfPlayers = minimumNumberOfPlayers;
	}

	public int getMaximumNumberOfPlayers() {
		return maximumNumberOfPlayers;
	}

	public void setMaximumNumberOfPlayers(int maximumNumberOfPlayers) {
		this.maximumNumberOfPlayers = maximumNumberOfPlayers;
	}

	public List<ProfileEntity> getUsersWhoOwnsGame() {
		return usersWhoOwnsGame;
	}

	public void setUsersWhoOwnsGame(List<ProfileEntity> usersWhoOwnsGame) {
		this.usersWhoOwnsGame = usersWhoOwnsGame;
	}

}
