package org.example.example.mixin.integermixins;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(World.class)
public class MixinWorld {
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 0), method = "contains")
    private static int modifyContains(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 1), method = "contains")
    private static int modifyContains2(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 0), method = "contains")
    private static int modifyNegativeContains(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 1), method = "contains")
    private static int modifyNegativeContains2(int original) {
        return Integer.MIN_VALUE;
    }

    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 0), method = "getRawBrightness(Lnet/minecraft/util/math/BlockPos;Z)I")
    private static int modifyGetRawBrightness(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 1), method = "getRawBrightness(Lnet/minecraft/util/math/BlockPos;Z)I")
    private static int modifyGetRawBrightness2(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 0), method = "getRawBrightness(Lnet/minecraft/util/math/BlockPos;Z)I")
    private static int modifyNegativeGetRawBrightness(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 1), method = "getRawBrightness(Lnet/minecraft/util/math/BlockPos;Z)I")
    private static int modifyNegativeGetRawBrightness2(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 0), method = "getHeight(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;")
    private static int modifyGetHeight(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 1), method = "getHeight(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;")
    private static int modifyGetHeight2(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 0), method = "getHeight(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;")
    private static int modifyNegativeGetHeight(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 1), method = "getHeight(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;")
    private static int modifyNegativeGetHeight2(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 0), method = "getLowestHeight")
    private static int modifyGetLowestHeight(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 1), method = "getLowestHeight")
    private static int modifyGetLowestHeight2(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 0), method = "getLowestHeight")
    private static int modifyNegativeGetLowestHeight(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 1), method = "getLowestHeight")
    private static int modifyNegativeGetLowestHeight2(int original) {
        return Integer.MIN_VALUE;
    }

    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 0), method = "getBlockCollisions")
    private int modifyCollisionBoxes(int original) {
        return Integer.MAX_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = 30000000, ordinal = 1), method = "getBlockCollisions")
    private int modifyCollisionBoxes2(int original) {
        return Integer.MAX_VALUE;
    }

    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 0), method = "getBlockCollisions")
    private int modifyNegativeCollisionBoxes(int original) {
        return Integer.MIN_VALUE;
    }
    @ModifyConstant(constant = @Constant(intValue = -30000000, ordinal = 1), method = "getBlockCollisions")
    private int modifyNegativeCollisionBoxes2(int original) {
        return Integer.MIN_VALUE;
    }


}
