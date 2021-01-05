public class WaterBottle {
    private int volume = 0;

    public int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
            return;
        }
        if(volume < 0) return;
        this.volume = volume;
    }
    public void fill() {
        setVolume(100);
    }
    public void empty() {
        setVolume(0);
    }
    public boolean takeDrink() {
        if(volume - 10 < 0) return false;
        volume -= 10;
        return true;
    }
}
