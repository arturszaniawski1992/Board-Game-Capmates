package com.capgemini.boardgamecapmates.controller.exceptions;

public class NonExistingPlayerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonExistingPlayerException() {
		System.out.println("There is no player with these parameters!");
	}

}
