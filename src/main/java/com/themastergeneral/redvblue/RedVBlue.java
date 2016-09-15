package com.themastergeneral.redvblue;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.creativetab.CreativeTabs;

import com.themastergeneral.redvblue.Armor;
import com.themastergeneral.redvblue.items.*;
import com.themastergeneral.redvblue.MusicDisc;

@Mod(modid = RedVBlue.MODID, version = RedVBlue.VERSION, name = RedVBlue.NAME)

public class RedVBlue {
	public static final String MODID = "RedVBlue";
    public static final String VERSION = "1.4";
    public static final String NAME = "Red VS Blue";
    
    public static final ArmorMaterial GSS = EnumHelper.addArmorMaterial("GSS", 5000, new int[]{4, 9, 7, 4}, 10);
    
    public static final ArmorMaterial Cloak = EnumHelper.addArmorMaterial("Cloak", 10, new int[]{1, 1, 1, 1}, 1);
    
    public static Armor Armor;
    
    public static Item MCHelmet;
	public static Item MCChestplate;
	public static Item MCLeggings;
	public static Item MCBoots;
	
	public static Item MCRHelmet;
	public static Item MCRChestplate;
	public static Item MCRLeggings;
	public static Item MCRBoots;
	
	public static Item MCBHelmet;
	public static Item MCBChestplate;
	public static Item MCBLeggings;
	public static Item MCBBoots;
	
	public static Item InvisCloak;
	
	public static Block blueBrick;
	public static Block redBrick;
	public static Block bluefBrick;
	public static Block redfBrick;
	
	public static Item bluebrick;
	public static Item bluehbrick;
	public static Item redbrick;
	public static Item redhbrick;
	public static ItemRecord record_aqua;
	
	public static CreativeTabs Tab = new CreativeTab("RedVBlue");
    
    @EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
    	record_aqua=(ItemRecord) new MusicDisc(1,"aqua.ogg").setUnlocalizedName("record_aqua");
    	//Heads to gunpowder
    	GameRegistry.addSmelting( new ItemStack(Items.skull,1,4), new ItemStack(Items.gunpowder,25), 0.9f);
    	GameRegistry.addSmelting( new ItemStack(Items.skull,1,3), new ItemStack(Items.gunpowder,15), 0.9f);
    	GameRegistry.addSmelting( new ItemStack(Items.skull,1,2), new ItemStack(Items.gunpowder,10), 0.9f);
    	GameRegistry.addSmelting( new ItemStack(Items.skull,1,1), new ItemStack(Items.gunpowder,20), 0.9f);
    	GameRegistry.addSmelting( new ItemStack(Items.skull,1,0), new ItemStack(Items.gunpowder,10), 0.9f);
    	
    	GameRegistry.registerItem(MCHelmet = new Armor("mc_helmet", GSS, "mc", 0), "mc_helmet"); //0 for helmet
    	GameRegistry.registerItem(MCChestplate = new Armor("mc_chestplate", GSS, "mc", 1), "mc_chestplate"); // 1 for chestplate
    	GameRegistry.registerItem(MCLeggings = new Armor("mc_leggings", GSS, "mc", 2), "mc_leggings"); // 2 for leggings
    	GameRegistry.registerItem(MCBoots = new Armor("mc_boots", GSS, "mc", 3), "mc_boots"); // 3 for boots
    	
    	GameRegistry.registerItem(MCRHelmet = new Armor("mcr_helmet", GSS, "mcr", 0), "mcr_helmet"); //0 for helmet
    	GameRegistry.registerItem(MCRChestplate = new Armor("mcr_chestplate", GSS, "mcr", 1), "mcr_chestplate"); // 1 for chestplate
    	GameRegistry.registerItem(MCRLeggings = new Armor("mcr_leggings", GSS, "mcr", 2), "mcr_leggings"); // 2 for leggings
    	GameRegistry.registerItem(MCRBoots = new Armor("mcr_boots", GSS, "mcr", 3), "mcr_boots"); // 3 for boots
    	
