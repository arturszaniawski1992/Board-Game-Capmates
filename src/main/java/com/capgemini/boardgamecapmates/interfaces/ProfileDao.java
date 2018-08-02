package com.capgemini.boardgamecapmates.interfaces;

import java.util.List;
import java.util.Map;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public interface ProfileDao {
	/*
	 * A method for updating profiles and their attributes.
	 * 
	 * @param updateProfileTo as new profile.
	 */
	void update(UpdateProfilTo updateProfileTo);

	/*
	 * A method that adds a user to the list of users.
	 * 
	 * @param updateProfileTo as new profile.
	 */
	public void add(ProfileTo profileTo);

	/*
	 * The method that returns the user after his individual ID.
	 * 
	 * @return profileTo as profile of player.
	 */
	public ProfileTo get(Long id);

	/*
	 * The method used to read the list of users.
	 * 
	 * @return a map of players.
	 */
	public Map<Long, ProfileEntity> getProfiles();

	/*
	 * A method that returns a map of user profiles.
	 * 
	 * @param profiles map of players with id.
	 */
	public void setProfiles(Map<Long, ProfileEntity> profiles);

	/*
	 * A method for adding user profiles.
	 * 
	 * @param profileEntity as a profile of player.
	 */
	public void add(ProfileEntity profileEntity);

	/*
	 * A method for finding a user and his ID using email.
	 * 
	 * @param String email
	 */
	public Long getIdByEmail(String email);

	public void removeById(Long id);


}
