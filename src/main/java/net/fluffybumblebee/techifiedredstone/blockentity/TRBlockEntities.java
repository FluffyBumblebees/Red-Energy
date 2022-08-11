package net.fluffybumblebee.techifiedredstone.blockentity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fluffybumblebee.techifiedredstone.block.TRBlocks;
import net.fluffybumblebee.techifiedredstone.blockentity.custom.TeslaCoilBlockEntity;
import net.fluffybumblebee.techifiedredstone.util.IdentifierUtil;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TRBlockEntities {
    public static void loadClass() {}
    public static final BlockEntityType<TeslaCoilBlockEntity> TESLA_COIL_BLOCK_ENTITY = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier(IdentifierUtil.ID, "tesla_coil_block_entity"),
            FabricBlockEntityTypeBuilder.create(TeslaCoilBlockEntity::new, TRBlocks.TESLA_COIL_BLOCK).build()
    );
}
