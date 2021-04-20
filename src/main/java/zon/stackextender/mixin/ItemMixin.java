package zon.stackextender.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zon.stackextender.client.StackextenderClient;

@Mixin(Item.class)
public class ItemMixin {

    @Mutable
    @Shadow @Final private int maxCount;

    @Inject(at = @At("HEAD"), method = "getMaxCount")
    private void getMaxCount(CallbackInfoReturnable<Integer> cir){
        maxCount = StackextenderClient.itemStackSize;
    }
}
