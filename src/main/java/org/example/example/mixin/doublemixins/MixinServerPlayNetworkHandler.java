package org.example.example.mixin.doublemixins;

import net.minecraft.server.network.handler.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerPlayNetworkHandler.class)
public class MixinServerPlayNetworkHandler {
    @ModifyConstant(constant = @Constant(doubleValue = 3.0E7, ordinal = 0), method = "handlePlayerMove")
    private static double modifyIllegalPosKick(double original) {
        return 2.0E9D;
    }
    @ModifyConstant(constant = @Constant(doubleValue = 3.0E7, ordinal = 1), method = "handlePlayerMove")
    private static double modifyIllegalPosKick2(double original) {
        return 2.0E9D;
    }
}
