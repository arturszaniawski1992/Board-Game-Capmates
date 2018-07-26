package com.capgemini.boardgamecapmates.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.capgemini.boardgamecapmates.entity.GameEntity;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;
import com.capgemini.boardgamecapmates.interfaces.UserGamesDao;

@Repository
public class GameDao implements UserGamesDao {

	/*
	 * Constructor taking over a collection of available games.
	 */
	public GameDao() {
	}

	Set<GameEntity> games = new HashSet<>();

	@PostConstruct
	public void initializer() {

		List<ProfileEntity> adamigoUsers = null;
		List<ProfileEntity> axcelUsers = null;
		List<ProfileEntity> hobbityUsers = null;
		List<ProfileEntity> egmontUsers = null;
		List<ProfileEntity> portalUsers = null;

		GameEntity adamigo = new GameEntity("Adamigo", 2, 4, adamigoUsers);
		GameEntity axcel = new GameEntity("Adamigo", 2, 4, axcelUsers);
		GameEntity hobbity = new GameEntity("Adamigo", 2, 4, hobbityUsers);
		GameEntity egmont = new GameEntity("Adamigo", 2, 4, egmontUsers);
		GameEntity portal = new GameEntity("Adamigo", 2, 4, portalUsers);

		games.add(adamigo);
		games.add(axcel);
		games.add(hobbity);
		games.add(egmont);
		games.add(portal);

	}

	/**
	 * Gets the set of games.
	 * 
	 * @return A set representing the avaiable games.
	 */
	public Set<GameEntity> getGames() {
		return games;
	}

	public void setGames(Set<GameEntity> games) {
		this.games = games;
	}

	@Override
	public boolean isGameInSetOfGames(Set<GameEntity> games, GameEntity gameEntity) {
		for (GameEntity game : games) {
			if (game.equals(gameEntity)) {
				return true;
			}

		}
		return false;

	}

	

	@Override
	public Set<GameEntity> returnGamaesOfUser(ProfileEntity profileEntity) {
		return games;
	}

	/*
	 * A method to remove a game from a set of games.
	 */
	@Override
	public void deleteGame(GameEntity gameEntity) {
		games.remove(gameEntity);
	}

	/*
	 * A method that adds a game to the game collection.
	 */
	@Override
	public void addNewGame(GameEntity gameEntity) {
		games.add(gameEntity);
	}

	public GameEntity findGameType(GameEntity GameEntityWithName) {

		GameEntity foundGameType = games.stream().filter(x -> GameEntityWithName.getName().equals(x.getName()))
				.findFirst().orElse(null);

		return foundGameType;
	}

	/*
	 * The method that returns the game based on its name and the maximum and
	 * minimum number of players.
	 */
	@Override
	public GameEntity getGame(String name, int minimumNumberOfPlayers, int maximumNumberOfPlayers) {
		for (GameEntity game : games) {
			if (game.getName().equals(name) && game.getMinimumNumberOfPlayers() == minimumNumberOfPlayers
					&& game.getMaximumNumberOfPlayers() == maximumNumberOfPlayers) {
				return game;
			}
		}
		return null;
	}

}