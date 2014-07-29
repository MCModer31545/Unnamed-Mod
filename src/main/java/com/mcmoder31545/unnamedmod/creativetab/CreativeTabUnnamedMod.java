package com.mcmoder31545.unnamedmod.creativetab;


import com.mcmoder31545.unnamedmod.init.ModItems;
import com.mcmoder31545.unnamedmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUnnamedMod {
    public static final CreativeTabs UNNAMED_MOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.UEUEnergyCell;
        }

    };
}
