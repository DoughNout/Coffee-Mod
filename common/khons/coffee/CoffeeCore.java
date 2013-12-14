package khons.coffee;

import khons.coffee.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "coffee", name = "Coffe Mod", version = "0.0.1")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class CoffeeCore {
	
	@Instance
	public static CoffeeCore instance;
	
	@SidedProxy(clientSide = "khons.coffee.proxy.ClientProxy", serverSide = "khons.coffee.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		
	}
	
	public void init(FMLInitializationEvent evt)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent evt)
	{
		
	}
	
}
