package name.juyue.mods.juyue_easycar.until;

import name.juyue.mods.juyue_easycar.Juyue_easy_car;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static name.juyue.mods.juyue_easycar.Juyue_easy_car.modid;
import static net.minecraft.registry.Registry.register;

public class RegistryItem {
//该处可复制test增加物品

    public static final Item test = RegisterItem("test");

    public static net.minecraft.item.Item RegisterItem(String id) {
        return register(Registries.ITEM, new Identifier(modid, id), new net.minecraft.item.Item(new FabricItemSettings()));
    }
    //双函数互相链接，可去除debug
    /*
    下方引用至主线程
    如缺少会提示需要返回
     */
    public static void RegisterItem(){
        Juyue_easy_car.LOGGER.debug("Loading for Items of"+Juyue_easy_car.MOD_ID,"Mod");
    }}
