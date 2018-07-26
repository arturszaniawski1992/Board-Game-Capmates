package com.capgemini.boardgamecapmates.interfaces;

import java.util.Map;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;

public interface ProfileDao {

	void update(UpdateProfilTo updateProfileTo);

	public void add(ProfileTo profileTo);

	public ProfileTo get(Long id);

	public Map<Long, ProfileEntity> getProfiles();

	public void setProfiles(Map<Long, ProfileEntity> profiles);

	public void add(ProfileEntity profileEntity);

	public Long getIdByEmail(String email);

}
