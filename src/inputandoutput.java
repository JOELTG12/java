import java.util.Scanner;
public class inputandoutput {
    public static void main(String[] args){
        int test =0;
        System.out.println("What is the value to be updated in test variable?"+test+"?");
        //reading input from user
        Scanner scn = new Scanner(System.in);
        test = scn.nextInt();

        System.out.println("updated value of test is:"+test);

    }

}
