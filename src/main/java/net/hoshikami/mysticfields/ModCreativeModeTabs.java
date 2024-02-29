package net.hoshikami.mysticfields;

import net.hoshikami.mysticfields.MysticFields;
import net.hoshikami.mysticfields.block.ModBlocks;
import net.hoshikami.mysticfields.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticFields.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MYSTIC_FIELDS_TAB = CREATIVE_MODE_TABS.register("mystic_fields_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYSTALLIZED_MOONLIGHT.get()))
                    .title(Component.translatable("creativetab.mystic_fields_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.INFUSION_ALTAR.get());
                        output.accept(ModItems.CRYSTALLIZED_MOONLIGHT.get());
                        output.accept(ModItems.CRYSTALLIZED_SUNLIGHT.get());
                        output.accept(ModItems.RAW_CRYSTALLIZED_MOONLIGHT.get());
                        output.accept(ModItems.RAW_CRYSTALLIZED_SUNLIGHT.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
