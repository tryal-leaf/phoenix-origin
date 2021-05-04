package tryalleaf.phoenix.mixin;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.ElytraFeatureRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import tryalleaf.phoenix.Phoenix;
import tryalleaf.phoenix.powers.PhoenixPowers;

@Mixin(ElytraFeatureRenderer.class)
public class ElytraFeatureRendererMixin {

  private static final Identifier TEXTURE = new Identifier(Phoenix.MOD_ID, "textures/entity/phoenix_elytra.png");

  @Redirect(
      method = "render",
      at = @At(
          value = "INVOKE",
          target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;canRenderElytraTexture()Z"))
  private boolean canRenderPhoenixElytraTexture(AbstractClientPlayerEntity abstractClientPlayerEntity) {
    if (PhoenixPowers.FLIGHT_CUSTOM_WINGS.isActive(abstractClientPlayerEntity)) {
      return true;
    }
    return abstractClientPlayerEntity.canRenderElytraTexture();
  }

  @Redirect(
      method = "render",
      at = @At(
          value = "INVOKE",
          target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;getElytraTexture()Lnet/minecraft/util/Identifier;"))
  private Identifier getPhoenixElytraTexture(AbstractClientPlayerEntity abstractClientPlayerEntity) {
    if (PhoenixPowers.FLIGHT_CUSTOM_WINGS.isActive(abstractClientPlayerEntity)) {
      return TEXTURE;
    }
    return abstractClientPlayerEntity.getElytraTexture();
  }
}
