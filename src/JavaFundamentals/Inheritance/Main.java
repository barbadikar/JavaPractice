package JavaFundamentals.Inheritance;

public class Main {
    public static void main(String [] args ){
        var TextBox = new TextBox();
        TextBox.setText("Aditya");
        var control = new UIControl(true);
        show(TextBox);
        //show(control);//downcasting issue
        //inheritanceTest();
    }
    public static void show(UIControl control){
        System.out.println("Upcaste result :"+control);
        var conText = (TextBox)control;//downcasting UI to Textbox but it can only be done in textbox is passed in method
        System.out.println("DownCast result :"+conText);
        System.out.println(control);
        System.out.println("----------------------");
    }
    public static void inheritanceTest(){
        var textBox = new TextBox();
        textBox.setText("car");
        var control = new UIControl(true);
        System.out.println("Value is :"+control);
        System.out.println("Value is :"+textBox);

    }
}
