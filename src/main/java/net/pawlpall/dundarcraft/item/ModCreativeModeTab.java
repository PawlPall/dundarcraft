package net.pawlpall.dundarcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DUNDARCRAFT_TAB = new CreativeModeTab("dundarcrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SAHIN.get());
        }
    };
}
