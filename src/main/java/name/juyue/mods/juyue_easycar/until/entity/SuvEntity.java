package name.juyue.mods.juyue_easycar.until.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

/**
 * SuvEntity
 */
public abstract class SuvEntity extends MobEntity implements ModInitializer {

    public static final EntityType<Entity> SUV = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("entitytest", "suv"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE).dimensions(EntityDimensions.fixed(0.76f, 0.75f)).build()
    );

    protected SuvEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void onInitialize() {

    }

    /**
     * SUV外观界定渲染器
     */
    public static class SuvRenderer extends MobEntityRenderer<SuvEntity, SuvModel> {

        public SuvRenderer(EntityRendererFactory.Context context) {
            super(context, new SuvModel(), 0.5f);
        }

        @Override
        public Identifier getTexture(SuvEntity entity) {
            return new Identifier("entitytest", "textuers/entity/suv/suv.png");
        }

    }

}
