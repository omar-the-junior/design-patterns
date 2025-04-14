package Structural.Bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 20;
    private int channel = 87;  // FM frequency

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        // FM frequency range: 87.5 - 108.0 MHz
        if (channel >= 87 && channel <= 108) {
            this.channel = channel;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }
}