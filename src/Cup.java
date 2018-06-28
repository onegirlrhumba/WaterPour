public class Cup implements Recievable {
    int capacity = 0;
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
        return volume;
    }

    @Override
    public void getWater(int amount){
       volume = volume + amount;
       capacity = capacity - amount;
       if(capacity < 0){
           System.out.println("Cup is full and overflowing!");
       }
    }
}
