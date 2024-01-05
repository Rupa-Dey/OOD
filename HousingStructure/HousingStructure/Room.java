package HousingStructure;

//package CompositeDesignPattern;

public class Room implements IStructure {
    public String name;

    Room(String name){
        this.name = name;
    }

    public String getAddress() {
        return this.name;
    }

    public void enter(){
        System.out.println("You have entered in the "+ this.getAddress());
    }
    public void exit(){
        System.out.println("you have left the "+this.getAddress());
    }
    public void location(){
        System.out.println("you are currently in the" + this.getAddress());
    }

}
