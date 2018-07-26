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

	public Set<GameEntity> getGames() {
		return games;
	}

	public void setGames(Set<GameEntity> games) {
		this.games = games;
	}

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

	@Override
	public void deleteGame(GameEntity gameEntity) {
		games.remove(gameEntity);
	}

	@Override
	public void addNewGame(GameEntity gameEntity) {
		games.add(gameEntity);
	}

	/*
	 * public Set<GameEntity> returnListGame(UserEntity user) throws Exception {
	 * if (user.getId() == 1) { return listGameUserOne; } else if (user.getId()
	 * == 2) { return listGameUserTwo; } else if (user.getId() == 3) { return
	 * listGameUserThree; } else throw new Exception(
	 * "This user don't have list of games."); }
	 * 
	 * public Set<GameEntity> deleteGame(UserEntity user, GameEntity game)
	 * throws Exception { Set<GameEntity> setGame = returnListGame(user); for
	 * (GameEntity gm : setGame) { if (game.getName().equals(gm.getName()))
	 * setGame.remove(game); } return setGame; }
	 * 
	 * public Set<GameEntity> addNewGame(UserEntity user, GameEntity game)
	 * throws Exception {
	 * 
	 * Set<GameEntity> setGame = returnListGame(user); int count = 0; for
	 * (GameEntity gm : setGame) { if (gm.getName().equals(game.getName())) {
	 * setGame.add(game); break; } else { ++count; } } if (count ==
	 * setGame.size()) { GameEntity newGame = new GameEntity("Chinese", 5);
	 * setGame.add(game); } return setGame;
	 */

}