package com.capgemini.boardgamecapmates.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.interfaces.ProfileDao;
import com.capgemini.boardgamecapmates.mappers.ProfileMapper;

@Repository
public class UserDao implements ProfileDao {

	private Map<Long, ProfileEntity> players = new HashMap<>();

	@PostConstruct
	public void initializer() {

		players.put(1L, new ProfileEntity(1L, "Artur", "Artur", "1234", "ar@gmail.com", "motto", Level.BEGINNER, 0));
		players.put(2L, new ProfileEntity(2L, "Artur", "Artur", "1234", "21@gmail.com", "motto", Level.BEGINNER, 0));
		players.put(3L, new ProfileEntity(3L, "Artur", "Artur", "1234", "sda@gmail.com", "motto", Level.BEGINNER, 0));
		players.put(4L, new ProfileEntity(4L, "Artur", "Artur", "1234", "xcv@gmail.com", "motto", Level.BEGINNER, 0));
		players.put(5L, new ProfileEntity(5L, "Artur", "Artur", "1234", "qqw@gmail.com", "motto", Level.BEGINNER, 0));
		players.put(6L, new ProfileEntity(6L, "Artur", "Artur", "1234", "eer@gmail.com", "motto", Level.BEGINNER, 0));
		players.put(7L, new ProfileEntity(7L, "Artur", "Artur", "1234", "tv@gmail.com", "motto", Level.BEGINNER, 0));

	}

	public Map<Long, ProfileEntity> getPlayers() {
		return players;
	}

	public void setPlayers(Map<Long, ProfileEntity> players) {
		this.players = players;
	}

	@Override
	public void update(UpdateProfilTo updateProfilTo) {

		ProfileEntity profileEntity = players.get(updateProfilTo.getId());
		profileEntity.setLogin(updateProfilTo.getLogin());
		profileEntity.setFirstname(updateProfilTo.getFirstname());
		profileEntity.setMail(updateProfilTo.getMail());
		profileEntity.setMotto(updateProfilTo.getMotto());
		profileEntity.setPoints(updateProfilTo.getPoints());
		players.replace(profileEntity.getId(), profileEntity);

	}

	
	@Override
	public Long getIdByEmail(String email) {
		for (ProfileEntity player : players.values()) {
			if (player.getMail().equals(email)) {
				return player.getId();
			}
		}
		return null;
	}

	@Override
	public void add(ProfileTo profileTo) {
		ProfileEntity profileEntity = ProfileMapper.mapEntity(profileTo);
		players.put(profileEntity.getId(), profileEntity);
	}

	@Override
	public ProfileTo get(Long id) {
		return ProfileMapper.mapTo(players.get(id));
	}

	public Map<Long, ProfileEntity> getProfiles() {
		return players;
	}

	public void setProfiles(Map<Long, ProfileEntity> profiles) {
		this.players = profiles;
	}

	@Override
	public void add(ProfileEntity profileEntity) {
		players.put(profileEntity.getId(), profileEntity);
	}



}
