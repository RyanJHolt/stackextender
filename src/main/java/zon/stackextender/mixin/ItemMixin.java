package zon.stackextender.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zon.stackextender.Stackextender;

import java.io.Console;

@Mixin(Item.class)
public abstract class ItemMixin {

    @Mutable
    @Shadow @Final private int maxCount;

    @Shadow public abstract boolean isDamageable();

    @Inject(at = @At("HEAD"), method = "getMaxCount")
    private void getMaxCount(CallbackInfoReturnable<Integer> cir) {
        if (maxCount == 16 || (maxCount == 1 && !isDamageable())) {
            maxCount = Stackextender.smallItemStackSize;
        } else if (maxCount == 64) {
            maxCount = Stackextender.itemStackSize;
        }
    }
}
