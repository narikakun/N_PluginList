package io.github.narikakun.mc.n_pluginlist.commands;

import io.github.narikakun.mc.n_pluginlist.N_PluginList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class ServerPlugins implements CommandExecutor {
    private final N_PluginList plugin;

    public ServerPlugins(N_PluginList plugin_) {
        plugin = plugin_;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("serverplugins")) {
            String plist = "";
            for(Plugin plugin : Bukkit.getPluginManager().getPlugins())
            {
                if (plist.equals("")) plist += ", ";
                plist += plugin.getName();
            }
            sender.sendMessage(plist);
            return true;
        }
        return false;
    }
}
