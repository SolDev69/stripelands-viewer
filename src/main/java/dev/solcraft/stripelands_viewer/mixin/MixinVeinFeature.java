package dev.solcraft.stripelands_viewer.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.VeinFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Random;

@Mixin(VeinFeature.class)
public class MixinVeinFeature {

    /**
     * @author SolDev
     * @reason fix `java.lang.RuntimeException: Already decorating` at far distances
     */
    @Overwrite
    public boolean place(World world, Random random, BlockPos pos) {
        double var4 = random.nextDouble() * Math.PI;
        double var5 = (pos.getX() + 8) + Math.sin(var4) * ((IMixinVeinFeature) this).getSize() / 8.0F;
        double var7 = (pos.getX() + 8) - Math.sin(var4) * ((IMixinVeinFeature) this).getSize() / 8.0F;
        double var9 = (pos.getZ() + 8) + Math.cos(var4) * ((IMixinVeinFeature) this).getSize() / 8.0F;
        double var11 = (pos.getZ() + 8) - Math.cos(var4) * ((IMixinVeinFeature) this).getSize() / 8.0F;
        double var13 = pos.getY() + random.nextInt(3) - 2;
        double var15 = pos.getY() + random.nextInt(3) - 2;

        for(int var17 = 0; var17 < ((IMixinVeinFeature) this).getSize(); ++var17) {
            double var18 = var17 / (double)((IMixinVeinFeature) this).getSize();
            double var19 = var5 + (var7 - var5) * var18;
            double var21 = var13 + (var15 - var13) * var18;
            double var23 = var9 + (var11 - var9) * var18;
            double var25 = random.nextDouble() * (double)((IMixinVeinFeature) this).getSize() / 16.0;
            double v = (Math.sin(Math.PI * var18) + 1.0F) * var25;
            double var27 = v + 1.0;
            double var29 = v + 1.0;
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
                                    BlockPos blockPos = new BlockPos(var37, var40, var43);
                                    if (((IMixinVeinFeature) this).getReplaceable().apply(world.getBlockState(blockPos))) {
                                        world.setBlockState(blockPos, ((IMixinVeinFeature) this).getBlockState(), 2);
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
