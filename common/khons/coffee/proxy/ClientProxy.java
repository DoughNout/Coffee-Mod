package khons.coffee.proxy;

import khons.coffee.entity.TileEntityCoffeeMachine;
import khons.coffee.renderer.RendererCoffeeMachine;
import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoffeeMachine.class, new RendererCoffeeMachine());
	}
	
}
