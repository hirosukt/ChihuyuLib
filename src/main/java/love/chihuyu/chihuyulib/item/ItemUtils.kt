package love.chihuyu.chihuyulib.item

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack

object ItemUtils {

    /**
     * メタデータと共にItemStackインスタンスを返す。
     *
     * @return ItemStack
     * @param material アイテム
     * @param name 表示名
     * @param lore 説明文
     * @param unbreakable 壊れるか否か
     * @param enchants エンチャント
     * @param flags アイテムフラグ
     * @param modelData カスタムモデルデータ
     */
    fun create(
        material: Material,
        name: String? = null,
        lore: List<String>? = null,
        unbreakable: Boolean = false,
        enchants: Map<Enchantment, Int>? = null,
        flags: List<ItemFlag>? = null,
        modelData: Int? = null
    ): ItemStack {
        val item = ItemStack(material)
        val meta = item.itemMeta

        meta?.setDisplayName(name)
        meta?.lore = lore
        meta?.isUnbreakable = unbreakable
        meta?.setCustomModelData(modelData)

        enchants?.forEach {
            meta?.addEnchant(it.key, it.value, true)
        }

        flags?.forEach {
            meta?.addItemFlags(it)
        }

        item.itemMeta = meta
        return item
    }
}