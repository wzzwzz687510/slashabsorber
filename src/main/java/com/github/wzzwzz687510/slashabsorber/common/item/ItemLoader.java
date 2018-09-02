package com.github.wzzwzz687510.slashabsorber.common.item;


import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.ModelLoader;

public class ItemLoader
{
    public static Item itemBestSword = new ItemBestSword().setUnlocalizedName("bestSword");
    public static void init() {
        ForgeRegistries.ITEMS.register(itemBestSword.setRegistryName("best_sword"));
    }

    @SideOnly(Side.CLIENT)
    public static void clientInit(){
        ModelLoader.setCustomModelResourceLocation(itemBestSword, 0,
                new ModelResourceLocation(itemBestSword.getRegistryName(), "inventory"));
    }
}
