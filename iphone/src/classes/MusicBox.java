package classes;

import java.util.List;

public class MusicBox {
    private List<String> allMusics = List.of("pagão", "leno brega - campo grande", "don toliver");
    private int musicIndex = 0;
    private String music = allMusics.get(musicIndex);
    private boolean isOn = false;
    private boolean isPaused = false;

    public void selectMusic(final int index) {
        musicIndex = index;
        System.out.println("Your music: " + music);
    }

    public void on() {
        this.isOn = true;
    }

    public void togglePaused() {
        this.isPaused = !isPaused;
    }
}
