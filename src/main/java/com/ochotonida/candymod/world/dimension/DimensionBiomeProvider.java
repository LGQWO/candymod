package com.ochotonida.candymod.world.dimension;

import com.ochotonida.candymod.ModBiomes;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeProvider;

public class DimensionBiomeProvider extends BiomeProvider {

    public DimensionBiomeProvider(World world) {
        getBiomesToSpawnIn().clear();
        getBiomesToSpawnIn().add(ModBiomes.BIOME_CHOCOLATE);
        getBiomesToSpawnIn().add(ModBiomes.BIOME_COTTON_CANDY);
    }
}