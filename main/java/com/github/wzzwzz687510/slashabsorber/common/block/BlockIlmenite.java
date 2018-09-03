package com.github.wzzwzz687510.slashabsorber.common.block;

import com.github.wzzwzz687510.slashabsorber.common.creativetab.CreativeTabsSlashAbsorber;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockIlmenite extends Block {

    public BlockIlmenite(){
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);
        this.setHardness(50.0f);
        this.setHarvestLevel("pickaxe", 2);

        this.setCreativeTab(CreativeTabsSlashAbsorber.tabSlashAbsorber);
    }

}
