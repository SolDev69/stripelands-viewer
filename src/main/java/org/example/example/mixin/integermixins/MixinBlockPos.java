package org.example.example.mixin.integermixins;

import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(BlockPos.class)
public class MixinBlockPos {
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 0), method = "<clinit>")
    private static int modifyBlockPos(int original) {
        return Integer.MAX_VALUE;
    }
}
