package com.capgemini.boardgamecapmates;

import com.capgemini.boardgamecapmates.entity.ProfileEntity;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.repository.UserDao;

public class TestowaMain {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();

		System.out.println(userDao.getPlayers());
		userDao.add(new ProfileEntity(12, "sada", "sada", "sada", "sada", "sada", Level.AMATEUR, 10.0));
		
		System.out.println(userDao.getProfiles().toString());
	
		System.out.println(userDao.get(1L));
	}

}
