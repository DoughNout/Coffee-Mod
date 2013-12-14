package khons.coffee;

import khons.coffee.blocks.TileEntityCoffeeMachineBlock;
import khons.coffee.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "coffee", name = "Coffe Mod", version = "0.0.3")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class CoffeeCore {
	
	@Instance
	public static CoffeeCore instance;
	
	@SidedProxy(clientSide = "khons.coffee.proxy.ClientProxy", serverSide = "khons.coffee.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static Block coffeeMachine;
	
	public static Item Espresso; // Water and Coffee
	public static Item EspressoDupio; // 2xEspresso
	public static Item EspressoLungo; // Espresso with more water
	public static Item EspressoRistretto; // Espresso with less water
	public static Item Americano; // Espresso and water
	public static Item Latte; // Espresso and Milk
	public static Item MochaLatte; // Latte and chocolate
	public static Item CafeAuLait; // Coffee and Milk
	public static Item RedEye; // Coffee and Espresso
	public static Item BlackEye; // Red eye and Espresso
	public static Item DeadEye; // Black eye and Espresso
	public static Item Frappe; // Espresso, sugar and ice
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		coffeeMachine = new TileEntityCoffeeMachineBlock(3773).setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("coffeeMachine");
		
		GameRegistry.registerBlock(coffeeMachine, "coffeeMachine");
		
		LanguageRegistry.addName(coffeeMachine, "Coffee Machine");
		
		LanguageRegistry.addName(Americano, "Americano");
		LanguageRegistry.addName(BlackEye, "Black eye");
		LanguageRegistry.addName(CafeAuLait, "Cafe au lait");
		LanguageRegistry.addName(DeadEye, "Dead eye");
		LanguageRegistry.addName(Espresso, "Espresso");
		LanguageRegistry.addName(EspressoDupio, "Espresso dupio");
		LanguageRegistry.addName(EspressoLungo, "Espresso lungo");
		LanguageRegistry.addName(EspressoRistretto, "Espresso ristretto");
		LanguageRegistry.addName(Frappe, "Frappe");
		LanguageRegistry.addName(Latte, "Latte");
		LanguageRegistry.addName(MochaLatte, "Mocha Latte");
		LanguageRegistry.addName(RedEye, "Red eye");
	}
	
	public void init(FMLInitializationEvent evt)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent evt)
	{
		
	}
	
}
