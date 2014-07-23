package com.MCModer31545.unnamedmod.handler;



import com.MCModer31545.unnamedmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean testBool;

    public static void Init (File configFile)
    {
        if(configuration==null)
        configuration = new Configuration(configFile);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equals(Reference.MOD_ID))
            loadConfiguration();

    }
    public void loadConfiguration()
    {
        testBool=configuration.getBoolean("testBool",configuration.CATEGORY_GENERAL,true,"it's a test bool");

        if (configuration.hasChanged())
            configuration.save();
    }

}

