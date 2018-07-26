package com.capgemini.boardgamecapmates.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.interfaces.ProfileDao;
import com.capgemini.boardgamecapmates.interfaces.UptadeProfile;

public class UpdateProfileService implements UptadeProfile {

	private ProfileDao profile;

	@Autowired
	public UpdateProfileService(ProfileDao profile) {
		this.profile = profile;
	}

	@Override
	public void updateProfile(UpdateProfilTo updateProfileTo) {
		profile.update(updateProfileTo);
	}

}
