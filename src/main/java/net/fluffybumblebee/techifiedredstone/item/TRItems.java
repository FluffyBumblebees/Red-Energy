package net.fluffybumblebee.techifiedredstone.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fluffybumblebee.techifiedredstone.item.custom.WrenchItem;
import net.fluffybumblebee.techifiedredstone.util.IdentifierUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TRItems {
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(IdentifierUtil.ID, "redstone_wrench"), TRItems.REDSTONE_WRENCH);
        Registry.register(Registry.ITEM, new Identifier(IdentifierUtil.ID, "tesla_coil"), TRItems.TESLA_COIL);
    }

    public static final WrenchItem REDSTONE_WRENCH = new WrenchItem(new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TESLA_COIL = new Item((new FabricItemSettings().group(ItemGroup.REDSTONE)));
}
