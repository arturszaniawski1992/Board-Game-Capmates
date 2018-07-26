package com.capgemini.boardgamecapmates.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.dto.RankingTo;
import com.capgemini.boardgamecapmates.enums.Level;
import com.capgemini.boardgamecapmates.services.RankingService;
import com.capgemini.boardgamecapmates.services.SortRankingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RankingServiceTest {

	private List<LoginWithStatisticsTo> players = new ArrayList<>();

	@Mock
	private SortRankingService sortRankingService;

	@InjectMocks
	private RankingService rankingService;

	@Before

	public void setup() {
		players.add(new LoginWithStatisticsTo(1L, "Artur", Level.AMATEUR, 10));
		players.add(new LoginWithStatisticsTo(2L, "Adam", Level.LEGENDARY, 100));
		players.add(new LoginWithStatisticsTo(2L, "Ewa", Level.LEGENDARY, 100));
	}

	@Test
	public void shouldGetPositionOnSortedList() {
		// given
		when(sortRankingService.sortRankingList(players)).thenReturn(players);
		Long id = 2L;
		// when
		RankingTo rankingTo = rankingService.getRanking(2L, players);
		// then
		assertEquals(id, rankingTo.getUserPositionOnList());
	}

	@Test
	public void shouldGetPositionEqualsMinusOneWhenIdIsNotOnList() {
		// given
		when(sortRankingService.sortRankingList(players)).thenReturn(players);
		Long id = -1L;
		// when
		RankingTo rankingTo = rankingService.getRanking(5L, players);
		// then
		assertEquals(id, rankingTo.getUserPositionOnList());
	}

}
