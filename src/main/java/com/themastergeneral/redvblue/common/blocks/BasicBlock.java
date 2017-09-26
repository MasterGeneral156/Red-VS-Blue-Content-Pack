package com.themastergeneral.redvblue.common.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.redvblue.RedVBlue;

public class BasicBlock extends CTDBlock {
	public BasicBlock(Material materialIn, String name, String modid) {
		super(materialIn, name, modid);
		this.setCreativeTab(RedVBlue.creativeTab);
	}
}
