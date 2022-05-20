package com.example.CreateTeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CreateTeam.entity.Team;
import com.example.CreateTeam.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository repository;
	
	public Team saveTeam(Team team) {
		return repository.save(team);
	}
	public List<Team> getAllTeam(){
		return (List<Team>) repository.findAll();
	}
	public Team FindTeamByName(String teamName) {
		return repository.findByTeamName(teamName);
	}
}
