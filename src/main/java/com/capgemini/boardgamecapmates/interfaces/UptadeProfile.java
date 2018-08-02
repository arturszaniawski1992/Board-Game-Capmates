package com.capgemini.boardgamecapmates.interfaces;

import java.util.List;
import java.util.Map;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public interface UptadeProfile {

	/*
	 * The method updating the player's profile.
	 * 
	 * @param transport object of updateProfile with parametrs of profile.
	 */
	void updateProfile(UpdateProfilTo updateProfileTo);

	public Long getIdByEmail(String email);

	public void add(ProfileTo profileTo);

	public ProfileTo get(Long id);

	public Map<Long, ProfileEntity> getPlayers();
	
	public List<ProfileTo> getPlayersList();

	public void removeByid(Long id);

	public List<ProfileTo> findProfileByParameters(ProfileTo profileTo);

}
