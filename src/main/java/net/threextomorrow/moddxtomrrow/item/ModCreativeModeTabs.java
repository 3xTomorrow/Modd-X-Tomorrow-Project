package net.threextomorrow.moddxtomrrow.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.threextomorrow.moddxtomrrow.ModdxTomorrow;
import net.threextomorrow.moddxtomrrow.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModdxTomorrow.MODID);

    public static final RegistryObject<CreativeModeTab> MODD_TAB = CREATIVE_MODE_TABS.register("modd_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OPAL.get()))
                    .title(Component.translatable("creativetab.modd_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Items
                        pOutput.accept(ModItems.OPAL.get());
                        pOutput.accept(ModItems.RAW_OPAL.get());
                        pOutput.accept(ModItems.BURGER.get());

                        //Blocks
                        pOutput.accept(ModBlocks.OPAL_BLOCK.get());
                        pOutput.accept(ModBlocks.BURGER_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
