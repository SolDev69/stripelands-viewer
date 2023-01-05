package org.example.example.mixin.integermixins;

import net.minecraft.server.command.Command;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(Command.class)
public class MixinCommand {
    @ModifyArgs(method = "parseCoordinate(DLjava/lang/String;Z)Lnet/minecraft/server/command/Command$Coordinate;", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/command/Command;parseCoordinate(DLjava/lang/String;IIZ)Lnet/minecraft/server/command/Command$Coordinate;"))
    private static void modifyParseCoordinateReturnValue(Args args) {
        args.set(2, Integer.MIN_VALUE);
        args.set(3, Integer.MAX_VALUE);
    }

    @ModifyArgs(method = "parseRawCoordinate(DLjava/lang/String;Z)D", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/command/Command;parseRawCoordinate(DLjava/lang/String;IIZ)D"))
    private static void modifyParseRawCoordinateReturnValue(Args args) {
        args.set(2, Integer.MIN_VALUE);
        args.set(3, Integer.MAX_VALUE);
    }
}
