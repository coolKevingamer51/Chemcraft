package chemcraft.blocks;

import chemcraft.lib.IDReference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;


public class ChemcraftBlock {
    
   
    
    public static final Block saltBlock = (new ChemcraftBlockSalt(IDReference.blocksaltID)).setHardness(1.0F).setUnlocalizedName("BlockSalt");
    public static final Block pegmatite = (new ChemcraftBlockSalt(IDReference.blockpegmatiteID)).setHardness(2.0F).setUnlocalizedName("BlockPegmatite");
   
    
    public static void gameRegisterBlocks(){
        GameRegistry.registerBlock(saltBlock,"salt");
        GameRegistry.registerBlock(pegmatite, "pegmatite");
        
    }
    public static void languageRegisterBlocks(){
       LanguageRegistry.addName(saltBlock, "Salt Block"); 
       LanguageRegistry.addName(pegmatite, "Pegmatite");
    }
    
   
  

}
