package org.example.example.mixin.doublemixins;

import net.minecraft.world.border.WorldBorder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WorldBorder.class)
public class MixinWorldBorder {
    @ModifyConstant(constant = @Constant(doubleValue = 6.0E7D, ordinal = 0), method = "<init>")
    private static double modifyWorldBorderSize(double original) {
        return 4.0E9D;
    }
    @ModifyConstant(constant = @Constant(intValue = 29999984, ordinal = 0), method = "<init>")
    private static int modifyWorldBorderMaxSize(int original) {
        return Integer.MAX_VALUE;
    }
}
