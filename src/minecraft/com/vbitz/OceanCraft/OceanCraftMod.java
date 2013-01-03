package com.vbitz.OceanCraft;

import com.vbitz.OceanCraft.network.PacketHandler;

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

@Mod(modid = "oceanCraftVbitz", name = "OceanCraft", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class)
public class OceanCraftMod {

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
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
