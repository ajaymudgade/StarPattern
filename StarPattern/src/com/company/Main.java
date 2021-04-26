package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        //nested for loop, print star in 5*5 Matrix
//        for (int row = 0; row<size; row++){
//            for (int col=0;col<size;col++)
//                System.out.print("* ");
//            System.out.println();
//        }
        // print all alphabets A to z
//        for (c = 'a'; c <= 'z'; c++) {
//            System.out.println(c + " ");
//        }

        // printing star pattern in square

//        for (int row = 1; row<size; row++){
//            for (int col = 1; col<size; col++){
//                if (row == 1 || row ==size-1 || col == 1 || col ==size-1)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();

        // print diagonal star pattern

//        for (int row =1; row<=size; row++){
//            for (int col=1; col<=size; col++){
//                if (row==col || col+row==size+1) // or  if (row==col || col==size-row)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        //print right angle triangle
//
//        for (int row = 1; row<size; row++){
//            for (int col = 1; col<=row; col++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


        //opposite of reverse right angle triangle
//        for (int row = 1; row<size; row++){
//            for (int col = 1; col<=size-row; col++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //combination of right + reverse angle triangle

//        for (int row=0; row<=size; row++){
//            for (int col=0; col<=row; col++){
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }
//
//        for (int row=0; row<=size; row++){
//            for (int col=0; col<size-row; col++){
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }

        // left angle triangle   sp = space, st = star

        //Method 1
//         for (int row=0; row<size; row++){
//
//             //loop for space
//             for (int sp = 0; sp<size-row; sp++)
//                 System.out.print(" ");
//
//             // loop for star
//             for (int st = 0; st<row; st++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }

        //Method 2
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                if (col < size - row - 1)
//                    System.out.print("   ");
//                else
//                    System.out.print(" * ");
//            }
//            System.out.println();
//
//        }

//        int i,j;
//        int n=5;
//
//
//        for(i=1;i<=n;i++)
//        {
//            for(j=i;j<=n;j++)
//            {
//                System.out.print((char)(i+64));
//            }
//            System.out.println("");
//        }


    }


}




