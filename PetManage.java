/*
Lab Assignment-02
It is a pet management system.
Pet class will tell about name,species.
another two type service will provide using this system.
FeedingService---> which food will be served and feeding time
MedicalService---> this class will test the pet disease and will provide treatment.
 */

class Pet {
    private String name;
    private String species;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String toString() {
        return "Pet{name='" + name + "', species='" + species +'}';
    }

}
//---------------------------------
class FeedingService
{
    private String foodType;
    private String feedTime;

    public FeedingService(String foodType, String feedTime) {
        this.foodType = foodType;
        this.feedTime = feedTime;
    }

    public String toString() {
        return "FeedingService{Food_Item='" + foodType + "', Feeding_time='" + feedTime + "'}";
    }

}
//.................
class MedicalService {
    private String diagnos;
    private String treatment;

    public MedicalService(String diagnos, String treatment) {
        this.diagnos = diagnos;
        this.treatment = treatment;
    }

    public String toString() {
        return "MedicalService{diagnosis='" + diagnos + "', treatment='" + treatment + "'}";
    }
}



//..................
public class PetManage {
    public static void main(String[] args) {
        Pet myPet = new Pet("Rocky", "Cat");
        System.out.println("My Pet: " + myPet);

        FeedingService feedingService = new FeedingService("Fish", "8:30 PM");


        System.out.println("Feeding service for everyday: " + feedingService);

        MedicalService medicalService = new MedicalService("Fever", "Antibiotics");
        System.out.println("Medical Record: " + medicalService);
    }
}
