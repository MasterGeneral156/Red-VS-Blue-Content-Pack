package com.themastergeneral.redvblue;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.themastergeneral.redvblue.RedVBlue;

public class Armor extends ItemArmor {

	public String textureName;

	public Armor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(RedVBlue.MODID + ":" + unlocalizedName);
		this.setCreativeTab(RedVBlue.Tab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return RedVBlue.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem().equals(RedVBlue.MCLeggings))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 2));
		if (itemStack.getItem().equals(RedVBlue.MCBoots))
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 40, 2));
		if (itemStack.getItem().equals(RedVBlue.MCHelmet))
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCHelmet))
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCChestplate))
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCChestplate))
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40));
		//Red
		if (itemStack.getItem().equals(RedVBlue.MCRLeggings))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 2));
		if (itemStack.getItem().equals(RedVBlue.MCRBoots))
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 40, 2));
		if (itemStack.getItem().equals(RedVBlue.MCRHelmet))
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCRHelmet))
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCRChestplate))
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCRChestplate))
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40));
		//Blue
		if (itemStack.getItem().equals(RedVBlue.MCBLeggings))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 2));
		if (itemStack.getItem().equals(RedVBlue.MCBBoots))
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 40, 2));
		if (itemStack.getItem().equals(RedVBlue.MCBHelmet))
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCBHelmet))
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCBChestplate))
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));
		if (itemStack.getItem().equals(RedVBlue.MCBChestplate))
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40));
		
		//Other
		if (itemStack.getItem().equals(RedVBlue.InvisCloak))
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40));
		if (itemStack.getItem().equals(RedVBlue.InvisCloak))
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 1));
		
	}

}
