package net.hoshikami.mysticfields.item;

import net.hoshikami.mysticfields.MysticFields;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MysticFields.MOD_ID);

    public static final RegistryObject<Item> CRYSTALLIZED_MOONLIGHT = ITEMS.register("crystallized_moonlight",
            () -> new Item(new Item.Properties().stacksTo(1).setNoRepair().durability(5)));
    public static final RegistryObject<Item> RAW_CRYSTALLIZED_MOONLIGHT = ITEMS.register("raw_crystallized_moonlight",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTALLIZED_SUNLIGHT = ITEMS.register("crystallized_sunlight",
            () -> new Item(new Item.Properties().stacksTo(1).setNoRepair().durability(5)));
    public static final RegistryObject<Item> RAW_CRYSTALLIZED_SUNLIGHT = ITEMS.register("raw_crystallized_sunlight",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
