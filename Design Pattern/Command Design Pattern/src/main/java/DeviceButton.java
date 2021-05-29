public class DeviceButton {

    Commands commands = null;

    public DeviceButton(Commands commands1) {
        commands = commands1;
    }

    public void pressButton( ) {
        commands.execute();
    }

}
