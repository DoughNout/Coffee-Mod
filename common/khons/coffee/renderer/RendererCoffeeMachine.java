package khons.coffee.renderer;

import khons.coffee.model.ModelCoffeeMachine;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RendererCoffeeMachine extends TileEntitySpecialRenderer
{
	private ModelCoffeeMachine model;
	
	public RendererCoffeeMachine()
	{
		this.model = new ModelCoffeeMachine();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1,
			double d2, float f)
	{
		
	}	
}
