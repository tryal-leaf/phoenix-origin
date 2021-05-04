package tryalleaf.phoenix;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tryalleaf.phoenix.registry.ModItems;

public class Phoenix implements ModInitializer {

  public static Logger LOGGER = LogManager.getLogger();

  public static final String MOD_ID = "phoenix";
  public static final String MOD_NAME = "Phoenix Origin";

  @Override
  public void onInitialize() {
    log(Level.INFO, "Initializing");
    ModItems.register();
  }

  public static void log(Level level, String message) {
    LOGGER.log(level, "[" + MOD_NAME + "] " + message);
  }

}