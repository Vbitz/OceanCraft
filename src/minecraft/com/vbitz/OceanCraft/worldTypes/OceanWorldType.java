package com.vbitz.OceanCraft.worldTypes;

import com.vbitz.OceanCraft.OceanCraftMod;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class OceanWorldType extends WorldType {

	public OceanWorldType(int par1) {
		super(par1, "Oceans");
		this.biomesForWorldType = new BiomeGenBase[] {};
	}
	
	@Override
	public WorldChunkManager getChunkManager(World world) {
		return new WorldChunkManagerHell(OceanCraftMod.instance.deepOceanBiome, 0.5F, 0.5F); // this is the most evil thing I've written all day
	}

}
