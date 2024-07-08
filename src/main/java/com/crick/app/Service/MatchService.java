package com.crick.app.Service;

import com.crick.app.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();
}
