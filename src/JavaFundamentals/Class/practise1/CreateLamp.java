package JavaFundamentals.Class.practise1;

public class CreateLamp {
    public boolean isOn = true;

    public void turnOnLamp(){
        System.out.println("Lamp is already on");
    }
    public void turnOffLamp(){
        isOn = false;
        System.out.println("Lamp is switched off");
    }
}
