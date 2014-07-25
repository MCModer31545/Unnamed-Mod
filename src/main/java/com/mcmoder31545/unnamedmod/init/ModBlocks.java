package com.mcmoder31545.unnamedmod.init;


import com.mcmoder31545.unnamedmod.block.BlockUEUEnergyCellCluster;
import com.mcmoder31545.unnamedmod.block.BlockUnnamedMod;
import com.mcmoder31545.unnamedmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockUnnamedMod UEUEnergyCellCluster=new BlockUEUEnergyCellCluster();
    public static void init()
    {
        GameRegistry.registerBlock(UEUEnergyCellCluster,"UEUEnergyCellCluster");
    }
}