    	GameRegistry.registerItem(MCBHelmet = new Armor("mcb_helmet", GSS, "mcb", 0), "mcb_helmet"); //0 for helmet
    	GameRegistry.registerItem(MCBChestplate = new Armor("mcb_chestplate", GSS, "mcb", 1), "mcb_chestplate"); // 1 for chestplate
    	GameRegistry.registerItem(MCBLeggings = new Armor("mcb_leggings", GSS, "mcb", 2), "mcb_leggings"); // 2 for leggings
    	GameRegistry.registerItem(MCBBoots = new Armor("mcb_boots", GSS, "mcb", 3), "mcb_boots"); // 3 for boots
    	
    	GameRegistry.registerItem(InvisCloak = new Armor("invis_cloak", Cloak, "invis", 1), "invis_cloak"); // 1 for chestplate
    	
    	GameRegistry.registerBlock(blueBrick = new Block_Class("blueBricks", Material.ground), "blueBricks");
    	GameRegistry.registerBlock(redBrick = new Block_Class("redBricks", Material.ground), "redBricks");
    	GameRegistry.registerBlock(bluefBrick = new Block_Class("bluefBricks", Material.ground), "bluefBricks");
    	GameRegistry.registerBlock(redfBrick = new Block_Class("redfBricks", Material.ground), "redfBricks");
    	
    	bluebrick = new BlueBrick();
    	GameRegistry.registerItem(bluebrick, "bluebrick");
    	bluehbrick = new BlueHBrick();
    	GameRegistry.registerItem(bluehbrick, "bluehbrick");
    	redbrick = new RedBrick();
    	GameRegistry.registerItem(redbrick, "redbrick");
    	redhbrick = new RedHBrick();
    	GameRegistry.registerItem(redhbrick, "redhbrick");
    	GameRegistry.registerItem(record_aqua, "record_aqua");
    	
