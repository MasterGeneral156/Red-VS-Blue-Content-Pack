package com.themastergeneral.redvblue.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.themastergeneral.redvblue.RedVBlue;
import com.themastergeneral.redvblue.common.items.ModItems;

public class CreativeTab extends CreativeTabs {
	public CreativeTab() {
		super(RedVBlue.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.mc_helmet); // shown icon on creative tab
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}

}
