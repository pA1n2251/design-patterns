package structural.bridge.remotes;

import structural.bridge.devices.Device;

public class AdvancedRemote extends Remote {
    private boolean isMuted;
    private int volumeBeforeMute;

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        if (isMuted) {
            isMuted = false;
            device.setVolume(volumeBeforeMute);
        } else {
            isMuted = true;
            device.setVolume(0);
        }
    }

    @Override
    public void showDetailStatus() {
        System.out.println("This is advanced remote and shows advanced status");
        System.out.println("Is muted " + isMuted);
        super.showStatus();
    }
}
