package net.petriashvili.mptmod.items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab MPT_TAB = new CreativeModeTab(" Mpt tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.AMBER.get());
        }
    };
}
