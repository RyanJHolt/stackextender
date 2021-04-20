package zon.stackextender;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "StackExtender")
class StackExtenderConfig implements ConfigData {

    @ConfigEntry.Gui.CollapsibleObject
    InnerStuff stack_Sizes = new InnerStuff();

    static class InnerStuff {
        int smallStackSize = 64;
        int StackSize = 128;
    }
}