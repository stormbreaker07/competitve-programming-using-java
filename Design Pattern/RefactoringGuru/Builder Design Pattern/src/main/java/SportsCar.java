public class SportsCar implements  CarBuilder {


    private Mannual mannual;
    private WheelAndRims wheelAndRims;
    private Engine engine;
    private Body body;



    public SportsCar() {}


    @Override
    public void setWheelAndRims(WheelAndRims wheelAndRims) {
        this.wheelAndRims = wheelAndRims;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public Mannual FinishedCar() {

        mannual = new Mannual(wheelAndRims , engine , body);
        return mannual;
    }
}
