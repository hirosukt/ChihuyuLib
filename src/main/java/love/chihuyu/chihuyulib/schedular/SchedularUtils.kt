package love.chihuyu.chihuyulib.schedular

import love.chihuyu.chihuyulib.schedular.SchedularUtils.runTaskTimer
import org.bukkit.plugin.Plugin
import org.bukkit.scheduler.BukkitRunnable

object SchedularUtils {

    inline fun bukkitRunnable(crossinline block: BukkitRunnable.() -> Unit) = object : BukkitRunnable() {
        override fun run() = block()
    }

    inline fun Plugin.runTaskTimer(period: Long, crossinline block: BukkitRunnable.() -> Unit) {
        bukkitRunnable(block).runTaskTimer(this, 0, period)
    }

    inline fun Plugin.runTaskTimerAsync(period: Long, crossinline block: BukkitRunnable.() -> Unit) {
        bukkitRunnable(block).runTaskTimerAsynchronously(this, 0, period)
    }
}