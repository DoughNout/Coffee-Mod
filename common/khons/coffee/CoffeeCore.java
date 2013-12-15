package khons.coffee;

import khons.coffee.items.ItemCoffeeMug;
import khons.coffee.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
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

@Mod(modid = "coffee", name = "Coffee Mod", version = "0.1.0")
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class CoffeeCore {

	@Instance
	public static CoffeeCore instance;

	@SidedProxy(clientSide = "khons.coffee.proxy.ClientProxy", serverSide = "khons.coffee.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static Block coffeeMachine;

	public static Item coffeeMug;

	public static Item coffee;

	public static Item mugAmericano;
	public static Item mugBlackEye;
	public static Item mugCafeAuLait;
	public static Item mugDeadEye;
	public static Item mugEspresso;
	public static Item mugEspressoDupio;
	public static Item mugEspressoLungo;
	public static Item mugEspressoRistretto;
	public static Item mugFrappe;
	public static Item mugLatte;
	public static Item mugLatteMocha;
	public static Item mugRedEye;

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
	public void preInit(FMLPreInitializationEvent evt) {
		// coffeeMachine = new BlockCoffeeMachine(3773,
		// Material.iron).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("coffeeMachine");

		coffeeMug = new Item(3773).setTextureName("coffee:mug").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("coffeeMug");

		Espresso = new Item(3774).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("espresso");
		EspressoDupio = new Item(3775).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("espressoDupio");
		EspressoLungo = new Item(3776).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("espressoLungo");
		EspressoRistretto = new Item(3777).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("espressoRistretto");
		Americano = new Item(3778).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("americano");
		Latte = new Item(3779).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("latte");
		MochaLatte = new Item(3780).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("latteMocha");
		CafeAuLait = new Item(3781).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("cafeAuLait");
		RedEye = new Item(3782).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("eyeRed");
		BlackEye = new Item(3783).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("eyeBlack");
		DeadEye = new Item(3784).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("eyeDead");
		Frappe = new Item(3785).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("frappe");
		coffee = new Item(3772).setTextureName("coffee:coffee").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("coffee");

		mugAmericano = new ItemCoffeeMug(3786).setTextureName("coffee:coffeeMug").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("mugAmericano");
		mugBlackEye = new ItemCoffeeMug(3787).setTextureName("coffee:coffeeMug").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("mugBlackEye");
		mugCafeAuLait = new ItemCoffeeMug(3788).setTextureName("coffee:coffeeMug").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("mugCafeAuLait");
		mugDeadEye = new ItemCoffeeMug(3789).setTextureName("coffee:coffeeMug").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("mugDeadEye");
		mugEspresso = new ItemCoffeeMug(3790).setTextureName("coffee:coffeeMug").setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("mugEspresso");

		// GameRegistry.registerBlock(coffeeMachine, "coffeeMachine");

		// GameRegistry.registerTileEntity(TileEntityCoffeeMachine.class,
		// "coffeeMachine");

		// LanguageRegistry.addName(coffeeMachine, "Coffee Machine");
		LanguageRegistry.addName(coffeeMug, "Coffee Mug");
		LanguageRegistry.addName(coffee, "Coffee");

		LanguageRegistry.addName(Americano, "Americano");
		LanguageRegistry.addName(BlackEye, "Black Eye");
		LanguageRegistry.addName(CafeAuLait, "Cafe Au Lait");
		LanguageRegistry.addName(DeadEye, "Dead Eye");
		LanguageRegistry.addName(Espresso, "Espresso");
		LanguageRegistry.addName(EspressoDupio, "Espresso Dupio");
		LanguageRegistry.addName(EspressoLungo, "Espresso Lungo");
		LanguageRegistry.addName(EspressoRistretto, "Espresso Ristretto");
		LanguageRegistry.addName(Frappe, "Frappe");
		LanguageRegistry.addName(Latte, "Latte");
		LanguageRegistry.addName(MochaLatte, "Mocha Latte");
		LanguageRegistry.addName(RedEye, "Red Eye");
		
		LanguageRegistry.addName(mugAmericano, "Mug of Americano");
		LanguageRegistry.addName(mugBlackEye, "Mug of Black Eye");
		LanguageRegistry.addName(mugCafeAuLait, "Mug of Cafe au Lait");
		LanguageRegistry.addName(mugDeadEye, "Mug of Dead Eye");
		LanguageRegistry.addName(mugEspresso, "Mug of Espresso");

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(coffee), 1, 3, 1));

	}

	private ItemStack water = new ItemStack(Item.bucketWater);

	// private ItemStack expresso = new ItemStack(Espresso);

	@EventHandler
	public void init(FMLInitializationEvent evt) {
		proxy.registerRenderThings();

		GameRegistry.addShapedRecipe(new ItemStack(coffeeMug), "b b", "b b", "bbb", 'b', new ItemStack(Item.brick));

		GameRegistry.addShapelessRecipe(new ItemStack(Espresso), water, water, new ItemStack(coffee));
		GameRegistry.addShapelessRecipe(new ItemStack(EspressoDupio), new ItemStack(Espresso), new ItemStack(Espresso));
		GameRegistry.addShapelessRecipe(new ItemStack(EspressoLungo), water, water, water, new ItemStack(coffee));
		GameRegistry.addShapelessRecipe(new ItemStack(EspressoRistretto), water, new ItemStack(coffee));
		GameRegistry.addShapelessRecipe(new ItemStack(Americano), new ItemStack(Espresso), water);
		GameRegistry.addShapelessRecipe(new ItemStack(Latte), new ItemStack(Espresso), new ItemStack(Item.bucketMilk));
		GameRegistry.addShapelessRecipe(new ItemStack(MochaLatte), new ItemStack(Latte), new ItemStack(Item.dyePowder, 1, 3));
		
		GameRegistry.addShapedRecipe(new ItemStack(mugAmericano), "a", "m", 'a', new ItemStack(Americano), 'm', new ItemStack(coffeeMug));
		GameRegistry.addShapedRecipe(new ItemStack(mugBlackEye), "a", "m", 'a', new ItemStack(BlackEye), 'm', new ItemStack(coffeeMug));
		GameRegistry.addShapedRecipe(new ItemStack(mugCafeAuLait), "a", "m", 'a', new ItemStack(CafeAuLait), 'm', new ItemStack(coffeeMug));
		GameRegistry.addShapedRecipe(new ItemStack(mugDeadEye), "a", "m", 'a', new ItemStack(DeadEye), 'm', new ItemStack(coffeeMug));
		GameRegistry.addShapedRecipe(new ItemStack(mugEspresso), "a", "m", 'a', new ItemStack(Espresso), 'm', new ItemStack(coffeeMug));
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {

	}

}
