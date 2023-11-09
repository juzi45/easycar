package name.juyue.mods.juyue_easycar.until.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
<<<<<<< HEAD
import net.minecraft.client.render.entity.EntityRenderDispatcher;
=======
>>>>>>> origin/master
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
<<<<<<< HEAD
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
=======
>>>>>>> origin/master
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

<<<<<<< HEAD

<<<<<<<< HEAD:src/main/java/name/juyue/mods/juyue_easycar/until/entity/SuvEntity.java


//suv main suv的主体
public abstract class SuvEntity extends Entity{

    public SuvEntity(EntityType<?> type, World world) {
        super(type, world);
    }
}
//suv属性
abstract class SuvEntityRegistry extends MobEntity implements ModInitializer {

     public static  final EntityType<Entity> SUV = Registry.register(
             Registries.ENTITY_TYPE,
             new Identifier("entitytest","suv"),
             FabricEntityTypeBuilder.create(SpawnGroup.CREATURE).dimensions(EntityDimensions.fixed(0.76f,0.75f)).build()
             );

    protected SuvEntityRegistry(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    //suv外观界定渲染器
public static class SuvRenderer extends MobEntityRenderer<SuvEntityRegistry,SuvModel>{
    public  SuvRenderer(EntityRenderDispatcher entityRenderDispatcher){
        super(entityRenderDispatcher,
                new SuvModel(),
                0.5f);
    }
    @Override
    public Identifier getTexture(SuvEntityRegistry entity){
        return new Identifier("entitytest","textuers/entity/suv/suv.png");
    }
========
/**
 * Suv
 */
public abstract class Suv extends AbstractMinecartEntity {

    protected Suv(EntityType<?> type, World world, double x, double y, double z) {
        super(type, world, x, y, z);
    }

    protected Item getItem() {
        return Items.MINECART;
    }
>>>>>>>> origin/master:src/main/java/name/juyue/mods/juyue_easycar/until/entity/Suv.java

}
//返回到clinet

=======
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
>>>>>>> origin/master
