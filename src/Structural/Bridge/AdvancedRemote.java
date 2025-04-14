package Structural.Bridge;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

    public void saveChannel(int channelNumber) {
        System.out.println("Saved channel " + channelNumber + " as favorite");
        setChannel(channelNumber);
    }
}