package com.vbitz.OceanCraft.worldTypes;

import com.vbitz.OceanCraft.OceanCraftMod;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;

public class OceanWorldType extends WorldType {

	public OceanWorldType(int par1) {
		super(par1, "Oceans");
		this.biomesForWorldType = new BiomeGenBase[] {};
	}

}
