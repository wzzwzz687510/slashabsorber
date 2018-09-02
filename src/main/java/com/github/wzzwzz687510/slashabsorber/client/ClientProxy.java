package com.github.wzzwzz687510.slashabsorber.client;

import com.github.wzzwzz687510.slashabsorber.common.CommonProxy;

import com.github.wzzwzz687510.slashabsorber.common.block.BlockLoader;
import com.github.wzzwzz687510.slashabsorber.common.item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        ItemLoader.clientInit();
        BlockLoader.clientInit();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
