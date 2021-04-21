package zon.stackextender.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import zon.stackextender.Stackextender;

@Mixin(ServerPlayNetworkHandler.class)
public class CreativeMixin {
        @ModifyConstant(method = "onCreativeInventoryAction", constant = @Constant(intValue = 64))
        int getMaxCountPerStack(int i){
            return Math.max(Stackextender.itemStackSize, Stackextender.smallItemStackSize);
        }
}
