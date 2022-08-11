package net.fluffybumblebee.techifiedredstone.mixin;

import net.fluffybumblebee.techifiedredstone.block.TRBlocks;
import net.minecraft.block.AbstractRedstoneGateBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(AbstractRedstoneGateBlock.class)
public class AbstractRedstoneGateBlockMixin {
    @Inject(method = "getPower", at = @At("HEAD"), cancellable = true)
    private void cancel(World world, BlockPos pos, BlockState state, CallbackInfoReturnable<Boolean> cir) {
    }
}
