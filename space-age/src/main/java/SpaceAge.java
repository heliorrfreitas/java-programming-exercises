import java.util.HashMap;
import java.util.Map;

class SpaceAge {

    private double seconds;

    private static final Map<String, Double> ORBITAL_PERIOD = new HashMap<>();

    static {
        ORBITAL_PERIOD.put("mercury", 0.2408467);
        ORBITAL_PERIOD.put("venus", 0.61519726);
        ORBITAL_PERIOD.put("mars", 1.8808158);
        ORBITAL_PERIOD.put("jupiter", 11.862615);
        ORBITAL_PERIOD.put("saturn", 29.447498);
        ORBITAL_PERIOD.put("uranus", 84.016846);
        ORBITAL_PERIOD.put("neptune", 164.79132);
    }


    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds() / (60 * 60 * 24 * 365.25);

    }

    double onMercury() {
        return onEarth() / ORBITAL_PERIOD.get("mercury");
    }

    double onVenus() {
        return onEarth() / ORBITAL_PERIOD.get("venus");
    }

    double onMars() {
        return onEarth() / ORBITAL_PERIOD.get("mars");
    }

    double onJupiter() {
        return onEarth() / ORBITAL_PERIOD.get("jupiter");
    }

    double onSaturn() {
        return onEarth() / ORBITAL_PERIOD.get("saturn");
    }

    double onUranus() {
        return onEarth() / ORBITAL_PERIOD.get("uranus");
    }

    double onNeptune() {
        return onEarth() / ORBITAL_PERIOD.get("neptune");
    }

}
