package de.dannyx.clansutilsplugin.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SuperGrasRightClickListener implements Listener {
    @EventHandler
    public static void onRightClick(PlayerInteractEvent e) {
        if (e.getAction().isRightClick()) {
            if (e.getItem() != null && e.getItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "SuperGras")) {
                Player p = e.getPlayer();
                ItemStack item = p.getItemInHand().asQuantity(1);
                p.spawnParticle(Particle.CAMPFIRE_COSY_SMOKE, p.getLocation(), 3, 0.0, 1.0, 0.0, 0.05);
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 50, 10));
                p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 100));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1200, 2));
                p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 50, 10));
                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 10));
                p.playSound(p.getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 50, 1);
                System.out.println("Applied effect to a player!");
                p.getInventory().removeItem(item);
            }
        }
    }
}
