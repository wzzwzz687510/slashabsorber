package com.github.wzzwzz687510.slashabsorber.common.item;


import com.github.wzzwzz687510.slashabsorber.common.block.BlockLoader;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.oredict.OreDictionary;

public class ItemLoader
{
    public static Item itemBestSword = new ItemBestSword().setUnlocalizedName("bestSword");
    public static Item itemTitaniumIngot = new ItemTiantiumIngot().setUnlocalizedName("titaniumIngot");

    public static void init() {
        ForgeRegistries.ITEMS.register(itemBestSword.setRegistryName("best_sword"));
        ForgeRegistries.ITEMS.register(itemTitaniumIngot.setRegistryName("titanium_ingot"));

        OreDictionary.registerOre("ingotTitanium", itemTitaniumIngot);
    }

    @SideOnly(Side.CLIENT)
    public static void clientInit(){
        ModelLoader.setCustomModelResourceLocation(itemBestSword, 0,
                new ModelResourceLocation(itemBestSword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTitaniumIngot, 0,
                new ModelResourceLocation(itemTitaniumIngot.getRegistryName(), "inventory"));
    }

}
