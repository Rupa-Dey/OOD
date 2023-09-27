//BMW Car Design--->
// It has some common attributes like others Car such as wheels,engine,doors etc.
// But it has some special feature which will distingush from others car.
//......................................................

import java.io.*;
class BMW_Car{
      String color = "Black";
      String trans;
        void getTansmission(){
            trans = "not automated";
            System.out.println("BMW Car is "+trans);
        }
//        void showTransmission(){
//
//        }
}
interface specialFeature{
    String specialFeature = "multizone climate control and premium audio setup";
    public void showSpecialFeature();
}

class car extends BMW_Car implements specialFeature{
    private int wheel , doors,engine;
    void getComponent(){
        wheel = 4;
        doors = 4;
        engine = 1;

    }
    void showCarComponent(){
        System.out.println("--BMW Car has--");
        System.out.println("Doors : "+doors);
        System.out.println("Wheels : "+wheel);
        System.out.println("Engine : "+engine);
    }
    public void showSpecialFeature(){
        getTansmission();
        System.out.println("Special Feature of BMW: "+specialFeature);
    }

}


public class Test{
    public static void main(String[] args) {
        car cc = new car();
        cc.getComponent();
        cc.showCarComponent();
        cc.showSpecialFeature();
    }
        }