package com.github.wzzwzz687510.slashabsorber.common;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

public class ConfigLoader
{
    private static Configuration config;

    private static Logger logger;

    public static int diamondBurnTime;

    public ConfigLoader(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }

    private static void load()
    {
        logger.info("Started loading config. ");
        String comment;

        comment = "How many seconds can a diamond burn in a furnace. ";
        diamondBurnTime = config.get(Configuration.CATEGORY_GENERAL, "diamondBurnTime", 640, comment).getInt();

        config.save();
        logger.info("Finished loading config. ");
    }

    public static Logger logger()
    {
        return logger;
    }
}
