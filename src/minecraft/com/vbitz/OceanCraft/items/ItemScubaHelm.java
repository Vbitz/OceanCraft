package com.vbitz.OceanCraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class ItemScubaHelm extends ItemArmor implements ISpecialArmor {
	
	public ItemScubaHelm(int itemId) {
		super(itemId, EnumArmorMaterial.IRON, 2, 0); // it's basicly a special iron helm
		
		setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public ArmorProperties getProperties(EntityLiving player, ItemStack armor,
			DamageSource source, double damage, int slot) {
		if (source == DamageSource.drown) {
			player.setAir(300);
			armor.damageItem(10, player);
			return new ArmorProperties(0, 1, 100);
		} else {
			return new ArmorProperties(0, 0, 0);
		}
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return 0;
	}

	@Override
	public void damageArmor(EntityLiving entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
	}

}
