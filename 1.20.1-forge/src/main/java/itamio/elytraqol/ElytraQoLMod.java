package itamio.elytraqol;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Elytra QoL — unofficial 1.20.1 port (Forge). */
@Mod(ElytraQoLMod.MOD_ID)
public class ElytraQoLMod {
    public static final String MOD_ID = "elytraqol263_1201";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ElytraQoLMod() {
        LOGGER.info("[Elytra QoL] initialized on Minecraft 1.20.1 (Forge)");
    }
}
