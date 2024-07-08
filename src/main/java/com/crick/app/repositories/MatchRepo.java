package com.crick.app.repositories;

import com.crick.app.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

   // Optional<Match> findByIdTeamHeading(String teamHeading);
   Optional<Match> findByTeamHeading(String teamHeading);
}
