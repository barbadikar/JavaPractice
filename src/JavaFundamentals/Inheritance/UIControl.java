package JavaFundamentals.Inheritance;

public class UIControl {
    boolean isEnabled = true;

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UIControl");

    }
    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
}
