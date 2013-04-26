package chemcraft.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenChemcraft {
    
    public static void registerChemcraftBlocksGen(){
        GameRegistry.registerWorldGenerator(new WorldGenChemcraftBlocks());
    }
 

}
