package chemcraft.recipes;

import net.minecraft.item.ItemStack;
import chemcraft.items.ChemcraftItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ChemcraftSmeltingHandler {
    
    public static void registerSmelting(){
        GameRegistry.addSmelting(ChemcraftItem.saltedporkraw.itemID, new ItemStack(ChemcraftItem.saltedpork, 1), 0.0F);
    }
}
