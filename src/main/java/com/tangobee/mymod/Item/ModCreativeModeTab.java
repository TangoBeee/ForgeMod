package com.tangobee.mymod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BOMBS_TAB = new CreativeModeTab("bombstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BOMB_POWDER.get());
        }
    };
}
