package com.capgemini.boardgamecapmates.interfaces;

import java.util.List;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.dto.RankingTo;

public interface RankingServiceDao {
	RankingTo getRanking(Long userId, List<LoginWithStatisticsTo> loginsWithStats);

}
