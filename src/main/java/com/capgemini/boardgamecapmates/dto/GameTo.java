package com.capgemini.boardgamecapmates.dto;

import java.util.List;

import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public class GameTo {

	private String name;
	private int minimumNumberOfPlayers;
	private int maximumNumberOfPlayers;
	private List<ProfileEntity> playersWhoOwnGame;

	public GameTo(String name, int minimumNumberOfPlayers, int maximumNumberOfPlayers,
			List<ProfileEntity> playersWhoOwnGame) {
		super();
		this.name = name;
		this.minimumNumberOfPlayers = minimumNumberOfPlayers;
		this.maximumNumberOfPlayers = maximumNumberOfPlayers;
		this.playersWhoOwnGame = playersWhoOwnGame;
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

	public List<ProfileEntity> getPlayersWhoOwnGame() {
		return playersWhoOwnGame;
	}

	public void setPlayersWhoOwnGame(List<ProfileEntity> playersWhoOwnGame) {
		this.playersWhoOwnGame = playersWhoOwnGame;
	}

}
