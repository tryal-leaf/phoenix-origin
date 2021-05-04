package tryalleaf.phoenix.powers;

import io.github.apace100.origins.power.Power;
import io.github.apace100.origins.power.PowerType;
import io.github.apace100.origins.power.PowerTypeReference;
import net.minecraft.util.Identifier;
import tryalleaf.phoenix.Phoenix;

public class PhoenixPowers {
  public static final PowerType<Power> FLIGHT_CUSTOM_WINGS =
      new PowerTypeReference<>(new Identifier(Phoenix.MOD_ID, "flight_custom_wings"));
}
