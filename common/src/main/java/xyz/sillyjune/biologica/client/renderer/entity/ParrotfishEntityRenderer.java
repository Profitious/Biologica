package xyz.sillyjune.biologica.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import xyz.sillyjune.biologica.Biologica;
import xyz.sillyjune.biologica.client.model.BiologicaEntityModelLayers;
import xyz.sillyjune.biologica.client.model.entity.ParrotfishEntityModel;
import xyz.sillyjune.biologica.entity.ParrotfishEntity;

public class ParrotfishEntityRenderer extends MobRenderer<ParrotfishEntity, ParrotfishEntityModel<ParrotfishEntity>> {
    private static final ResourceLocation LOCATION = new ResourceLocation(Biologica.MOD_ID, "textures/entity/parrotfish/parrotfish_greenbelly.png");

    public ParrotfishEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new ParrotfishEntityModel<>(context.bakeLayer(BiologicaEntityModelLayers.PARROTFISH)), 0.4f);
    }

    @Override
    public void render(ParrotfishEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }

    @Override
    protected void setupRotations(ParrotfishEntity entity, PoseStack poseStack, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupRotations(entity, poseStack, ageInTicks, rotationYaw, partialTicks);
        float f = 1.0F;
        float g = 1.0F;
        if (!entity.isInWater()) {
            f = 1.3F;
            g = 1.7F;
        }

        float h = f * 4.3F * Mth.sin(g * 0.6F * ageInTicks);
        poseStack.mulPose(Axis.YP.rotationDegrees(h));
        poseStack.translate(0.0F, 0.0F, -0.4F);
        if (!entity.isInWater()) {
            poseStack.translate(22.0 / 16, 0.1F, 0.0F);
            poseStack.mulPose(Axis.ZP.rotationDegrees(90.0F));
        } else {
            poseStack.translate(0.0, -22.0 / 16, 0.0);
        }
    }

    @Override
    public ResourceLocation getTextureLocation(ParrotfishEntity entity) {
        return LOCATION;
    }
}
