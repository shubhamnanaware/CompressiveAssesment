package com.example.CreatePlayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.CreatePlayer.entity.Player;
import com.example.CreatePlayer.repository.PlayerRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CreatePlayerApplicationTests {
	
	@Test
	void contextLoads() {
	}
//	@Autowired
//	PlayerRepository playerRepository;
//	@Test
//	public void testReadAll() {
//		List list=playerRepository.findAll();
//		assertThat(list).size().isGreaterThan(0);
//		}
//	@Test
//	public void getByIdTest() {
//		Player player=playerRepository.findByPlayerId(1L);
//		assertEquals("Virat", player.getName());
//	}

}
