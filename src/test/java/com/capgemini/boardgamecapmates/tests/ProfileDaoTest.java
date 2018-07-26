package com.capgemini.boardgamecapmates.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.boardgamecapmates.mappers.ProfileMapper;
import com.capgemini.boardgamecapmates.repository.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfileDaoTest {

	@Spy
	ProfileMapper profileMapper;

	@InjectMocks

	UserDao ProfileDao;

	@Test
	public void shouldGetIdWhenGivenEmail() {
		// given
		String email = "ar@gmail.com";
		Long expectedId = null;
		// when
		Long id = ProfileDao.getIdByEmail(email);
		// then
		assertEquals(expectedId, id);
	}

	@Test
	public void shouldGetNullIdWhenGivenEmailDoesntExist() {
		// given
		String email = "artur123@interia.pl";
		// when
		Long id = ProfileDao.getIdByEmail(email);
		// then
		assertNull(id);
	}

	/*
	 * @Test public void shouldUpdateProfile() { // given UpdateProfilTo
	 * updateProfileTo = new UpdateProfilTo(1L, "Artur", "Artur", "Artur",
	 * "Artur", "Artur", Level.AMATEUR, 0.0); // when
	 * ProfileDao.update(updateProfileTo); // then assertEquals("daniel@mak.pl",
	 * ProfileDao.getProfiles().get(updateProfileTo.getId()).getMail());
	 * assertEquals(null,
	 * ProfileDao.getProfiles().get(updateProfileTo.getId()).getFirstname()); }
	 */

}
