package com.capgemini.boardgamecapmates.interfaces;

import com.capgemini.boardgamecapmates.dto.MatchResultTo;
import com.capgemini.boardgamecapmates.dto.MatchTo;
import com.capgemini.boardgamecapmates.entity.MatchEntity;
import com.capgemini.boardgamecapmates.enums.MatchStatus;

public interface MatchDao {
	MatchStatus getMatchStatus(Long id);

	void updateStatus(MatchResultTo matchResultTo);

	MatchTo getMatch(Long id);

	void add(MatchTo matchTo);

	void add(MatchEntity matchEntity);

	MatchTo get(long id);

}
