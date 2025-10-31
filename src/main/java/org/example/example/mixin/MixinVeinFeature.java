package org.example.example.mixin;

import com.google.common.base.Predicate;
import net.minecraft.block.state.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.VeinFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Random;

@Mixin(VeinFeature.class)
public class MixinVeinFeature {
    @Shadow private final int size;
    @Shadow private final Predicate replaceable;
    @Shadow private final BlockState state;
    public MixinVeinFeature(int size, Predicate replaceable, BlockState state) {
        this.size = size;
        this.replaceable = replaceable;
        this.state = state;
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean place(World world, Random random, BlockPos pos) {
        double var4 = random.nextDouble() * Math.PI;
        double var5 = (double)((pos.getX() + 8) + Math.sin(var4) * this.size / 8.0F);
        double var7 = (double)((pos.getX() + 8) - Math.sin(var4) * this.size / 8.0F);
        double var9 = (double)((pos.getZ() + 8) + Math.cos(var4) * this.size / 8.0F);
        double var11 = (double)((pos.getZ() + 8) - Math.cos(var4) * this.size / 8.0F);
        double var13 = (double)(pos.getY() + random.nextInt(3) - 2);
        double var15 = (double)(pos.getY() + random.nextInt(3) - 2);

        for(int var17 = 0; var17 < this.size; ++var17) {
            double var18 = var17 / (double)this.size;
            double var19 = var5 + (var7 - var5) * (double)var18;
            double var21 = var13 + (var15 - var13) * (double)var18;
            double var23 = var9 + (var11 - var9) * (double)var18;
            double var25 = random.nextDouble() * (double)this.size / 16.0;
            double var27 = (double)(Math.sin(Math.PI * var18) + 1.0F) * var25 + 1.0;
            double var29 = (double)(Math.sin(Math.PI * var18) + 1.0F) * var25 + 1.0;
            int var31 = MathHelper.floor(var19 - var27 / 2.0);
            int var32 = MathHelper.floor(var21 - var29 / 2.0);
            int var33 = MathHelper.floor(var23 - var27 / 2.0);
            int var34 = MathHelper.floor(var19 + var27 / 2.0);
            int var35 = MathHelper.floor(var21 + var29 / 2.0);
            int var36 = MathHelper.floor(var23 + var27 / 2.0);

            for(int var37 = var31; var37 <= var34; ++var37) {
                double var38 = ((double)var37 + 0.5 - var19) / (var27 / 2.0);
                if (var38 * var38 < 1.0) {
                    for(int var40 = var32; var40 <= var35; ++var40) {
                        double var41 = ((double)var40 + 0.5 - var21) / (var29 / 2.0);
                        if (var38 * var38 + var41 * var41 < 1.0) {
                            for(int var43 = var33; var43 <= var36; ++var43) {
                                double var44 = ((double)var43 + 0.5 - var23) / (var27 / 2.0);
                                if (var38 * var38 + var41 * var41 + var44 * var44 < 1.0) {
                                    BlockPos var46 = new BlockPos(var37, var40, var43);
                                    if (this.replaceable.apply(world.getBlockState(var46))) {
                                        world.setBlockState(var46, this.state, 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
