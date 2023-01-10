package dev.akex.villagerinvviewer.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class OnClick implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("Villager Inventory") & event.getInventory().getSize() == 8) {
            event.setCancelled(true);
        }
    }
}