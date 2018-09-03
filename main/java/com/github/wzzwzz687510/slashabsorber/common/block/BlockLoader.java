package com.github.wzzwzz687510.slashabsorber.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BlockLoader {

    public static Block blockIlmenite = new BlockIlmenite().setUnlocalizedName("ilmenite");
    public static void init(){
        ForgeRegistries.BLOCKS.register(blockIlmenite.setRegistryName("ilmenite"));
        ForgeRegistries.ITEMS.register(new ItemBlock(blockIlmenite).setRegistryName(blockIlmenite.getRegistryName()));

        OreDictionary.registerOre("oreIlmenite", blockIlmenite);
    }

    @SideOnly(Side.CLIENT)
    public static void clientInit(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockIlmenite), 0,
                new ModelResourceLocation(blockIlmenite.getRegistryName(), "inventory"));
    }
}
