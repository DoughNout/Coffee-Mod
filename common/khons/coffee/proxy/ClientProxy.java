package khons.coffee.proxy;

import khons.coffee.entity.TileEntityCoffeeMachineEntity;
import khons.coffee.renderer.TileEntityCoffeeMachineRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoffeeMachineEntity.class, new TileEntityCoffeeMachineRenderer());
	}
	
}
