package org.example.example.mixin.doublemixins;

import net.minecraft.world.WorldData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WorldData.class)
public class MixinWorldData {
    @ModifyConstant(constant = @Constant(doubleValue = 6.0E7D, ordinal = 0), method = "<init>*")
    private static double modifyWorldData(double original) {
        return 4.0E9D;
    }
}
