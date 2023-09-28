package de.dannyx.clansutilsplugin;

import de.dannyx.clansutilsplugin.Commands.GiveGrasCommand;
import de.dannyx.clansutilsplugin.Commands.GiveSuperGrasCommand;
import de.dannyx.clansutilsplugin.Listeners.GrasRightClickListener;
import de.dannyx.clansutilsplugin.Listeners.SuperGrasRightClickListener;
import de.dannyx.clansutilsplugin.Recipes.AufJedenFallEinfachNurGrasRecipe;
import de.dannyx.clansutilsplugin.Recipes.SuperGrasRecipe;
import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class ClansUtilsPlugin extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIBukkitConfig(this).silentLogs(true).missingExecutorImplementationMessage("This command can't be executed with the %s"));
    }
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GrasRightClickListener(), this);
        getServer().getPluginManager().registerEvents(new SuperGrasRightClickListener(), this);
        AufJedenFallEinfachNurGrasRecipe.init();
        SuperGrasRecipe.init();
        CommandAPI.onEnable();
        GiveGrasCommand.init();
        GiveSuperGrasCommand.init();
    }

    @Override
    public void onDisable() {
        SuperGrasRecipe.remove();
        AufJedenFallEinfachNurGrasRecipe.remove();
    }
}
