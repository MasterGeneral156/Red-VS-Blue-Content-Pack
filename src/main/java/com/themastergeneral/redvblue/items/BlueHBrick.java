package com.themastergeneral.redvblue.items;
 
import com.themastergeneral.redvblue.RedVBlue;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class BlueHBrick extends Item
{
public BlueHBrick()
	{
		setUnlocalizedName("bluehbrick");
		setTextureName(RedVBlue.MODID + ":" + "bluehbrick");
		setCreativeTab(RedVBlue.Tab);
	}
}