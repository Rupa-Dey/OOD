package HousingStructure;

//package CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("Uttora_302");
        Housing floor  = new Housing("1st_floor");

        int firstFloor = building.addStructure(floor);

        Room washroom_m = new Room("1st Floor Men's washroom") ;
        Room washroom_w = new Room("1st Floor Women's washroom");
        Room common  = new Room("Common Washroom area");

        int men_1F = floor.addStructure(washroom_m);
        int women_1F  = floor.addStructure(washroom_w);
        int commonBath = floor.addStructure(common);

        building.enter();
        Housing currentFloor = (Housing)building.getStructure(firstFloor);
        currentFloor.enter();
        Room currentRoom = (Room)currentFloor.getStructure(men_1F);
        currentRoom.enter();
         currentRoom = (Room) currentFloor.getStructure(women_1F);
         currentRoom.enter();

         building.exit();
    }
}
