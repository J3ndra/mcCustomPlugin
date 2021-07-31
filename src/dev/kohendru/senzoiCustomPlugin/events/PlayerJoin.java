package dev.kohendru.senzoiCustomPlugin.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (!player.hasPlayedBefore()) { // Check if the player has not played before
            player.sendMessage(ChatColor.LIGHT_PURPLE + "You seems new to this server, here some gift for you!\nHope you enjoy your time in this server. Happy Mining and Build!");

            player.getInventory().addItem(new ItemStack(Material.IRON_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_SHOVEL, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_HOE, 1));
            player.getInventory().addItem(new ItemStack(Material.COOKED_PORKCHOP, 16));
        } else {
            player.sendMessage(ChatColor.GREEN + "Hello Again " + player.getDisplayName()) ;
        }
    }
}
