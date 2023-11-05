package name.juyue.mods.juyue_easycar.client;

import name.juyue.mods.juyue_easycar.until.RegistryItem;
import net.fabricmc.api.ClientModInitializer;

public class Juyue_easy_carClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        RegistryItem.RegisterItem();
    }
}
