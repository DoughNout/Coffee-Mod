package khons.coffee.renderer;

import khons.coffee.model.ModelCoffeeMachine;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RendererCoffeeMachine extends TileEntitySpecialRenderer
{
	private ModelCoffeeMachine model;
	
	private static final ResourceLocation texture = new ResourceLocation("coffee", "textures/model/coffeeMachine.png");
	
	public RendererCoffeeMachine()
	{
		this.model = new ModelCoffeeMachine();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y,
			double z, float f)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}	
}
