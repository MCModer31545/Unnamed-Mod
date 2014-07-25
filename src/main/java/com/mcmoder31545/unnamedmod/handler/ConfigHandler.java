package com.mcmoder31545.unnamedmod.handler;



import com.mcmoder31545.unnamedmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean testBool=true;

    public static void Init (File configFile)
    {
        if(configuration==null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equals(Reference.MOD_ID))
            loadConfiguration();

    }
    private static void loadConfiguration()
    {
        testBool=configuration.getBoolean("testBool",Configuration.CATEGORY_GENERAL,true,"it's a test bool");

        if (configuration.hasChanged())
            configuration.save();
    }

}

