package com.github.wzzwzz687510.slashabsorber.common;

import com.github.wzzwzz687510.slashabsorber.common.block.BlockLoader;
import com.github.wzzwzz687510.slashabsorber.common.item.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {

    }

    private static void registerSmelting()
    {
        GameRegistry.addSmelting(BlockLoader.blockIlmenite, new ItemStack(ItemLoader.itemTitaniumIngot), 0.5f);
    }

    private static void registerFuel()
    {

    }
}
