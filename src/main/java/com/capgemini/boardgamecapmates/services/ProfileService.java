package com.capgemini.boardgamecapmates.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;
import com.capgemini.boardgamecapmates.interfaces.ProfileDao;
import com.capgemini.boardgamecapmates.interfaces.UptadeProfile;
import com.capgemini.boardgamecapmates.mappers.UsersMapper;

@Service
public class ProfileService implements UptadeProfile {

	private ProfileDao profile;
	UsersMapper mapper = new UsersMapper();

	@Autowired
	public ProfileService(ProfileDao profile) {
		this.profile = profile;
	}

	/*
	 * The method used to update the player's profile.
	 */
	@Override
	public void updateProfile(UpdateProfilTo updateProfileTo) {
		profile.update(updateProfileTo);
	}

	@Override
	public Long getIdByEmail(String email) {
		return profile.getIdByEmail(email);
	}

	@Override
	public ProfileTo get(Long id) {
		return profile.get(id);
	}

	@Override
	public Map<Long, ProfileEntity> getPlayers() {
		return profile.getProfiles();
	}

	@Override
	public void add(ProfileTo profileTo) {
		profile.add(profileTo);
	}

	@Override
	public void removeByid(Long id) {
		profile.removeById(id);
	}

	@Override
	public List<ProfileTo> findBookByParameters(ProfileTo profileTo) {

		Map<Long, ProfileEntity> players = getPlayers();
		List<ProfileEntity> profiles = players.values().stream().collect(Collectors.toList());

		
		if (profileTo.getLogin() != null) {
			profiles = profiles.stream().filter(b -> b.getLogin().equals(profileTo.getLogin()))
					.collect(Collectors.toList());
		}
		if (profileTo.getFirstname() != null) {
			profiles = profiles.stream().filter(l -> l.getFirstname().equals(profileTo.getFirstname()))
					.collect(Collectors.toList());
		}
		if (profileTo.getPoints() != 0) {
			profiles = profiles.stream().filter(p -> p.getPoints() == profileTo.getPoints())
					.collect(Collectors.toList());
		}

		return mapper.convertListToDTOList(profiles);

	}

}
