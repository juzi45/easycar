package name.juyue.mods.juyue_easycar.until.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public abstract class Suv extends AbstractMinecartEntity{


    protected Suv(EntityType<?> type, World world, double x, double y, double z) {
        super(type, world, x, y, z);
    }
    protected Item getItem() {
        return Items.MINECART;
    }
}

abstract class SuvEntity implements ModInitializer {

     public static  final EntityType<Entity> SUV = Registry.register(
             Registries.ENTITY_TYPE,
             new Identifier("entitytest","suv"),
             FabricEntityTypeBuilder.create(SpawnGroup.CREATURE).dimensions(EntityDimensions.fixed(0.76f,0.75f)).build()
             );

    @Override
    public void onInitialize() {

    }
}
