import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
            System.out.println("This is the first java program in Learning Java.");
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter a value greater than 10.");
            int value = scn.nextInt();
            while(value>-1){
                System.out.println("value is: "+ value);
                value-=1;
            }
        }
    }

