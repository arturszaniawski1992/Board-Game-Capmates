package com.capgemini.boardgamecapmates.interfaces;

import java.util.Set;

import com.capgemini.boardgamecapmates.entity.GameEntity;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public interface UserGamesDao {

	public void deleteGame(GameEntity gameEntity);

	public void addNewGame(GameEntity gameEntity);

	public Set<GameEntity> returnGamaesOfUser(ProfileEntity profileEntity);

}
