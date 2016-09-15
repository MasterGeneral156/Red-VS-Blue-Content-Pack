package com.themastergeneral.redvblue.items;
 
import com.themastergeneral.redvblue.RedVBlue;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class BlueBrick extends Item
{
public BlueBrick()
	{
		setUnlocalizedName("bluebrick");
		setTextureName(RedVBlue.MODID + ":" + "bluebrick");
		setCreativeTab(RedVBlue.Tab);
	}
}
