package zon.stackextender.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;


@Environment(EnvType.CLIENT)
public class StackextenderClient implements ClientModInitializer {
    public static int itemStackSize = 128;
    private static final MinecraftClient CLIENT = MinecraftClient.getInstance();

    @Override
    public void onInitializeClient() {
    }
}
