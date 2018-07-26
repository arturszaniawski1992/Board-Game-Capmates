package com.capgemini.boardgamecapmates.dto;

import com.capgemini.boardgamecapmates.enums.MatchStatus;

public class MatchResultTo {

	private Long matchId;

	private MatchStatus matchStatus;

	public MatchResultTo() {
	}

	public MatchResultTo(Long matchId, MatchStatus matchStatus) {
		this.matchId = matchId;
		this.matchStatus = matchStatus;
	}

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public MatchStatus getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(MatchStatus matchStatus) {
		this.matchStatus = matchStatus;
	}

}
