package name.juyue.mods.juyue_easycar.until.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class EntityVehicleBase extends Entity {


    public EntityVehicleBase(EntityType<?> type, World world) {
        super(type, world);
    }
}
