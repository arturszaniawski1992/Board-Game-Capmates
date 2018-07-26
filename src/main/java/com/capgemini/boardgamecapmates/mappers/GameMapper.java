package com.capgemini.boardgamecapmates.mappers;

import org.springframework.stereotype.Component;

import com.capgemini.boardgamecapmates.dto.GameTo;
import com.capgemini.boardgamecapmates.entity.GameEntity;

@Component
public class GameMapper {

	public static GameEntity mapTo(GameTo gameTo) {

		return new GameEntity(gameTo.getName(), gameTo.getMinimumNumberOfPlayers(), gameTo.getMaximumNumberOfPlayers(),
				gameTo.getPlayersWhoOwnGame());
	}

	public static GameTo mapEntity(GameEntity gameEntity) {
		return new GameTo(gameEntity.getName(), gameEntity.getMinimumNumberOfPlayers(),
				gameEntity.getMaximumNumberOfPlayers(), gameEntity.getUsersWhoOwnsGame());
	}
}
