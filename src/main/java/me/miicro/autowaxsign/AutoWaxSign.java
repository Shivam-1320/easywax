package me.miicro.autowaxsign;

import me.miicro.autowaxsign.listiner.SignChangeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoWaxSign extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new SignChangeListener(this), this);
    }
}
