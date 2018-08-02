package com.capgemini.boardgamecapmates.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;
import com.capgemini.boardgamecapmates.services.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	@Autowired
	private ProfileService profileService;

	@RequestMapping(method = RequestMethod.GET)
	public Map<Long, ProfileEntity> getPlayers() {
		return profileService.getPlayers();
	}

	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public Long getIdByEmail(@PathVariable("email") String email) {
		return profileService.getIdByEmail(email);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void add(@RequestBody ProfileTo profileTo) {
		profileService.add(profileTo);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeById(@PathVariable("id") Long id) {
		profileService.removeByid(id);
	}

	@PostMapping("/find")
	public List<ProfileTo> findPlayers(@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "firstname", required = false) String firstname,
			@RequestParam(value = "points", required = false) double points) {
		ProfileTo profileTo = new ProfileTo();

		profileTo.setId(id);
		profileTo.setFirstname(firstname);
		profileTo.setPoints(points);
		List<ProfileTo> playersByParameters = profileService.findBookByParameters(profileTo);

		return playersByParameters;

	}
	
	
	
	
	
}
