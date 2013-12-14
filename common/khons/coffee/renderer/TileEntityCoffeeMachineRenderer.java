package khons.coffee.renderer;

import khons.coffee.model.CoffeeMachineModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCoffeeMachineRenderer extends TileEntitySpecialRenderer {

	private CoffeeMachineModel model;
	
	public TileEntityCoffeeMachineRenderer()
	{
		this.model = new CoffeeMachineModel();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1,
			double d2, float f) {
	}

	

}
