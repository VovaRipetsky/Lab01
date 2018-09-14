package com.company;


import java.util.Scanner;

/**
 * Created by Vova on 12.09.2018.
 */
public class Operations {

    private int intervalA;
    private int intervalB;
    private int size;
    private int[] myArray;
    private int[] fibArray;
    private int n;

    public int getInterval() {

        Scanner scanInt = new Scanner(System.in);
        System.out.println("Defining the interval");

        System.out.println("Enter the first number");
        intervalA = scanInt.nextInt();
        System.out.println("Enter the last number");
        intervalB = scanInt.nextInt();

        return size = (intervalB - intervalA) + 1;

    }

    public int[] printNumbers() {
        myArray = new int[size];
        for (int i = 0; i < size; i++) {

            myArray[i] = intervalA;
            intervalA++;
            System.out.println(myArray[i]);
        }


        System.out.println("Printing ods numbers:");
        for (int i = 0; i < size; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println(myArray[i]);
            }
        }

        System.out.println("Printing even numbers:");
        for (int i = size - 1; i >= 0; i--) {
            if (myArray[i] % 2 != 0) {
                System.out.println(myArray[i]);
            }
        }
        return myArray;
    }

    public void printSum() {
        int odsSum = 0;
        int evenSum = 0;

        for (int i = 0; i < size; i++) {
            if (myArray[i] % 2 == 0) {
                odsSum = odsSum + myArray[i];
            }
        }
        System.out.println("Ods sum: " + odsSum);

        for (int i = 0; i < size; i++) {
            if (myArray[i] % 2 != 0) {
                evenSum = evenSum + myArray[i];
            }
        }
        System.out.println("Even sum: " + evenSum);

    }

    public int[] Fibonacci() {

        int F1;
        int F2;

        System.out.println("Enter size of set (N)");
        Scanner scanInt = new Scanner(System.in);
         n = scanInt.nextInt();
        fibArray = new int[n];

        if (myArray[size - 1] % 2 == 0) {
            F1 = myArray[size - 1];
            F2 = myArray[size - 2];
        } else {
            F1 = myArray[size - 2];
            F2 = myArray[size - 1];
        }

        fibArray[0] = F1;
        fibArray[1] = F2;

        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        System.out.println("Printing Fibonacci numbers");
        for (int i = 0; i < n; i++) {

            System.out.println(fibArray[i]);
        }

        return fibArray;

    }

    public void persFib(){

        double k = 0.0;
        double persOdd;
        for(int i=0; i<n; i++){
            if(fibArray[i]%2 == 0){
                k=k+1;
            }
        }

        persOdd = (k/n)*100;
        System.out.println("Percentage of odd Fibonacci is " + persOdd + "%");
        System.out.println("Percentage of even Fibonacci is " + (100 - persOdd) + "%");

    }

}
