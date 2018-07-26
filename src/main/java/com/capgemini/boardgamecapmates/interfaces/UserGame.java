package com.capgemini.boardgamecapmates.interfaces;

import java.util.Set;

import com.capgemini.boardgamecapmates.entity.GameEntity;

public interface UserGame {

	public void addGame();

	/*
	 * A method to remove a game from a set of games.
	 */
	public void removeGame();

	/*
	 * Gets the set of games.
	 * 
	 * @return A set representing the available games.
	 */
	public Set<GameEntity> showGamesOfUser();

}
