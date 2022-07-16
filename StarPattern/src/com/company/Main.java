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
//        }
//        int i,j;
//        int n=5;
//        for(i=1;i<=n;i++)
//        {
//            for(j=i;j<=n;j++)
//            {
//                System.out.print((char)(i+64));
//            }
//            System.out.println("");
//        }


        // print triangle stars
        //method 1

//        for (int row =0; row<size; row++){
//
//            for (int col =0; col<size-row; col++)
//                System.out.print("_ ");
//
//            for (int col = 0; col<=row; col++)
//            System.out.print("* ");
//
//            for (int col =1; col<=row; col++)
//            System.out.print("* ");
//
//            System.out.println();

//        }

        // method 2 print triangle

//            for(int row =0; row<size; row++){
//                for (int col=0; col<size-row-1; col++)
//                    System.out.print("_ ");
//                for (int col=0; col<=2*row; col++)
//                System.out.print("* ");
//                System.out.println();
//            }

        //mehtod 3 print triangle
//        for (int row=0; row<size; row++){
//            for (int col=0; col<size; col++)
//                if (col<size-row-1)
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");
//
//                for (int col = 0; col<row; col++)
//            System.out.print("* ");
//            System.out.println();
//        }

        // finbonnaci series (0 and 1 by default: 0+1= 1, 1+2= 3, 2+3= 5, 3+5= 8, 5+8= 13...)
//        int n1=0,n2=1,n3,i,
//                count=sc.nextInt();
//        System.out.println("Enter counter: "+count);
//        System.out.print(n1+" "+n2); //printing 0 and 1
//
//        for(i=0;i<count;++i) //loop starts from 2 because 0 and 1 are already printed
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }

        // left angle triangle reverse

//        for (int row = 0; row<size; row++){
//            for (int col = 0; col<size; col++)
//                if (col<row)
//                System.out.print("   ");
//                else
//                    System.out.print(" * ");
//            System.out.println();
//        }

        // downward triangle

//        for (int row = 0; row<size; row++){
//            for (int col = 0; col<=row; col++)
//            System.out.print(" ");
//
//            for (int st = 0; st<size-row; st++)
//            System.out.print("*");
//
//            for (int st = 1; st<size-row; st++)
//            System.out.print("*");
//
//            System.out.println();

        //method 2
//        for (int row = 0; row<size; row++){
//            for (int col = 0; col<=row; col++)
//                System.out.print(" ");
//
//            for (int st = 1; st<2*(size-row); st++)
//                System.out.print("*");
//
//            System.out.println();
//
        /*output:  *********
         *******
         *****
         ***
         *     */
//        }

        // parallel gram
//        for (int row = 0; row<size; row++){
//            for (int col = 0; col<row; col++)
//                System.out.print("_ ");
//
//            for (int st = 0; st<(size-row)-1; st++)
//                System.out.print("* ");
//
//            for (int st = 0; st<=row; st++)
//                System.out.print("* ");
//
//            System.out.println();

            /*
 * * * *
 _ * * *
 _ _ * *
 _ _ _ *
 _ _ _ _   */

    /*    *
          _ * *
          _ _ * * *
          _ _ _ * * * *
          _ _ _ _ * * * * *     */

    /*
    * * * * *
    _ * * * * *
    _ _ * * * * *
    _ _ _ * * * * *
    _ _ _ _ * * * * *
     */


//        for (int row = 0; row<size; row++){
        //method 1
//                for (int col = 0; col<=row; col++)
//                    if (col<row)
//                        System.out.print("  ");
//                    else
//                        System.out.print("* ");
        /*

         *
         *
         *
         *

         */
        //method 2
//            for (int col = 0; col<=size; col++)
//                if (col==row)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");


        //method 1
//        for (int row = 0; row<size; row++) {
//            //method 1
//            for (int col = 1; col < size - row; col++) {
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//
//            System.out.println();
//
//        }
        /*

        Enter the size: 4
      *
    *
  *
*
         */
        // method 2
//        for (int row =0; row<size; row++){
//            for (int col =0; col<size; col++)
//                if (col== size-row-1)
//                System.out.print("* ");
//                else
//                    System.out.print("  ");
//            System.out.println();
//        }

        //method 3
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size - row; col++)
//                System.out.print(" ");
//            System.out.println("*");
//        }




        // Pattern partial A

        for (int row =1; row<size; row++){
            for (int sp =1; sp<size-row; sp++)
                System.out.print(" ");
            for (int st =1; st<2*row; st++)
                if (st==1 || st==2*row-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
    }

    }
}



