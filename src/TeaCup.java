public class TeaCup implements Recievable {
    int capacity = 6;
    int volume = 0;
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getEmptyRoom() {
        return capacity - volume;
    }

    @Override
    public void getWater(int amount) {
        volume = volume + amount;
        capacity = capacity - amount;
        if(capacity < 0){
            System.out.println("Teacup is Full!");
        }
    }
}
