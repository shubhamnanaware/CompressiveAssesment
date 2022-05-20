package com.example.CreateTeam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.annotations.GeneratorType;
@Entity
public class Team {
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long teamId;
	private String teamName;
	private int maxBudget;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getMaxBudget() {
		return maxBudget;
	}
	public void setMaxBudget(int maxBudget) {
		this.maxBudget = maxBudget;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public Team(String teamName, int maxBudget, long teamId) {
		super();
		this.teamName = teamName;
		this.maxBudget = maxBudget;
		this.teamId= teamId;
	}
	public Team() {
	}
}
