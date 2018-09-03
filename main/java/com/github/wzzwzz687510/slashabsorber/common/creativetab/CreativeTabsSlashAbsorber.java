package com.github.wzzwzz687510.slashabsorber.common.creativetab;

import com.github.wzzwzz687510.slashabsorber.common.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsSlashAbsorber extends CreativeTabs {
    public static CreativeTabsSlashAbsorber tabSlashAbsorber = new CreativeTabsSlashAbsorber();

    public CreativeTabsSlashAbsorber()
    {
        super("slashabsorber");
        this.setBackgroundImageName("slashabsorber.png");
    }

    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.itemBestSword);
    }
}
