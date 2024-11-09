import java.util.Scanner;

public class math4 {

    public static void main(String[] args) {
        System.out.println(" enter a number: ");
        Scanner input =new Scanner(System.in);
        double  x = input.nextDouble();
        if (( x/4==0 && x/100!=0)||(x/400==0))
        {
            System.out.println("kabise");
        }
else { 
    System.out.println("kabise nist");
    
}
    }
    
}
