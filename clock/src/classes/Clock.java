package classes;

public abstract class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if(hours >= 24) {
            hours = 24;
            return;
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if(minutes >= 60) {
            minutes = 60;
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds >= 60) {
            seconds = 60;
        }
        this.seconds = seconds;
    }
    
    public abstract Clock getFullHour(Clock clock);
}
