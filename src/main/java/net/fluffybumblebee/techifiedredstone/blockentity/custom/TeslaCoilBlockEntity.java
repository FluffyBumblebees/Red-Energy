package net.fluffybumblebee.techifiedredstone.blockentity.custom;

import net.fluffybumblebee.techifiedredstone.blockentity.TRBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class TeslaCoilBlockEntity extends BlockEntity {
    public TeslaCoilBlockEntity(BlockPos pos, BlockState state) {
        super(TRBlockEntities.TESLA_COIL_BLOCK_ENTITY, pos, state);
    }
}
