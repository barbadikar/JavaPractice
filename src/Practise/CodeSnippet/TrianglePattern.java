package Practise.CodeSnippet;

public class TrianglePattern {
    public static void main(String[] args) {
        rightTriangle();
        leftTriangle();
        centreTriangle();
    }
    public static void rightTriangle(){
        int i;
        int j;
        int row =6;

        for(i=0;i<=row;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftTriangle() {
        int i, j, row = 6;
//Outer loop work for rows
        for (i = 0; i < row; i++) {
//inner loop work for space
            for (j = 2 * (row - i); j >= 0; j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j = 0; j <= i; j++) {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }

    public static void centreTriangle(){
        int i, j, k, rows=9;
        for (i=1; i<= rows ; i++)
        {
            for (j = i; j < rows ; j++)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2*i -1) ;k++)
            {
                if(k==1 || i == rows || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}


