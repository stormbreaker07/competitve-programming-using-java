public class Director {

    private String carType;
    private CarBuilder carBuilder;
    private WheelAndRims wheelAndRims;
    private Engine engine;
    private Body body;
    private Mannual mannual;



    public Director(String carType) {
        this.carType = carType;
    }

    public Mannual makeCar() {
        if(carType.contains("SUV")) {
            carBuilder = new SuvCar();
            wheelAndRims = new WheelAndRims("4" , "polysterRubber" , "mate Grey" , "strong build" );
            body = new Body("SUV-21" , "SUV-12" , "reddish Brown" , "SUV-101-look");
            engine = new Engine("8000" , "Bmw-ECho-Build" , "supra-11");
            carBuilder.setBody(body);
            carBuilder.setEngine(engine);
            carBuilder.setWheelAndRims(wheelAndRims);
            mannual = carBuilder.FinishedCar();
        }
        else {
            carBuilder = new SuvCar();
            wheelAndRims = new WheelAndRims("4" , "polysterRubber" , "shinny-silver" , "fine-aerodynamic" );
            body = new Body("Sports-21" , "tokyoDrift-12" , "greenish Brown" , "AeroDynamic-02-look");
            engine = new Engine("120000" , "lamborgini-camero-Build" , "supra-11");
            carBuilder.setBody(body);
            carBuilder.setEngine(engine);
            carBuilder.setWheelAndRims(wheelAndRims);
            mannual = carBuilder.FinishedCar();
        }
        return mannual;
    }


}
