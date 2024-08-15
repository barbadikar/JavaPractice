package Practise.CodeSnippet;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = input.nextInt();
        int flag = 0;
        if(n==0 || n==1){
            System.out.println("It's not a prime number");
        }else{
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    System.out.println("Not a prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Is a prime number"+n);
        }
//2,3,5,7,11,13,17,19

    }
}
