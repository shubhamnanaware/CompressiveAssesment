package com.example.CreatePlayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CreatePlayer.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	public Player findByPlayerId(Long playerId);

}
