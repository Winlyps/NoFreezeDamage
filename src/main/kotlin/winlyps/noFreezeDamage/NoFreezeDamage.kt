package winlyps.noFreezeDamage

import org.bukkit.plugin.java.JavaPlugin

class NoFreezeDamage : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("freezeDamage", "false")
        }
        logger.info("NoFreezeDamage plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("freezeDamage", "true")
            logger.info("NoFreezeDamage plugin has been disabled.")
        }
    }
}