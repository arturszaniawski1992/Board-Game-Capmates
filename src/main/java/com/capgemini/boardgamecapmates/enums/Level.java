package com.capgemini.boardgamecapmates.enums;


public enum Level {
	BEGINNER(0), AMATEUR(20), NOVICE(40), PROFESSIONAL(60), WORLD_CLASS(80), LEGENDARY(100);

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
