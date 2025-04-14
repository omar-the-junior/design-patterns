package Structural.Bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.enable();
    }

    public void turnOff() {
        device.disable();
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}