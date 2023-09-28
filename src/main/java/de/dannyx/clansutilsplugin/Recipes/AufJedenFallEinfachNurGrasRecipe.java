package de.dannyx.clansutilsplugin.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.recipe.CraftingBookCategory;

import java.util.List;

public class AufJedenFallEinfachNurGrasRecipe {
    public static void init() {
        ItemStack aufJedenFallEinfachNurGras = new ItemStack(Material.LARGE_FERN);
        ItemMeta aufJedenFallEinfachNurGrasItemMeta = aufJedenFallEinfachNurGras.getItemMeta();
        
        aufJedenFallEinfachNurGrasItemMeta.setDisplayName(ChatColor.GREEN + "Auf jeden Fall einfach nur Gras");
        aufJedenFallEinfachNurGrasItemMeta.setLore(List.of(ChatColor.GRAY + "Einfach nur Gras...", ChatColor.GRAY + "es wird definitiv nichts passieren wenn du rechtsklickst"));
        aufJedenFallEinfachNurGras.setItemMeta(aufJedenFallEinfachNurGrasItemMeta);
        aufJedenFallEinfachNurGras.setAmount(2);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey("definitiveinfachnureingraspluginohneweiteres", "definitiveinfachnurgras"), aufJedenFallEinfachNurGras);

        recipe.shape("XX", "XX");
        recipe.setIngredient('X', Material.FERN);
        recipe.setCategory(CraftingBookCategory.EQUIPMENT);

        Bukkit.addRecipe(recipe);
    }
    public static void remove() {
        Bukkit.removeRecipe(new NamespacedKey("definitiveinfachnureingraspluginohneweiteres", "definitiveinfachnurgras"));
    }
}
