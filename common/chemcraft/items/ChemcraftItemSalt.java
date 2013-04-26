package chemcraft.items;

import chemcraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ChemcraftItemSalt extends Item {
    
    public ChemcraftItemSalt(int id){
        super(id);
        this.setCreativeTab(CreativeTabs.tabFood);
    }
    
    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister reg){
        this.iconIndex = reg.registerIcon("Chemcraft:ItemSalt");
    }

}
