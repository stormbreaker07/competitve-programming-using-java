public class App {


    public static void main(String[] args) {

        ElectronicDevice electronicDevice = TVRemote.getDevice();
        TurnOff turnOff = new TurnOff();
        TurnOn turnOn = new TurnOn();
        DeviceButton deviceButton = new DeviceButton(turnOn);
        deviceButton.pressButton();
        DeviceButton deviceButton1 = new DeviceButton(turnOff);
        deviceButton1.pressButton();
    }
}
