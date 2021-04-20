package zon.stackextender.mixin;


import net.minecraft.inventory.Inventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import zon.stackextender.Stackextender;

@SuppressWarnings("OverwriteAuthorRequired")
@Mixin(Inventory.class)
interface InventoryMixin extends Inventory {

    @Overwrite
    default int getMaxCountPerStack(){
    return Stackextender.itemStackSize;
        }

}