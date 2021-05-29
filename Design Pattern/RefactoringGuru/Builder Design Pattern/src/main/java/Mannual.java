public class Mannual {

    private WheelAndRims wheelAndRims;
    private Engine engine;
    private Body body;

    public Mannual(WheelAndRims wheelAndRims , Engine engine , Body body) {
        this.wheelAndRims = wheelAndRims;
        this.body = body;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Mannual{" +
                "wheelAndRims=" + wheelAndRims +
                ", engine=" + engine +
                ", body=" + body +
                '}';
    }
}
