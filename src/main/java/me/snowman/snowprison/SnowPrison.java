package me.snowman.snowprison;

import org.bukkit.plugin.java.JavaPlugin;

public class SnowPrison extends JavaPlugin {

    @Override
    public void onDisable() {
        super.onDisable();
        System.out.println("Enabled!");
    }

    @Override
    public void onEnable() {
        super.onEnable();
        System.out.println("Disabled!");
    }
}
