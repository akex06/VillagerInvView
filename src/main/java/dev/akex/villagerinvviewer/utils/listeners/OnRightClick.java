package dev.akex.villagerinvviewer.utils.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;

public class OnRightClick implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (player.isSneaking()) {
            if (event.getRightClicked() instanceof Villager villager) {
                event.setCancelled(true);
                Inventory inventory = Bukkit.createInventory(null, 9, "Villager Inventory");
                for (int i = 0; i < 8; i++) {
                    inventory.setItem(i, villager.getInventory().getItem(i));
                }

                player.openInventory(inventory);
            }
        }
    }
}