    	//Shaped recipe for MCHelmet.
    	GameRegistry.addRecipe(new ItemStack(MCHelmet), new Object[]{
    	    	"IDI",
    	    	"IGI",
    	    	"   ",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,2)
    	});
    	//Shaped recipe for MCChestplate.
    	GameRegistry.addRecipe(new ItemStack(MCChestplate), new Object[]{
    	    	"IGI",
    	    	"IDI",
    	    	"III",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,2)
    	});
    	//Shaped recipe for MCLeggings.
    	GameRegistry.addRecipe(new ItemStack(MCLeggings), new Object[]{
    	    	"IDI",
    	    	"IGI",
    	    	"I I",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,2)
    	});
    	//Shaped recipe for MCBoots.
    	GameRegistry.addRecipe(new ItemStack(MCBoots), new Object[]{
    	    	"D D",
    	    	"IGI",
    	    	"   ",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,2)
    	});
    	
    	//Shaped recipe for MCRHelmet.
    	GameRegistry.addRecipe(new ItemStack(MCRHelmet), new Object[]{
    	    	"IDI",
    	    	"IGI",
    	    	"   ",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,1)
    	});
    	//Shaped recipe for MCRChestplate.
    	GameRegistry.addRecipe(new ItemStack(MCRChestplate), new Object[]{
    	    	"IGI",
    	    	"IDI",
    	    	"III",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,21)
    	});
    	//Shaped recipe for MCRLeggings.
    	GameRegistry.addRecipe(new ItemStack(MCRLeggings), new Object[]{
    	    	"IDI",
    	    	"IGI",
    	    	"I I",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,1)
    	});
    	//Shaped recipe for MCRBoots.
    	GameRegistry.addRecipe(new ItemStack(MCRBoots), new Object[]{
    	    	"D D",
    	    	"IGI",
    	    	"   ",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,1)
    	});
    	//Shaped recipe for MCBHelmet.
    	GameRegistry.addRecipe(new ItemStack(MCBHelmet), new Object[]{
    	    	"IDI",
    	    	"IGI",
    	    	"   ",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,4)
    	});
    	//Shaped recipe for MCBChestplate.
    	GameRegistry.addRecipe(new ItemStack(MCBChestplate), new Object[]{
    	    	"IGI",
    	    	"IDI",
    	    	"III",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,4)
    	});
    	//Shaped recipe for MCBLeggings.
    	GameRegistry.addRecipe(new ItemStack(MCBLeggings), new Object[]{
    	    	"IDI",
    	    	"IGI",
    	    	"I I",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,4)
    	});
    	//Shaped recipe for MCBBoots.
    	GameRegistry.addRecipe(new ItemStack(MCBBoots), new Object[]{
    	    	"D D",
    	    	"IGI",
    	    	"   ",
    	    	'I', Blocks.iron_block, 'D', Items.diamond, 'G', new ItemStack(Items.dye,1,4)
    	});
    	
    	//Shaped recipe for InvisCloak.
    	GameRegistry.addRecipe(new ItemStack(InvisCloak), new Object[]{
    	    	"DFD",
    	    	"FLF",
    	    	"DFD",
    	    	'F', Items.feather, 'D', Items.diamond, 'L', Items.leather_chestplate
    	});
    	GameRegistry.addShapelessRecipe(new ItemStack(redbrick, 4), new Object[] {Blocks.stonebrick, new ItemStack(Items.dye, 1, 1)});
    	GameRegistry.addShapelessRecipe(new ItemStack(bluebrick, 4), new Object[] {Blocks.stonebrick, new ItemStack(Items.dye, 1, 4)});
    	GameRegistry.addShapelessRecipe(new ItemStack(bluehbrick, 2), new Object[] {bluebrick});
    	GameRegistry.addShapelessRecipe(new ItemStack(redhbrick, 2), new Object[] {redbrick});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(bluebrick, 1), new Object[] {bluehbrick, Items.slime_ball, bluehbrick});
    	GameRegistry.addShapelessRecipe(new ItemStack(redbrick, 1), new Object[] {redhbrick, Items.slime_ball, redhbrick});
    	
    	//Shaped recipe for Red French Brick.
    	GameRegistry.addRecipe(new ItemStack(redfBrick, 4), new Object[]{
    	    	"RF ",
    	    	"FR ",
    	    	"   ",
    	    	'R', redbrick, 'F', redhbrick
    	});
    	//Shaped recipe for Red French Brick.
    	GameRegistry.addRecipe(new ItemStack(redfBrick, 4), new Object[]{
    	    	"FR ",
    	    	"RF ",
    	    	"   ",
    	    	'R', redbrick, 'F', redhbrick
    	});
    	//Shaped recipe for Blue French Brick.
    	GameRegistry.addRecipe(new ItemStack(bluefBrick, 4), new Object[]{
    	    	"RF ",
    	    	"FR ",
    	    	"   ",
    	    	'R', bluebrick, 'F', bluehbrick
    	});
    	//Shaped recipe for Blue French Brick.
    	GameRegistry.addRecipe(new ItemStack(bluefBrick, 4), new Object[]{
    	    	"FR ",
    	    	"RF ",
    	    	"   ",
    	    	'R', bluebrick, 'F', bluehbrick
    	});
    	
    	//Shaped recipe for Red Brick.
    	GameRegistry.addRecipe(new ItemStack(redBrick, 4), new Object[]{
    	    	"RR ",
    	    	"RR ",
    	    	"   ",
    	    	'R', redbrick
    	});
    	//Shaped recipe for blue Brick.
    	GameRegistry.addRecipe(new ItemStack(blueBrick, 4), new Object[]{
    	    	"RR ",
    	    	"RR ",
    	    	"   ",
    	    	'R', bluebrick
    	});

	}
}
