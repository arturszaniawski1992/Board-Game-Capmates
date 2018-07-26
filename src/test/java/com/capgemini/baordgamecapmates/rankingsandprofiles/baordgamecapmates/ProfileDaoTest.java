package com.capgemini.baordgamecapmates.rankingsandprofiles.baordgamecapmates;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.boardgamecapmates.dto.UpdateProfilTo;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.repository.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void shouldGetIdWhenGivenEmail() {
		// given
		String email = "ar@gmail.com";
		Long expectedId = 1L;
		// when
		Long id = userDao.getIdByEmail(email);
		// then
		assertEquals(expectedId, id);
	}

	@Test
	public void shouldGetNullIdWhenGivenEmailDoesntExist() {
		// given
		String email = "artur123@interia.pl";
		// when
		Long id = userDao.getIdByEmail(email);
		// then
		assertNull(id);
	}

	@Test
	public void shouldUpdateProfile() {

		// given
		UpdateProfilTo profilToUpdate = new UpdateProfilTo(1L, "Art", "art@gmail.com", "1234", "Art", "Art",
				Level.AMATEUR, 51.0);

		// when
		userDao.update(profilToUpdate);
		// then
		assertEquals("art1234@gmail.com", userDao.getProfiles().get(profilToUpdate.getId()).getMail());
		// assertEquals(null,
		// userDao.getProfiles().get(profilToUpdate.getId()));

	}

}
