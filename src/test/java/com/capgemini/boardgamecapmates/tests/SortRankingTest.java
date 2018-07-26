package com.capgemini.boardgamecapmates.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.mappers.StatisticMapper;
import com.capgemini.boardgamecapmates.services.SortRankingService;

public class SortRankingTest {
	@Spy
	StatisticMapper statisticMapper;
	
	private List<LoginWithStatisticsTo> players = new ArrayList<>();

	@InjectMocks
	private SortRankingService sortRankingService;

	@Test
	public void shouldGetSortedList() {
		// given
		players.add(new LoginWithStatisticsTo(1L, "login1", Level.BEGINNER, 10));
		players.add(new LoginWithStatisticsTo(2L, "login2", Level.PROFESSIONAL, 50));
		players.add(new LoginWithStatisticsTo(3L, "login3", Level.LEGENDARY, 100));
		players.add(new LoginWithStatisticsTo(4L, "login4", Level.BEGINNER, 20));
		// when
		List<LoginWithStatisticsTo> sortedList = sortRankingService.sortRankingList(players);
		// then
		assertEquals(10, sortedList.get(3).getPoints(), 0.0);
		assertEquals(20, sortedList.get(2).getPoints(), 0.0);
		assertEquals(50, sortedList.get(1).getPoints(), 0.0);
		assertEquals(100, sortedList.get(0).getPoints(), 0.0);
	}

	@Test
	public void shouldGetSortedListWhenMasterHaveLessPointsFromBeginner() {
		// given

		players.add(new LoginWithStatisticsTo(1L, "login1", Level.BEGINNER, 10.0));
		players.add(new LoginWithStatisticsTo(2L, "login2", Level.AMATEUR, 50));
		players.add(new LoginWithStatisticsTo(3L, "login3", Level.PROFESSIONAL, 20));
		players.add(new LoginWithStatisticsTo(4L, "login4", Level.LEGENDARY, 100));
		// when
		List<LoginWithStatisticsTo> sortedList = sortRankingService.sortRankingList(players);
		// then
		assertEquals(10, sortedList.get(3).getPoints(), 0.0);
		assertEquals(50, sortedList.get(2).getPoints(), 0.0);
		assertEquals(100, sortedList.get(1).getPoints(), 0.0);
		assertEquals(20, sortedList.get(0).getPoints(), 0.0);
	}

}
