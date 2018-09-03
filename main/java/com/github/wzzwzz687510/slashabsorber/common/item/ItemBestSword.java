package com.github.wzzwzz687510.slashabsorber.common.item;

import com.github.wzzwzz687510.slashabsorber.common.creativetab.CreativeTabsSlashAbsorber;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBestSword extends ItemSword
{
    public ItemBestSword(){
        super(EnumHelper.addToolMaterial("CHROME", 4, 2000, 15.0F,
                10.0F, 15));

        this.addPropertyOverride(new ResourceLocation("isFansir"),
                (stack, world, entity) -> entity != null && entity.getCustomNameTag().equals("fansir")? 1.0f : 0.0f);

        this.setCreativeTab(CreativeTabsSlashAbsorber.tabSlashAbsorber);
    }
}
