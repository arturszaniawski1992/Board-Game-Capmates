package com.capgemini.boardgamecapmates.interfaces;

import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;

public interface UptadeProfile {

	/*
	 * The method updating the player's profile.
	 * 
	 * @param transport object of updateProfile with parametrs of profile.
	 */
	void updateProfile(UpdateProfilTo updateProfileTo);

}
