package de.dannyx.clansutilsplugin.Commands;

import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.CommandPermission;
import dev.jorel.commandapi.arguments.IntegerArgument;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class GiveGrasCommand {
    public static void init() {
        new CommandAPICommand("givegrasitemtest")
                .withArguments(new IntegerArgument("amount"))
                .withAliases("giveaufjedenfalleinfachnurgrasitem", "givegrasitem", "givegras")
                .withPermission(CommandPermission.OP)
                .executesPlayer(((player, args) -> {
//                    Player p = player;
                    Integer amount = (Integer) args.get(0);
                    ItemStack aufJedenFallEinfachNurGrasCommandItem = new ItemStack(Material.LARGE_FERN);
                    ItemMeta aufJedenFallEinfachNurGrasCommandItemItemMeta = aufJedenFallEinfachNurGrasCommandItem.getItemMeta();

                    aufJedenFallEinfachNurGrasCommandItemItemMeta.setDisplayName(ChatColor.GREEN + "Auf jeden Fall einfach nur Gras");
                    aufJedenFallEinfachNurGrasCommandItemItemMeta.setLore(List.of(ChatColor.GRAY + "Einfach nur Gras...", ChatColor.GRAY + "es wird definitiv nichts passieren wenn du rechtsklickst"));
                    aufJedenFallEinfachNurGrasCommandItem.setItemMeta(aufJedenFallEinfachNurGrasCommandItemItemMeta);

                    for (int i = 0; i < amount; i++) {
                        player.getInventory().addItem(aufJedenFallEinfachNurGrasCommandItem);
                    }
                }))
                .register();
    }
}
