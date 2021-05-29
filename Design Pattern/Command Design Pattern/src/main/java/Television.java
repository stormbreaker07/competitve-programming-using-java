public class Television implements ElectronicDevice{


    @Override
    public void TurnOn() {
        System.out.println("the device is turned on");
    }

    @Override
    public void TurnOff() {
        System.out.println("the decive is turned off");
    }
}
