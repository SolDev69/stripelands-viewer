package org.example.example.mixin.integermixins;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {
    /**
     * @author mikenotpike
     * @reason Easiest way of doing this
     */
    @Overwrite
    public int getMaxWorldSize() {
        return Integer.MAX_VALUE;
    }
}
