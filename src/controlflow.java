import java.util.Scanner;
public class controlflow {
    public static void main(String[] args) {
        //int choice = -1;
        Scanner scn = new Scanner(System.in);
        System.out.print("insert a number b/w 1 and 10 :");
        int choice = scn.nextInt();
        if(choice <5) {
            System.out.println("this number is less than 5");
        }
        else if(choice==5) {
            System.out.println("this number is 5 ");
        }
        else{
            System.out.println("this number is greater than 5");

    }
    }
}
