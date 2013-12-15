package khons.coffee.blocks;

import khons.coffee.CoffeeCore;
import khons.coffee.entity.TileEntityCoffeeMachine;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
	
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
		player.inventory.addItemStackToInventory(new ItemStack(CoffeeCore.coffee));
		
        return true;
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
