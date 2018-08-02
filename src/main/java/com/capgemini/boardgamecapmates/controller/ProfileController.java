package com.capgemini.boardgamecapmates.controller;

import java.util.List;
import java.util.Map;

import org.modelmapper.spi.ErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.boardgamecapmates.controller.exceptions.NonExistingPlayerException;
import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.entity.ProfileEntity;
import com.capgemini.boardgamecapmates.services.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private ProfileService profileService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<Long, ProfileEntity> getPlayers() {
		return profileService.getPlayers();
	}

	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	@ResponseBody
	public Long getIdByEmail(@PathVariable("email") String email) {
		return profileService.getIdByEmail(email);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void add(@RequestBody ProfileTo profileTo) {
		profileService.add(profileTo);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeById(@PathVariable("id") Long id) {
		profileService.removeByid(id);
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ProfileTo>> findPlayers(@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "firstname", required = false) String firstname,
			@RequestParam(value = "points", required = false) double points) throws NonExistingPlayerException {
		ProfileTo profileTo = new ProfileTo();

		profileTo.setId(id);
		profileTo.setFirstname(firstname);
		profileTo.setPoints(points);
		List<ProfileTo> playersByParameters = profileService.findProfileByParameters(profileTo);

		return new ResponseEntity<>(playersByParameters, HttpStatus.NOT_FOUND);

	}


	@ResponseBody
	@ExceptionHandler(NonExistingPlayerException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorMessage playerNotFoundException(Exception ex) {
		LOGGER.error("Error in player service: ", ex);
		return new ErrorMessage(ex.getMessage());
	}
	

}
