package xyz.sillyjune.biologica.client.model.entity;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartNames;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import xyz.sillyjune.biologica.entity.ParrotfishEntity;

public class ParrotfishEntityModel<T extends ParrotfishEntity> extends HierarchicalModel<T> {
    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart rightFin;
    private final ModelPart leftFin;
    private final ModelPart tailFin;

    public ParrotfishEntityModel(ModelPart root) {
        this.root = root;
        this.body = root.getChild(PartNames.BODY);
        this.rightFin = this.body.getChild(PartNames.RIGHT_FIN);
        this.leftFin = this.body.getChild(PartNames.LEFT_FIN);
        this.tailFin = this.body.getChild(PartNames.TAIL_FIN);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition definition = new MeshDefinition();

        PartDefinition root = definition.getRoot();

        PartDefinition body = root.addOrReplaceChild(PartNames.BODY,
                CubeListBuilder.create()
                        .texOffs(0, 0).addBox(-2.5F, -4.0F, -6.0F, 5.0F, 8.0F, 11.0F, new CubeDeformation(0.002F))
                        .texOffs(34, 31).addBox(-1.5F, 0.0F, -7.5F, 3.0F, 4.0F, 2.0F)
                        .texOffs(34, 37).addBox(-1.5F, 0.0F, -6.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.002F))
                        .texOffs(32, 12).addBox(-2.5F, -4.0F, -7.5F, 5.0F, 4.0F, 2.0F)
                        .texOffs(32, 6).addBox(-2.5F, -4.0F, -8.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.002F))
                        .texOffs(32, 0).addBox(-2.5F, -5.0F, -8.0F, 5.0F, 1.0F, 5.0F)
                        .texOffs(18, 19).addBox(0.0F, -6.0F, -4.0F, 0.0F, 2.0F, 10.0F)
                        .texOffs(18, 31).addBox(0.0F, 4.0F, -2.0F, 0.0F, 2.0F, 8.0F),
                PartPose.offset(0.0F, -4.0F, 0.0F)
        );

        body.addOrReplaceChild(PartNames.RIGHT_FIN,
                CubeListBuilder.create()
                        .texOffs(38, 18).mirror().addBox(-3.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F),
                PartPose.offset(-2.5F, 2.0F, -3.0F)
        );

        body.addOrReplaceChild(PartNames.LEFT_FIN,
                CubeListBuilder.create()
                        .texOffs(38, 18).addBox(0.0F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F),
                PartPose.offset(2.5F, 2.0F, -3.0F)
        );

        body.addOrReplaceChild(PartNames.TAIL_FIN,
                CubeListBuilder.create()
                        .texOffs(0, 19).addBox(0.0F, -6.0F, 0.0F, 0.0F, 12.0F, 9.0F),
                PartPose.offset(0.0F, 0.0F, 5.0F)
        );

        return LayerDefinition.create(definition, 64, 64);
    }

    @Override
    public ModelPart root() {
        return this.root;
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
