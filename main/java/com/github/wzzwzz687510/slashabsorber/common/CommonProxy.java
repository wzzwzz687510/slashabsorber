package com.github.wzzwzz687510.slashabsorber.common;

import com.github.wzzwzz687510.slashabsorber.common.block.BlockLoader;
import com.github.wzzwzz687510.slashabsorber.common.item.ItemLoader;

import com.github.wzzwzz687510.slashabsorber.common.world.gen.OreGenEventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event) {
        ItemLoader.init();
        BlockLoader.init();
    }

    public void init(FMLInitializationEvent event) {
        ItemLoader.addSmelting();
        OreGenEventHandler.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
