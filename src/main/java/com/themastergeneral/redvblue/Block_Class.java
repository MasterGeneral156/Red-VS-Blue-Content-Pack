package com.themastergeneral.redvblue;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.themastergeneral.redvblue.CreativeTab;

public class Block_Class extends Block {

    protected Block_Class(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(RedVBlue.MODID + ":" + unlocalizedName);
        this.setCreativeTab(RedVBlue.Tab);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeStone);
    }
}
