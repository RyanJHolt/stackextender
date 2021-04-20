package zon.stackextender;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Stackextender implements ModInitializer {

    public static int itemStackSize;
    public static int smallItemStackSize;

    @Override
    public void onInitialize() {
       AutoConfig.register(StackExtenderConfig.class, Toml4jConfigSerializer::new);
       StackExtenderConfig config = AutoConfig.getConfigHolder(StackExtenderConfig.class).getConfig();
       itemStackSize = config.stack_Sizes.StackSize;
       smallItemStackSize = config.stack_Sizes.smallStackSize;
    }
}
