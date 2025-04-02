import classes.Computer;
import classes.MusicPlayer;
import classes.VideoPlayer;

public class App {
    public static void main(String[] args) throws Exception {
        MusicPlayer pc = new Computer(); //computer aceita as duas interfaces, então ele se encaixa nos dois métodos,
        runMusic(pc);
        runVideo(((VideoPlayer) pc)); // mas se eu coloco como tipo pra ele uma das interfaces, a outra não aceita, então eu consegui fazer via casting

        //não é via de regra que dê certo, nesse caso n deu erro pois só tem print nos métodos, mas em casos reais pode dar erro
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.startMusic();
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.startVideo();
    }
}
