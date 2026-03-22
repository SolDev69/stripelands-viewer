package dev.solcraft.stripelands_viewer.mixin.integermixins;

import net.minecraft.server.PlayerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(PlayerManager.class)
public class MixinPlayerManager {
    @ModifyArgs(method = "changeDimension(Lnet/minecraft/entity/Entity;ILnet/minecraft/server/world/ServerWorld;Lnet/minecraft/server/world/ServerWorld;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(III)I"))
    private void modifyClamp1(Args args) {
        args.set(1, Integer.MIN_VALUE);
        args.set(2, Integer.MAX_VALUE);
    }
    @ModifyArgs(method = "changeDimension(Lnet/minecraft/entity/Entity;ILnet/minecraft/server/world/ServerWorld;Lnet/minecraft/server/world/ServerWorld;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(III)I", ordinal = 1))
    private void modifyClamp2(Args args) {
        args.set(1, Integer.MIN_VALUE);
        args.set(2, Integer.MAX_VALUE);
    }
}
