package HousingStructure;

//package CompositeDesignPattern;

import java.util.ArrayList;

public class Housing implements IStructure {
    private String address;
    private ArrayList<IStructure> structures;

    public Housing(String address){
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }
    public String getAddress(){
        return  this.address;
    }

    public int addStructure(IStructure component){
        this.structures.add(component);
        return this.structures.size()-1;

    }
    public IStructure getStructure(int componentNum){
        return this.structures.get(componentNum);
    }
    public void location(){
        System.out.println("You are currently in the " + this.getAddress() +". but it has ");
        for (IStructure iStructure: this.structures){
            System.out.println(iStructure.getAddress());
        }

    }
    public void enter(){
        System.out.println("You have entered the " +this.getAddress());
    }
    public void exit(){
        System.out.println("You have left the " + this.getAddress());
    }

}
