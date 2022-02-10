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
    }

    override fun onDisable() {
        logger.info("ChihuyuLib has unloaded.")
    }
}