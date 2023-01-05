package org.example.example.mixin.doublemixins;

import net.minecraft.server.command.WorldBorderCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WorldBorderCommand.class)
public class MixinWorldBorderComamnd {
    @ModifyConstant(constant = @Constant(doubleValue = 6.0E7D, ordinal = 0), method = "run")
    private static double modifyWorldBorderCommand(double original) {
        return 4.0E9D;
    }
    @ModifyConstant(constant = @Constant(doubleValue = 6.0E7D, ordinal = 1), method = "run")
    private static double modifyWorldBorderCommand2(double original) {
        return 4.0E9D;
    }
}
