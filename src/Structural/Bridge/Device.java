package Structural.Bridge;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getChannel();

    void setChannel(int channel);

    int getVolume();

    void setVolume(int volume);
}