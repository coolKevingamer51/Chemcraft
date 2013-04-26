package chemcraft;



import chemcraft.blocks.ChemcraftBlock;
import chemcraft.items.ChemcraftItem;
import chemcraft.lib.Reference;
import chemcraft.recipes.ChemcraftShapelessHandler;
import chemcraft.recipes.ChemcraftSmeltingHandler;
import chemcraft.world.WorldGenChemcraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Chemcraft {
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        ChemcraftBlock.gameRegisterBlocks();
        ChemcraftBlock.languageRegisterBlocks(); 
        ChemcraftItem.gameRegisterItems();
        ChemcraftItem.languageRegisterItems();
        ChemcraftShapelessHandler.registerShapeless();
        ChemcraftSmeltingHandler.registerSmelting();
    }
    
    
    @Init
    public void init(FMLInitializationEvent event){
        WorldGenChemcraft.registerChemcraftBlocksGen();
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }

}
