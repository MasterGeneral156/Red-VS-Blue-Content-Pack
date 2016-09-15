package com.themastergeneral.redvblue.items;
 
import com.themastergeneral.redvblue.RedVBlue;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class RedBrick extends Item
{
public RedBrick()
	{
		setUnlocalizedName("redbrick");
		setTextureName(RedVBlue.MODID + ":" + "redbrick");
		setCreativeTab(RedVBlue.Tab);
	}
}