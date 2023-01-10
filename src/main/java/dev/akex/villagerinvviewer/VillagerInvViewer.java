package dev.akex.villagerinvviewer;

import dev.akex.villagerinvviewer.utils.Color;
import dev.akex.villagerinvviewer.utils.listeners.OnClick;
import dev.akex.villagerinvviewer.utils.listeners.OnRightClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VillagerInvViewer extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println(Color.translate("&aThanks for using the plugin <3"));
        loadEvents();
    }

    @Override
    public void onDisable() {
        System.out.println(Color.translate("&cBye :c"));
    }

    public void loadEvents() {
        Bukkit.getServer().getPluginManager().registerEvents(new OnRightClick(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new OnClick(), this);
    }
}
