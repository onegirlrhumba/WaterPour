public class Jug {
    public static void pourWaterFromJug(int amount, Recievable vessel){
        vessel.getWater(amount);
        System.out.println("Your vessel now has " + vessel.getEmptyRoom() + " oz of room left in it after pouring " + amount + " oz of water from the jug");
    }
    public static void main(String[] args) {
        TeaCup cup = new TeaCup();
        cup.setCapacity(12);
        cup.setVolume(0);
        int firstPour = 6;
        System.out.println("Cup has " + cup.getCapacity() + " capacity and is empty");
        System.out.println("Now pouring " + firstPour + " oz from jug into cup");
        pourWaterFromJug(6, cup);
        System.out.println("Cup has " + cup.getVolume() + " of water in it and " + cup.getCapacity() + " left empty");
    }
}


