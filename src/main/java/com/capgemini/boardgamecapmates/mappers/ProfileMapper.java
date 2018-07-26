package com.capgemini.boardgamecapmates.mappers;

import org.springframework.stereotype.Component;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

@Component
public class ProfileMapper {

	public static ProfileEntity mapEntity(ProfileTo profileTo) {
		return new ProfileEntity(profileTo.getId(), profileTo.getLogin(), profileTo.getFirstname(),
				profileTo.getPassword(), profileTo.getMail(), profileTo.getMotto(), profileTo.getLevel(),
				profileTo.getPoints());

	}

	public static ProfileTo mapTo(ProfileEntity profileEntity) {

		return new ProfileTo(profileEntity.getId(), profileEntity.getLogin(), profileEntity.getFirstname(),
				profileEntity.getPassword(), profileEntity.getMail(), profileEntity.getMotto(),
				profileEntity.getLevel(), profileEntity.getPoints());

	}

}