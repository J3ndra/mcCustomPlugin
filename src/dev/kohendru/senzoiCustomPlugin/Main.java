package dev.kohendru.senzoiCustomPlugin;

import dev.kohendru.senzoiCustomPlugin.events.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registering all event and command
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[newPlayerKit] Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[newPlayerKit] Plugin is disabled!");
    }


}
