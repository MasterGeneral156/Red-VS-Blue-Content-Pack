package com.themastergeneral.redvblue.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.redvblue.RedVBlue;

public class BasicArmor extends ItemArmor implements ItemModelProvider
{
	//Set these variables for use later.
	public final EntityEquipmentSlot armorType;
	public final int damageReduceAmount;
    public final float toughness;
    public final int renderIndex;
	private String name;
	private String modid;
	
	public BasicArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String modid) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.armorType = equipmentSlotIn;
        this.renderIndex = renderIndexIn;
        this.damageReduceAmount = materialIn.getDamageReductionAmount(equipmentSlotIn);
        this.setMaxDamage(materialIn.getDurability(equipmentSlotIn));
        this.toughness = materialIn.getToughness();
        this.maxStackSize = 1;
        this.name = name;
        this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(RedVBlue.creativeTab);
	}
	//Use CTD Core's item model registry.
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(modid, this, 0, name);
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		//Default armor
		if (itemStack.getItem().equals(ModItems.mc_leggings))
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mc_boots))
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mc_helmet))
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mc_helmet))
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mc_chestplate))
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mc_chestplate))
			player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 40, 2, true, false));
		
		//Red armor
		if (itemStack.getItem().equals(ModItems.mcr_leggings))
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcr_boots))
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcr_helmet))
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcr_helmet))
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcr_chestplate))
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcr_chestplate))
			player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 40, 2, true, false));
		
		//Blue armor
		if (itemStack.getItem().equals(ModItems.mcb_leggings))
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcb_boots))
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcb_helmet))
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcb_helmet))
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcb_chestplate))
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 40, 2, true, false));
		if (itemStack.getItem().equals(ModItems.mcb_chestplate))
			player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 40, 2, true, false));
		
		//Invisibility Cloak
		if (itemStack.getItem().equals(ModItems.cloak_invis))
			player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 40, 2, true, false));
	}
}
