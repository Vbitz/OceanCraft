package com.vbitz.OceanCraft;

import net.minecraft.world.WorldType;
import net.minecraftforge.common.BiomeManager;

import com.vbitz.OceanCraft.biomes.DeepOceanBiome;
import com.vbitz.OceanCraft.items.ItemScubaHelm;
import com.vbitz.OceanCraft.network.PacketHandler;
import com.vbitz.OceanCraft.worldTypes.OceanWorldType;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "oceanCraftVbitz", name = "OceanCraft", version = "0.0.1")
@NetworkMod(channels = { "oceanCraftVbitz" }, clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class)
public class OceanCraftMod {

	// items
	public ItemScubaHelm scubaHelm = new ItemScubaHelm(3400);
	
	// biomes
	public DeepOceanBiome deepOceanBiome = new DeepOceanBiome(128);
	
	// worldTypes
	public OceanWorldType oceanWorldType = new OceanWorldType(8);
	
	@Instance("oceanCraftVbitz")
	public static OceanCraftMod instance;
	
	@SidedProxy(clientSide = "com.vbitz.OceanCraft.ClientProxy",
			serverSide = "com.vbitz.OceanCraft.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent e) {
		
	}
	
	@Init
	public void init(FMLInitializationEvent e) {
		oceanWorldType.addNewBiome(deepOceanBiome); // the only biome
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
