package khons.coffee.blocks;

import khons.coffee.entity.TileEntityCoffeeMachine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoffeeMachine extends BlockContainer
{

	public BlockCoffeeMachine(int id, Material material)
	{
		super(id, material);
		// TODO Auto-generated constructor stub
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityCoffeeMachine();
	}
	
	public int getRenderType()
	{
		return -1;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon)
	{
		this.blockIcon = icon.registerIcon("coffee:machine");
	}

}
