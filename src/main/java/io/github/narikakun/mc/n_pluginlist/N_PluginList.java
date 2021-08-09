package io.github.narikakun.mc.n_pluginlist;

import io.github.narikakun.mc.n_pluginlist.commands.ServerPlugins;
import org.bukkit.plugin.java.JavaPlugin;
public final class N_PluginList extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("serverplugins").setExecutor(new ServerPlugins(this));
        getLogger().info("プラグインが有効になったぞい。今日も一日がんばるぞい");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("プラグインが無効になったぞい");
    }
}
