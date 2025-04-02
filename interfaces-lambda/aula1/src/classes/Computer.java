package classes;

public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void startMusic() {
        System.out.println("music");        
    }

    @Override
    public void stopMusic() {
        System.out.println("music");                        
    }

    @Override
    public void jumpMusic() {
        System.out.println("music");                        
    }

    @Override
    public void startVideo() {
        System.out.println("video");                
    }

    @Override
    public void jumpVideo() {
        System.out.println("video");        
    }

    @Override
    public void stopVideo() {
        System.out.println("video");        
    }
}
