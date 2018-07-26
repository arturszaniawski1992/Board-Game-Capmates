package com.capgemini.boardgamecapmates.interfaces;

import java.util.Set;

import com.capgemini.boardgamecapmates.entity.GameEntity;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public interface UserGamesDao {
	/*
	 * A method to remove a game from a set of games.
	 */
	public void deleteGame(GameEntity gameEntity);

	/*
	 * A method that adds a game to the game collection.
	 */
	public void addNewGame(GameEntity gameEntity);

	/*
	 * Gets the set of games.
	 * 
	 * @return A set representing the avaiable games.
	 */
	public Set<GameEntity> returnGamaesOfUser(ProfileEntity profileEntity);

	/*
	 * The method that returns the game based on its name and the maximum and
	 * minimum number of players.
	 */
	public GameEntity getGame(String name, int minimumNumberOfPlayers, int maximumNumberOfPlayers);

	/*
	 * A method to check whether a given game is in a set of existing games.
	 */
	public boolean isGameInSetOfGames(Set<GameEntity> games, GameEntity gameEntity);

}
