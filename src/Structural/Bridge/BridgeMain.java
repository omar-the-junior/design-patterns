package Structural.Bridge;

public class BridgeMain {
    public static void main(String[] args) {
        // Testing with TV
        Device tv = new TV();
        BasicRemote basicTvRemote = new BasicRemote(tv);
        AdvancedRemote advancedTvRemote = new AdvancedRemote(tv);

        System.out.println("Basic Remote with TV:");
        basicTvRemote.turnOn();
        basicTvRemote.setChannel(5);
        basicTvRemote.volumeUp();
        System.out.println("TV Channel: " + tv.getChannel());
        System.out.println("TV Volume: " + tv.getVolume());

        System.out.println("\nAdvanced Remote with TV:");
        advancedTvRemote.mute();
        advancedTvRemote.saveChannel(7);
        System.out.println("TV Volume after mute: " + tv.getVolume());

        // Testing with Radio
        Device radio = new Radio();
        BasicRemote basicRadioRemote = new BasicRemote(radio);
        AdvancedRemote advancedRadioRemote = new AdvancedRemote(radio);

        System.out.println("\nBasic Remote with Radio:");
        basicRadioRemote.turnOn();
        basicRadioRemote.setChannel(98);  // FM 98.0
        basicRadioRemote.volumeUp();
        System.out.println("Radio Channel: " + radio.getChannel());
        System.out.println("Radio Volume: " + radio.getVolume());

        System.out.println("\nAdvanced Remote with Radio:");
        advancedRadioRemote.mute();
        advancedRadioRemote.saveChannel(101);
        System.out.println("Radio Volume after mute: " + radio.getVolume());
    }
}