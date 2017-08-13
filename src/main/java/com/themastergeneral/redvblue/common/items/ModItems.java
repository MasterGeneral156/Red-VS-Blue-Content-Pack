package com.themastergeneral.redvblue.common.items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.redvblue.RedVBlue;
import com.themastergeneral.redvblue.common.config.Config;

public class ModItems extends RegisterItem
{
	//Set the items to variables...
	public static BasicItem bluebrick;
	public static BasicItem redbrick;
	public static BasicItem bluehalfbrick;
	public static BasicItem redhalfbrick;
	
	//Set the armor to variables
	public static BasicArmor mc_helmet;
	public static BasicArmor mc_chestplate;
	public static BasicArmor mc_leggings;
	public static BasicArmor mc_boots;
	
	//Set the red armor to variables
	public static BasicArmor mcr_helmet;
	public static BasicArmor mcr_chestplate;
	public static BasicArmor mcr_leggings;
	public static BasicArmor mcr_boots;
	
	//Set the red armor to variables
	public static BasicArmor mcb_helmet;
	public static BasicArmor mcb_chestplate;
	public static BasicArmor mcb_leggings;
	public static BasicArmor mcb_boots;
	
	//Invisibility Cloak
	public static BasicArmor cloak_invis;
		
	//Add the armor materials
	public static ArmorMaterial gss = EnumHelper.addArmorMaterial("mc_default", "redvblue:mc_armor_default", 100, 
			new int[] {Config.spartanhelmetdefense, Config.spartanchestdefense, Config.spartanlegsdefense, 
			Config.spartanbootsdefense}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) Config.spartanarmortoughness);
	//Red Spartan Armor
	public static ArmorMaterial rss = EnumHelper.addArmorMaterial("mc_red", "redvblue:mc_armor_red", 100, 
			new int[] {Config.spartanhelmetdefense, Config.spartanchestdefense, Config.spartanlegsdefense, 
			Config.spartanbootsdefense}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) Config.spartanarmortoughness);
	
	//Blue Spartan Armor
		public static ArmorMaterial bss = EnumHelper.addArmorMaterial("mc_blue", "redvblue:mc_armor_blue", 100, 
				new int[] {Config.spartanhelmetdefense, Config.spartanchestdefense, Config.spartanlegsdefense, 
				Config.spartanbootsdefense}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) Config.spartanarmortoughness);
	//Cloak
    public static ArmorMaterial cloak = EnumHelper.addArmorMaterial("cloak", "redvblue:cloak", 100, new int[] {1, 1, 1, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1F);
	
	//Register the items!
	public static void init()
	{
		//Bricks and whatnot
		bluebrick = register(new BasicItem("bluebrick", RedVBlue.MODID));
		bluehalfbrick = register(new BasicItem("bluehalfbrick", RedVBlue.MODID));
		redbrick = register(new BasicItem("redbrick", RedVBlue.MODID));
		redhalfbrick = register(new BasicItem("redhalfbrick", RedVBlue.MODID));
		
		//The Green Armor
		mc_helmet = register(new BasicArmor("mc_helmet", gss, 0, EntityEquipmentSlot.HEAD, RedVBlue.MODID));
		mc_chestplate = register(new BasicArmor("mc_chestplate", gss, 0, EntityEquipmentSlot.CHEST, RedVBlue.MODID));
		mc_leggings = register(new BasicArmor("mc_leggings", gss, 0, EntityEquipmentSlot.LEGS, RedVBlue.MODID));
		mc_boots = register(new BasicArmor("mc_boots", gss, 0, EntityEquipmentSlot.FEET, RedVBlue.MODID));
		
		//The Red Armor
		mcr_helmet = register(new BasicArmor("mcr_helmet", rss, 0, EntityEquipmentSlot.HEAD, RedVBlue.MODID));
		mcr_chestplate = register(new BasicArmor("mcr_chestplate", rss, 0, EntityEquipmentSlot.CHEST, RedVBlue.MODID));
		mcr_leggings = register(new BasicArmor("mcr_leggings", rss, 0, EntityEquipmentSlot.LEGS, RedVBlue.MODID));
		mcr_boots = register(new BasicArmor("mcr_boots", rss, 0, EntityEquipmentSlot.FEET, RedVBlue.MODID));
		
		//The Blue Armor
		mcb_helmet = register(new BasicArmor("mcb_helmet", bss, 0, EntityEquipmentSlot.HEAD, RedVBlue.MODID));
		mcb_chestplate = register(new BasicArmor("mcb_chestplate", bss, 0, EntityEquipmentSlot.CHEST, RedVBlue.MODID));
		mcb_leggings = register(new BasicArmor("mcb_leggings", bss, 0, EntityEquipmentSlot.LEGS, RedVBlue.MODID));
		mcb_boots = register(new BasicArmor("mcb_boots", bss, 0, EntityEquipmentSlot.FEET, RedVBlue.MODID));
		
		//The invisibility cloak
		cloak_invis = register(new BasicArmor("cloak_invis", cloak, 0, EntityEquipmentSlot.CHEST, RedVBlue.MODID));
	}
	
}
