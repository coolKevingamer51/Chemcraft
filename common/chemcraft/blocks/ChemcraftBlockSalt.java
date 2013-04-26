package chemcraft.blocks;

import java.util.Random;

import chemcraft.items.ChemcraftItem;
import chemcraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class ChemcraftBlockSalt extends BlockBreakable {
    
    public ChemcraftBlockSalt(int id){
        super(id, "salt", Material.rock, false);
        setCreativeTab(CreativeTabs.tabBlock);
    }
    @Override
    public void registerIcons(IconRegister reg){
        this.blockIcon = reg.registerIcon("Chemcraft:BlockSalt");
    }
    
    public int idDropped(int par1, Random rand, int par2){
        return ChemcraftItem.salt.itemID;
    }
    public int quantityDropped(Random rand)
    {
        return 2+rand.nextInt(4);
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    @SideOnly(Side.CLIENT)
    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);     
}
}