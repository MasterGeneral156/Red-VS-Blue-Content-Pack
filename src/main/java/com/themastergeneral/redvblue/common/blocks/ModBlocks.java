package com.themastergeneral.redvblue.common.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.redvblue.RedVBlue;

public class ModBlocks extends RegisterBlock {
	// Create the blocks and put them to a variable.
	public static BasicBlock blue_aligned_brick;
	public static BasicBlock blue_french_brick;
	public static BasicBlock red_aligned_brick;
	public static BasicBlock red_french_brick;

	// Called in pre-init to register the blocks.
	public static void init() {
		blue_aligned_brick = register(new BasicBlock(Material.GROUND,
				"blue_aligned_brick", RedVBlue.MODID));
		blue_french_brick = register(new BasicBlock(Material.GROUND,
				"blue_french_brick", RedVBlue.MODID));
		red_aligned_brick = register(new BasicBlock(Material.GROUND,
				"red_aligned_brick", RedVBlue.MODID));
		red_french_brick = register(new BasicBlock(Material.GROUND,
				"red_french_brick", RedVBlue.MODID));
	}
}
