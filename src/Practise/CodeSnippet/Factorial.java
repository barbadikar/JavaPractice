package Practise.CodeSnippet;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;//1*2*3*4*5
        int fac = 1;
        for(int i =1;i<=input;i++){
            fac = fac*i;
        }
        System.out.println("Factorial value is :"+fac);
    }

}
