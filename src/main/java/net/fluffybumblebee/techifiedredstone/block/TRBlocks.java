package net.fluffybumblebee.techifiedredstone.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fluffybumblebee.techifiedredstone.block.custom.TeslaCoilBlock;
import net.fluffybumblebee.techifiedredstone.util.IdentifierUtil;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TRBlocks {
    public static final TeslaCoilBlock TESLA_COIL_BLOCK = new TeslaCoilBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(4.0f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(IdentifierUtil.ID, "tesla_coil_block"), TESLA_COIL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(IdentifierUtil.ID, "example_block"), new BlockItem(TESLA_COIL_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE)));

    }
}
