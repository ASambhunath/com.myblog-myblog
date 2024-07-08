package com.crick.app.controller;

import com.crick.app.Service.MatchService;
import com.crick.app.entities.Match;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatch(){
        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
    }
@GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(),HttpStatus.OK);
    }

}
