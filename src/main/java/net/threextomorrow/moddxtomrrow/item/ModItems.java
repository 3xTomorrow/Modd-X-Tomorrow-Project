package net.threextomorrow.moddxtomrrow.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.threextomorrow.moddxtomrrow.ModdxTomorrow;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModdxTomorrow.MODID);

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_OPAL = ITEMS.register("raw_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
