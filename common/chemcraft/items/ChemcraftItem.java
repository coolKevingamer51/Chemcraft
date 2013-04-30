package chemcraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import chemcraft.lib.IDReference;


public class ChemcraftItem {
    
    public static final Item salt =  (new ChemcraftItemSalt(IDReference.saltID)).setUnlocalizedName("Salt");
    public static final Item saltedpork = (new ItemFood(IDReference.saltedporkID, 8, 1.0F, true)).setUnlocalizedName("SaltedPork");
    public static final Item saltedporkraw = (new Item(IDReference.saltedporkrawID)).setUnlocalizedName("SaltedPorkRaw");
    
    
    
public static void gameRegisterItems(){
    GameRegistry.registerItem(salt, "Salt");
    GameRegistry.registerItem(saltedpork,"SaltedPork");
    GameRegistry.registerItem(saltedporkraw, "SaltedPorkRaw");
    
}
public static void languageRegisterItems(){
    LanguageRegistry.addName(salt, "Salt");
    LanguageRegistry.addName(saltedpork, "Salted Porkchop");
    LanguageRegistry.addName(saltedporkraw, "Raw Salted Porkchop");
}

}


