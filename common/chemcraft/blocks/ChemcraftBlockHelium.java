package chemcraft.blocks;

import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ChemcraftBlockHelium extends BlockFluid {

    protected ChemcraftBlockHelium(int id) {
        super(id, Material.air);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

}
