package com.capgemini.boardgamecapmates.game;

public class Game {

	private String gameName;
	private int numberOfPlayers;

	public Game(String gameName, int numberOfPlayers) {
		super();
		this.gameName = gameName;
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

}
