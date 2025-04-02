package classes;

public non-sealed class Streamer extends Person3 {
    private String channel;
    private int views;

    public Streamer(String name, String surname, int age, String channel, int views) {
        super(name, surname, age);
        this.channel = channel;
        this.views = views;
    }
    
    public String getChannel() {
        return channel;
    }
    public int getViews() {
        return views;
    }
}
