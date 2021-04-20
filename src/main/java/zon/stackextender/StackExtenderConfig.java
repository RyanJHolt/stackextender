package zon.stackextender;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "StackExtender")
class StackExtenderConfig implements ConfigData {
    boolean toggleA = true;
    boolean toggleB = false;

    @ConfigEntry.Gui.CollapsibleObject
    InnerStuff stack_Sizes = new InnerStuff();

    @ConfigEntry.Gui.Excluded
    InnerStuff invisibleStuff = new InnerStuff();

    static class InnerStuff {
        int smallStackSize = 64;
        int StackSize = 128;
    }
}