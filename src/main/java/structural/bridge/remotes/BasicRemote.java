package structural.bridge.remotes;

import structural.bridge.devices.Device;

public class BasicRemote extends Remote{

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void showDetailStatus() {
        System.out.println("This is simple Remote and show simple status");
        super.showStatus();
    }
}
