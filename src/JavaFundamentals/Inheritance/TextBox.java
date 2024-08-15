package JavaFundamentals.Inheritance;

public class TextBox extends UIControl{
    private String text = "";
    public TextBox(){
        super(true);//as base class has a constructor which needs para
        System.out.println("TextBox");
    }
    @Override
    public String toString(){//as you are trying to override the default toString function
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}
