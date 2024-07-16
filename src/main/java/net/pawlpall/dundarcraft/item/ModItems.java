package net.pawlpall.dundarcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pawlpall.dundarcraft.dundarcraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dundarcraft.MODID);

    public static final RegistryObject<Item> SAHIN = ITEMS.register("sahin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DUNDARCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_SAHIN = ITEMS.register("raw_sahin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DUNDARCRAFT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
