package io.nilmani.demosell.service;

import io.nilmani.demosell.entity.Player;
import io.nilmani.demosell.repository.PlayerRepository;
import io.nilmani.demosell.serviceIface.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl  implements PlayerService {
    @Autowired
    private PlayerRepository pr;
    @Override
    public Player savePlayer(Player player) {
        return pr.save(player);
    }
}
