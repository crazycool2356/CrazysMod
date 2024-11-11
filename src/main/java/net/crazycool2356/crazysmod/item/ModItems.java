package net.crazycool2356.crazysmod.item;

import net.crazycool2356.crazysmod.CrazysMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrazysMod.MOD_ID);

    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_ROCK = ITEMS.register("andesite_rock",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_ROCK = ITEMS.register("granite_rock",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_ROCK = ITEMS.register("diorite_rock",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
