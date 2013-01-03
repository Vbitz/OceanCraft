package com.vbitz.OceanCraft.biomes;

import net.minecraft.world.biome.BiomeGenOcean;

public class DeepOceanBiome extends BiomeGenOcean {

	public DeepOceanBiome(int biomeId) {
		super(biomeId);
		
		setColor(112);
		setBiomeName("Deep Ocean");
		setMinMaxHeight(-1.8F, 0F);
		
	}

}
