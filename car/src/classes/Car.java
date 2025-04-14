package classes;

public class Car {
    private boolean isOn = false;
    private int speed = 0;
    private String side = Side.STRAIGHT.getSide();
    private int gear = 1;

    public void turnOn() {
        this.isOn = true;
        System.out.println("The car is on!");
    }

    public void turnOff() {
        if(this.speed != 0) {
            System.out.println("Stop the car to turn off");
            return;
        }
        this.gear = 0;
        this.isOn = false;
        System.out.println("The car is off!");
    }

    public void accelerate(int speed) {
        if(this.speed > 300) {
            System.out.println("The car doesn't accelerate more than 300 kilometers");
            return;
        }
        this.speed += speed;
    }

    public void slowDown(int speed) {
        if(this.speed < speed) {
            System.out.println("the car is at" + this.speed + "kilometers, choose a lower number");
            return;
        }
        if(this.speed == 0) {
            System.out.println("The car is stopped");
            return;
        }
        this.speed -= speed;
    }

    public void turnSide(String sideParam) {
        if(this.speed > 1 || this.speed > 40) {
            System.out.println("The car can't turn side");
            return;
        }

        for(Side side : Side.values()) {
            if(side.getSide() != sideParam) {
                System.out.println("Invalid side");
                return;
            }
        }
        this.side = sideParam;
        System.out.println("The car is on" + sideParam + "!");
    }

    public void switchGear() {
        if(this.speed > 20 || this.speed <= 40) {
            this.gear++;
        }
        if(this.speed > 40 || this.speed <= 60) {
            this.gear++;
        }
        if(this.speed > 60 || this.speed <= 80) {
            this.gear++;
        }
        if(this.speed > 80 || this.speed <= 100) {
            this.gear++;
        }
        if(this.speed > 100 || this.speed <= 120) {
            this.gear++;
        }

        System.out.println("The car is on" + gear + " gear");
    }
}
