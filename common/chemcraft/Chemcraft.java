package chemcraft;



import net.minecraftforge.common.Configuration;
import chemcraft.blocks.ChemcraftBlock;
import chemcraft.items.*;
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
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Chemcraft {
    
    private int blockId;
   
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        ChemcraftBlock.gameRegisterBlocks();
        ChemcraftBlock.languageRegisterBlocks(); 
        ChemcraftItem.gameRegisterItems();
        ChemcraftItem.languageRegisterItems();
        
        ChemcraftSmeltingHandler.registerSmelting();
        
        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        blockId = cfg.getBlock("salt", 975).getInt(975);
        ChemcraftElementalItems.buildItems(cfg, 19501);
        ChemcraftShapelessHandler.registerShapeless();
    }
    
    
    @Init
    public void init(FMLInitializationEvent event){
        WorldGenChemcraft.registerChemcraftBlocksGen();
        
        for (ChemcraftElementalItems typ : ChemcraftElementalItems.values())
        {
            LanguageRegistry.instance().addStringLocalization("item." + typ.name + ".name", "en_US", typ.descname);
        }
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }

}
