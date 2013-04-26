package chemcraft.world;

import java.util.Random;

import chemcraft.blocks.ChemcraftBlock;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenChemcraftBlocks implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case 1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateEnd(World world, Random random, int i, int j) {
   
        
    }

    private void generateSurface(World world, Random random, int x, int z) {
        
        
        for(int i = 0; i < 25; i++){
            int zCoord = z + random.nextInt(16);
            int xCoord = x + random.nextInt(16);
            int yCoord = random.nextInt(128);
            (new WorldGenMinable(ChemcraftBlock.saltBlock.blockID, 36)).generate(world, random, xCoord, yCoord, zCoord);
        }
        for(int i = 0; i<10; i++){
            int zCoord = z + random.nextInt(16);
            int xCoord = x + random.nextInt(16);
            int yCoord = random.nextInt(32);
            (new WorldGenMinable(ChemcraftBlock.pegmatite.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
        }
        
    }

    private void generateNether(World world, Random random, int i, int j) {

        
    }
    
    

}