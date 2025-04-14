package Structural.Bridge;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void channelUp() {
        setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        setChannel(device.getChannel() - 1);
    }

    public void volumeUp() {
        setVolume(device.getVolume() + 10);
    }

    public void volumeDown() {
        setVolume(device.getVolume() - 10);
    }
}