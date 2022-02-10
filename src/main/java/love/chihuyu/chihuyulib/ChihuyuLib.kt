package love.chihuyu.chihuyulib

import org.bukkit.plugin.java.JavaPlugin

class ChihuyuLib : JavaPlugin() {

    companion object {
        lateinit var chihuyu: JavaPlugin
    }

    init {
        chihuyu = this
    }

    override fun onEnable() {
        logger.info("ChihuyuLib has loaded.")
        config.options().copyDefaults(true)
    }

    override fun onDisable() {
        logger.info("ChihuyuLib has unloaded.")
    }
}