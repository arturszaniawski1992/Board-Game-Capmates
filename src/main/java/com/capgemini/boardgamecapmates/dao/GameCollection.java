package com.capgemini.boardgamecapmates.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.boardgamecapmates.game.Game;

public class GameCollection {

	private List<Game> gameList = new ArrayList<>();

	public GameCollection(List<Game> gameList) {
		super();
		this.gameList = gameList;
	}

	public List<Game> getGameList() {
		return gameList;
	}

}
