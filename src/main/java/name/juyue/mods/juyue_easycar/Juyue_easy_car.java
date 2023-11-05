package name.juyue.mods.juyue_easycar;

import name.juyue.mods.juyue_easycar.until.RegistryItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Juyue_easy_car implements ModInitializer {
    public static final String MOD_ID = "juyue_easy-car";
    public static String modid="juyue_easy-car";
    /**
     * Runs the mod initializer.
     */

    public static final Logger LOGGER = LoggerFactory.getLogger(modid);
    @Override
    public void onInitialize() {
        RegistryItem.RegisterItem();
    }
}
