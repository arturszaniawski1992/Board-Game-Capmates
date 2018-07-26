package com.capgemini.boardgamecapmates.interfaces;

import java.util.List;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.dto.RankingTo;

/*A method that returns current player statistics.
 * @param userId for plazer and List of logins with statistics.
*/
public interface RankingServiceDao {
	RankingTo getRanking(Long userId, List<LoginWithStatisticsTo> loginsWithStats);

}
