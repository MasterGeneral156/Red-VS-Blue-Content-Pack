package com.themastergeneral.redvblue.common.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.redvblue.RedVBlue;

public class BasicItem extends CTDItem {
	public BasicItem(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(RedVBlue.creativeTab);
	}
}
