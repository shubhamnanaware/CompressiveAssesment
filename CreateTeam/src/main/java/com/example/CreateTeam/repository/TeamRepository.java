package com.example.CreateTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CreateTeam.entity.Team;

public interface TeamRepository extends JpaRepository<Team, String> {

	public Team findByTeamName(String teamName);

}
