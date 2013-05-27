package chemcraft.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import chemcraft.items.ChemcraftElementalItems;
import chemcraft.items.ChemcraftItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ChemcraftShapelessHandler {
    
    public static void registerShapeless(){
        GameRegistry.addShapelessRecipe(new ItemStack(ChemcraftItem.saltedporkraw), new Object[] {ChemcraftItem.salt, Item.porkRaw});
        GameRegistry.addShapelessRecipe(new ItemStack(ChemcraftItem.salt), new Object[] {ChemcraftElementalItems.elementalchlorine.item, ChemcraftElementalItems.elementalsodium.item});
    }

}
