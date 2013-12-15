package khons.coffee.items;

import java.awt.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCoffeeMug extends Item
{

	public ItemCoffeeMug(int id) {
		super(id);
	}
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{		
		return true;
	}
	
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4)
	{
		if(par4)
		{
			list.add("Coffee makes you go wizz");
		}
	}

}
