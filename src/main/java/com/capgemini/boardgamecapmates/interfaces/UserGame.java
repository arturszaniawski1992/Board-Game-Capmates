package com.capgemini.boardgamecapmates.interfaces;

import java.util.Set;

import com.capgemini.boardgamecapmates.entity.GameEntity;

public interface UserGame {

	public void addGame();

	public void removeGame();

	public Set<GameEntity> showGamesOfUser();

}
