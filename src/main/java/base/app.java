package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){



        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount?");
        String input0 = in.nextLine();
        int i0 = Integer.parseInt(input0);

        System.out.print("What is the state?");
        String input1 = in.nextLine();

        if (input1.equals("WI")) {
            double tax = 0.055;
            double taxamount = (i0*tax);
            double total = (i0*tax) + i0;
            System.out.print("The subtotal is $" + i0 + "\n");
            System.out.print("The tax is $" + taxamount+ "\n");



            System.out.print("The total is $" + total + "\n");

        }

        if (!input1.equals("WI"))
        {

            double total = i0;
            System.out.print("The total is $" + total+ "\n");

        }

















    }
}
