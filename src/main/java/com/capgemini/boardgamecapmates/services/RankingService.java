package com.capgemini.boardgamecapmates.services;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.boardgamecapmates.enums.Level;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.boardgamecapmates.dto.LoginWithStatisticsTo;
import com.capgemini.boardgamecapmates.dto.RankingTo;
import com.capgemini.boardgamecapmates.interfaces.RankingServiceDao;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RankingService implements RankingServiceDao {

    private SortRankingService sortRankingService;

    @Autowired
    public RankingService(SortRankingService sortRankingService) {
        this.sortRankingService = sortRankingService;
    }

    @Override
    public RankingTo getRanking(Long Id, List<LoginWithStatisticsTo> loginsWithStats) {
        loginsWithStats = sortRankingService.sortRankingList(loginsWithStats);
        Long positionOnList = -1L;
        for (LoginWithStatisticsTo iterator : loginsWithStats) {
            if (iterator.getUserId().equals(Id)) {
                positionOnList = (long) loginsWithStats.indexOf(iterator);
            }
        }
        return new RankingTo(loginsWithStats, positionOnList);
    }

    @Scheduled(fixedDelay = 10000)
    public void shouldGetPositionOnSortedList() {
        List<LoginWithStatisticsTo> players = new ArrayList<>();
        players.add(new LoginWithStatisticsTo(1L, "Artur", Level.AMATEUR, 10));
        players.add(new LoginWithStatisticsTo(2L, "Adam", Level.LEGENDARY, 100));
        players.add(new LoginWithStatisticsTo(2L, "Ewa", Level.LEGENDARY, 100));
        this.getRanking(2L, players);
    }
}
