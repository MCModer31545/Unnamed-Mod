package com.mcmoder31545.unnamedmod;


import com.mcmoder31545.unnamedmod.handler.ConfigHandler;
import com.mcmoder31545.unnamedmod.init.ModBlocks;
import com.mcmoder31545.unnamedmod.init.ModItems;
import com.mcmoder31545.unnamedmod.proxy.IProxy;
import com.mcmoder31545.unnamedmod.reference.Reference;
import com.mcmoder31545.unnamedmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)

public class UnnamedMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static UnnamedMod instance;

    @SidedProxy(clientSide =Reference.CLIENT_PROXY ,serverSide =Reference.SERVER_PROXY )
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.Init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Configs Initialized");

        ModItems.init();
        LogHelper.info("Items Initialized");

        ModBlocks.init();
        LogHelper.info("Blocks Initialized");

        LogHelper.info("Pre Initializtion Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initializtion Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initializtion Complete");
    }
}
