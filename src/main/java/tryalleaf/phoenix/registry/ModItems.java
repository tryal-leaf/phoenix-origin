package tryalleaf.phoenix.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tryalleaf.phoenix.Phoenix;

public class ModItems {

  public static final Item PHOENIX_ELYTRA = new Item(new FabricItemSettings().group(ItemGroup.MISC));

  public static void register () {
    Registry.register(Registry.ITEM, new Identifier(Phoenix.MOD_ID, "phoenix_elytra"), PHOENIX_ELYTRA);
  }
}
