package itamio.elytraqol;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Elytra QoL — unofficial 1.20.1 port (Fabric). */
public class ElytraQoLMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Elytra QoL");

    @Override
    public void onInitialize() {
        LOGGER.info("[Elytra QoL] initialized on Minecraft 1.20.1 (Fabric)");
    }
}
