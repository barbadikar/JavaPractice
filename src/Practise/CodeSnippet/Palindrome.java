package Practise.CodeSnippet;

import com.sun.source.doctree.SummaryTree;

public class Palindrome {
    public static void main(String[] args) {
        int input = 454;
        int temp;
        int remainder;
        int sum = 0;
        temp = input;
        while (input > 0) {
            remainder = input % 10;
            System.out.println("reminder is :"+remainder);
            sum = (sum * 10) + remainder;
            System.out.println("Sum is :"+ sum);
            input = input / 10;
        }
        if (temp == sum) {
            System.out.println("The given nuber is palidrome:" + input);
        }
        else {
            System.out.println("Number is not palidrome");
        }
    }
}
