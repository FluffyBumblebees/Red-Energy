package net.fluffybumblebee.techifiedredstone.block.custom;

import net.fluffybumblebee.techifiedredstone.blockentity.custom.TeslaCoilBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class TeslaCoilBlock extends Block implements BlockEntityProvider {
    public TeslaCoilBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TeslaCoilBlockEntity(pos, state);
    }
}
