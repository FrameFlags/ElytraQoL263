package itamio.elytraqol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElytraQoLLogicTest {
    @Test void speedCap() {
        assertEquals(20.0, ElytraQoLLogic.speed(50.0f, false, 20.0f), 1e-9);
        assertEquals(50.0, ElytraQoLLogic.speed(50.0f, true, 20.0f), 1e-9);
    }
    @Test void rocketBoost() {
        assertTrue(ElytraQoLLogic.rocketBoost(true, 1));
        assertFalse(ElytraQoLLogic.rocketBoost(false, 1));
        assertFalse(ElytraQoLLogic.rocketBoost(true, 0));
    }
}
