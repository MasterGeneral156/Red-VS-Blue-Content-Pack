package com.themastergeneral.redvblue.items;
 
import com.themastergeneral.redvblue.RedVBlue;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class RedHBrick extends Item
{
public RedHBrick()
	{
		setUnlocalizedName("redhbrick");
		setTextureName(RedVBlue.MODID + ":" + "redhbrick");
		setCreativeTab(RedVBlue.Tab);
	}
}