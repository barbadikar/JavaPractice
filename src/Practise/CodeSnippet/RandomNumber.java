package Practise.CodeSnippet;

public class RandomNumber {
    public static void main(String[] args) {
        double rand = Math.random();
        int max = 400;
        int min = 200;
        System.out.println("Random in double:"+rand);
        //get random in between 200 to 400
        double betRand = rand*(max-min+1)+min;//check this formula it's important
        System.out.println("Rand in double:"+betRand);
        int intRand = (int)betRand;
        System.out.println("Rand in int :"+intRand);



    }
}
