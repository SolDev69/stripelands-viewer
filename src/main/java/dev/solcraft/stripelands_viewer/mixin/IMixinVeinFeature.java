package dev.solcraft.stripelands_viewer.mixin;

import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockState;
import net.minecraft.world.gen.feature.VeinFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(VeinFeature.class)
public interface IMixinVeinFeature {

    @Accessor("size")
    int getSize();

    @Accessor("replaceable")
    Predicate getReplaceable();

    @Accessor("state")
    BlockState getBlockState();
}
