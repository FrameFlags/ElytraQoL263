package itamio.elytraqol;

/** Pure rules for the non-rendering Elytra QoL tweaks. */
public final class ElytraQoLLogic {
    private ElytraQoLLogic() {}

    /** Optionally remove the vanilla elytra speed cap. */
    public static float speed(float current, boolean removeCap, float vanillaCap) {
        return removeCap ? current : Math.min(current, vanillaCap);
    }

    /** Rocket boost can be disabled without touching rendering. */
    public static boolean rocketBoost(boolean enabled, int rockets) {
        return enabled && rockets > 0;
    }
}
