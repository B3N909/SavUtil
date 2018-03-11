package me.savant.items;

import java.util.HashMap;

public class ItemDatabase
{
	HashMap<String, ItemWrapper> database = new HashMap<String, ItemWrapper>();
	
	public void register(String id, ItemWrapper wrapper)
	{
		database.put(id, wrapper);
	}
	
	public ItemWrapper getItem(String id)
	{
		return database.get(id);
	}
}
