package org.example.example.mixin.integermixins;

import net.minecraft.server.command.AbstractCommand;
import net.minecraft.server.command.Command;
import net.minecraft.server.command.handler.CommandRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(AbstractCommand.class)
public class MixinCommand {
    @ModifyArgs(method = "parseTeleportCoordinate(DLjava/lang/String;Z)Lnet/minecraft/server/command/AbstractCommand__Coordinate;", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/command/AbstractCommand;parseTeleportCoordinate(DLjava/lang/String;IIZ)Lnet/minecraft/server/command/AbstractCommand__Coordinate;"))
    private static void modifyParseCoordinateReturnValue(Args args) {
        args.set(2, Integer.MIN_VALUE);
        args.set(3, Integer.MAX_VALUE);
    }

//    @ModifyArgs(method = "parseRawCoordinate", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/command/Command;parseRawCoordinate(DLjava/lang/String;IIZ)D"))
//    private static void modifyParseRawCoordinateReturnValue(Args args) {
//        args.set(2, Integer.MIN_VALUE);
//        args.set(3, Integer.MAX_VALUE);
//    }
}
