package com.capgemini.boardgamecapmates.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public class UsersMapper {

	public ProfileTo convertToDTO(ProfileEntity profileEntity) {
		ProfileTo profileTo = new ProfileTo();

		profileTo.setId(profileEntity.getId());
		profileTo.setLogin(profileEntity.getLogin());
		profileTo.setFirstname(profileEntity.getFirstname());
		profileTo.setPassword(profileEntity.getPassword());
		profileTo.setMail(profileEntity.getMail());
		profileTo.setMotto(profileEntity.getMotto());
		profileTo.setLevel(profileEntity.getLevel());
		profileTo.setPoints(profileEntity.getPoints());

		return profileTo;
	}

	public List<ProfileTo> convertListToDTOList(List<ProfileEntity> players) {
		return players.stream().map(c -> convertToDTO(c)).collect(Collectors.toList());
	}

}
