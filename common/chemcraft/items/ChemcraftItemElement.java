package chemcraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ChemcraftItemElement extends Item {
    
    private ChemcraftElementalItems type;
    
    public ChemcraftItemElement(int id, ChemcraftElementalItems type)
    {
        super(id);
        this.type = type;
        setUnlocalizedName(type.name);
        setCreativeTab(CreativeTabs.tabMisc);
    }
    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister reg)
    {
        this.iconIndex = reg.registerIcon("Chemcraft:"+type.name);
    }

}
