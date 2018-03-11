package me.savant.items;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemWrapper
{
	ItemStack item;
	
	public ItemWrapper(ItemStack item, String name, String... lore)
	{
		ItemMeta m = item.getItemMeta();
		m.setDisplayName(name);
		m.setLore(Arrays.asList(lore));
		item.setItemMeta(m);
		this.item = item;
	}
	
	public ItemWrapper(Material material, int quantity, String name, String... lore)
	{
		this(new ItemStack(material, quantity), name, lore);
	}
	
	public ItemStack getItem()
	{
		return item;
	}
}
