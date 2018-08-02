package com.capgemini.boardgamecapmates.tests;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.capgemini.boardgamecapmates.dto.ProfileTo;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.services.ProfileService;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProfileControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProfileService profileService;

	private List<ProfileTo> setProfiles(int size) {
		List<ProfileTo> players = new ArrayList<>();
		players.add(new ProfileTo(1L, "artur", "artur", "artur", "artur@o2.pl", "artur", Level.AMATEUR, 0));

		if (size > 1) {
			players.add(new ProfileTo(2L, "adam", "adam", "adam", "adam@o2.pl", "artur", Level.AMATEUR, 0));
		}

		return players;
	}

	@Test
	public void getAllPlayersShouldReturnSize2() throws Exception {
		// given
		List<ProfileTo> players = setProfiles(2);

		// when
		when(profileService.getPlayersList()).thenReturn(players);
		mockMvc.perform(get("/player")).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(jsonPath("$", hasSize(2))).andExpect(jsonPath("$[0].firstname", is("artur")))
				.andExpect(jsonPath("$[1].firstname", is("adam")));

		// then
		verify(profileService, times(1)).getPlayersList();
	}

	@Test
	public void getPlayerInformationShouldReturnId() throws Exception {
		// given
		List<ProfileTo> players = setProfiles(1);
		ProfileTo profileTo = players.get(0);

		// when
		when(profileService.get(1L)).thenReturn(profileTo);
		mockMvc.perform(get("/player/1")).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
				.andExpect(jsonPath("id", is(0)));

		// then
		verify(profileService, times(1)).get(1L);
	}

}