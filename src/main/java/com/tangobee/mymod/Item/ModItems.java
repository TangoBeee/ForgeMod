package com.tangobee.mymod.Item;

import com.tangobee.mymod.MyMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    public static final RegistryObject<Item> BOMB_POWDER = ITEMS.register("bomb_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOMBS_TAB).stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
