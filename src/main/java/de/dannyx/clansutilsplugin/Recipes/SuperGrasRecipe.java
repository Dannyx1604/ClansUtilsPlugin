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

public class SuperGrasRecipe {
    public static void init() {
        ItemStack normalGras = new ItemStack(Material.LARGE_FERN);
        ItemMeta normalGrasItemMeta = normalGras.getItemMeta();

        normalGrasItemMeta.setDisplayName(ChatColor.GREEN + "Auf jeden Fall einfach nur Gras");
        normalGrasItemMeta.setLore(List.of(ChatColor.GRAY + "Einfach nur Gras...", ChatColor.GRAY + "es wird definitiv nichts passieren wenn du rechtsklickst"));
        normalGras.setItemMeta(normalGrasItemMeta);


        ItemStack superGras = new ItemStack(Material.LARGE_FERN);
        ItemMeta superGrasItemMeta = superGras.getItemMeta();

        superGrasItemMeta.setDisplayName(ChatColor.GREEN + "SuperGras");
        superGrasItemMeta.setLore(List.of(ChatColor.GRAY + "Einfach nur Supergras...", ChatColor.GRAY + "es wird definitiv nichts passieren wenn du rechtsklickst"));
        superGras.setItemMeta(superGrasItemMeta);
        superGras.setAmount(1);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey("definitiveinfachnureingraspluginohneweiteres", "definitiveinfachnursupergras"), superGras);

        recipe.shape("XXX", "XXX", "XXX");
        recipe.setIngredient('X', normalGras);
        recipe.setCategory(CraftingBookCategory.EQUIPMENT);

        Bukkit.addRecipe(recipe);
    }
    public static void remove() {
        Bukkit.removeRecipe(new NamespacedKey("definitiveinfachnureingraspluginohneweiteres", "definitiveinfachnursupergras"));
    }
}
