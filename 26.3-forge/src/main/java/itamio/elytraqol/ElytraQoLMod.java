package itamio.elytraqol;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Elytra QoL — unofficial 26.3 port (Forge). */
@Mod(ElytraQoLMod.MOD_ID)
public class ElytraQoLMod {
    public static final String MOD_ID = "elytraqol263";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ElytraQoLMod() {
        LOGGER.info("[Elytra QoL] initialized on Minecraft 26.3 (Forge)");
    }
}
