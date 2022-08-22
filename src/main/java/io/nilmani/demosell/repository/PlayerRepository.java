package io.nilmani.demosell.repository;

import io.nilmani.demosell.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository  extends JpaRepository<Player,Long> {
}
