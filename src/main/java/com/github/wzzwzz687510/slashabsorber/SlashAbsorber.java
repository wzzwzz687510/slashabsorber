package com.github.wzzwzz687510.slashabsorber;

import com.github.wzzwzz687510.slashabsorber.common.CommonProxy;

import com.github.wzzwzz687510.slashabsorber.common.item.ItemLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SlashAbsorber.MOD_ID, name = SlashAbsorber.MOD_NAME, version = SlashAbsorber.MOD_VERSION, acceptedMinecraftVersions = "1.12.2")

public class SlashAbsorber
{
    public static final String MOD_ID = "slashabsorber";
    public static final String MOD_NAME = "Slash Absorber";
    public static final String MOD_VERSION = "1.0.0";

    @SidedProxy(clientSide = "com.github.wzzwzz687510.slashabsorber.client.ClientProxy",
            serverSide = "com.github.wzzwzz687510.slashabsorber.common.CommonProxy")
    public static CommonProxy proxy;

    @Instance(SlashAbsorber.MOD_ID)
    public static SlashAbsorber instance;

    private Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger=event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}