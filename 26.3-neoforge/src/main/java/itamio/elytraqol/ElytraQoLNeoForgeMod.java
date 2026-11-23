package itamio.elytraqol;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Elytra QoL — unofficial 26.3 port (NeoForge). */
@Mod(ElytraQoLNeoForgeMod.MOD_ID)
public class ElytraQoLNeoForgeMod {
    public static final String MOD_ID = "elytraqol263";
    public static final Logger LOGGER = LoggerFactory.getLogger("Elytra QoL");

    public ElytraQoLNeoForgeMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("[Elytra QoL] initialized on Minecraft 26.3 (NeoForge)");
    }
}
