public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override
    public void ascend(int hight) {
        if (this.flying && this.altitude >= 0) {
            this.altitude += hight;
            System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
        }
    }

    @Override
    public void glide() {
        if (this.flying && this.altitude > 0)
            System.out.println("glides into the air.");

    }

    @Override
    public void descend(int hight) {
        if (this.flying && this.altitude > 0) {
            this.altitude = Math.max(0, this.altitude - hight);
            System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
        }
    }

    @Override
    public void land() {
        if (this.flying && this.altitude < 2) {
            this.flying = false;
            this.altitude = 0;
            System.out.println(this.getName() + " lands on the ground.");
        } else
            System.out.println(this.getName() + " is too high, it can't land.");
    }
}
