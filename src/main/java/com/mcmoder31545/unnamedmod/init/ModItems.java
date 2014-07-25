package com.mcmoder31545.unnamedmod.init;


import com.mcmoder31545.unnamedmod.item.ItemUEUEnergyCell;
import com.mcmoder31545.unnamedmod.item.ItemUnnamedMod;
import com.mcmoder31545.unnamedmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemUnnamedMod UEUEnergyCell=new ItemUEUEnergyCell();

    public static void init()
    {
        GameRegistry.registerItem(UEUEnergyCell,"UEUEnergyCell");
    }


}
