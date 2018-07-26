package com.capgemini.boardgamecapmates.interfaces;

import java.util.Set;

import com.capgemini.boardgamecapmates.entity.GameEntity;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public interface UserGamesDao {

	public void deleteGame(GameEntity gameEntity);

	public void addNewGame(GameEntity gameEntity);

	/*
	 * A method to check whether a game with the given title is in the set of
	 * available games.
	 */
	/*
	 * A method that returns the game of a specific user.
	 */

	public Set<GameEntity> returnGamaesOfUser(ProfileEntity profileEntity);

	public GameEntity getGame(String name, int minimumNumberOfPlayers, int maximumNumberOfPlayers);

	public boolean isGameInSetOfGames(Set<GameEntity> games, GameEntity gameEntity);

}
