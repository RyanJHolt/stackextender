package zon.stackextender.mixin;


import net.fabricmc.fabric.mixin.networking.MixinServerPlayNetworkHandler;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryListener;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.inventory.Inventory;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import zon.stackextender.Stackextender;

@SuppressWarnings("OverwriteAuthorRequired")
@Mixin(Inventory.class)
interface InventoryMixin extends Inventory {

    @Overwrite
    default int getMaxCountPerStack(){
       return Math.max(Stackextender.itemStackSize, Stackextender.smallItemStackSize);
        }

}