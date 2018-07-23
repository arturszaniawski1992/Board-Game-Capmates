package com.capgemini.boardgamecapmates.player;

public enum Level {

	BEGINNER(1), AMATEUR(2), NOVICE(3), PROFESSIONAL(4), WORLD_CLASS(5), LEGENDARY(6);

	private final int value;

	private Level(int value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public static Level getLevelByValue(int value) {
		for (Level level : Level.values()) {
			if (level.getValue() == value)
				return level;

		}
		return null;
	}

}
