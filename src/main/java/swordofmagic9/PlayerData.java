package swordofmagic9;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerData implements SomPlayer {

    private static final HashMap<Player, PlayerData> playerDataBase = new HashMap<>();
    public static PlayerData get(Player player) {
        if (!playerDataBase.containsKey(player)) {
            playerDataBase.put(player, new PlayerData(player));
        }
        return playerDataBase.get(player);
    }

    private PlayerData(Player player) {
        this.player = player;
    }

    @Override
    public SomStatus getStatus() {
        return null;
    }

    private final Player player;
    @Override
    public Player getPlayer() {
        return player;
    }
}
