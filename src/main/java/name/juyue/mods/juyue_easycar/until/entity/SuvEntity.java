package name.juyue.mods.juyue_easycar.until.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;




//suv main suv的主体
public abstract class SuvEntity extends AbstractMinecartEntity{


    public SuvEntity(EntityType<?> type, World world, double x, double y, double z) {
        super(type, world, x, y, z);
    }
    public Item getItem() {
        return Items.MINECART;
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

}
//返回到clinet



    @Override
    public void onInitialize() {

    }
}
