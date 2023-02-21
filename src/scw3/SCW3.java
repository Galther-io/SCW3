/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scw3;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class SCW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = {3,2,5,4};
        int op = 0, num1, num2;
        Scanner in = new Scanner(System.in);
        ArrayOfNumbers data = new ArrayOfNumbers(list);
        do{
            System.out.println("Please select an option:");
            System.out.println("1 - Return a value \n"
                             + "2 - Set a value \n" 
                             + "3 - Return max value of the array\n"
                             + "4 - Two number search on array\n"
                             + "5 - GCD between two numbers\n"
                             + "6 - Count the existing numbers in the list\n"
                             + "7 - Sum all values in array\n"
                             + "8 - Average of all values in array\n"
                             + "9 - Multiply each array element with a given number\n"
                             + "10 - Add each array element with a given number\n"
                             + "0 - Exit");
            op = in.nextInt();
            switch(op){
                
                case 1:
                    System.out.println("Please insert a value:");
                    num1 = in.nextInt();
                    System.out.println(data.item(num1));
                    break;
                
                case 2:
                    System.out.println("Please insert the array reference:");
                    num1 = in.nextInt();
                    System.out.println("Please insert a value:");
                    num2 = in.nextInt();
                    if (data.setitem(num1, num2)){
                        System.out.println("Number changed!");
                    }
                    break;
                
                case 3:
                    System.out.println("Max number is "+data.max());
                    break;
                
                case 4:
                    System.out.println("Please insert a number to compare:");
                    num1 = in.nextInt();
                    System.out.println("Please insert another number to compare:");
                    num2 = in.nextInt();
                    System.out.println(data.equal(num1, num2));
                    break;
                
                case 5:
                    System.out.println("Please insert a number to compare:");
                    num1 = in.nextInt();
                    System.out.println("Please insert another number to compare:");
                    num2 = in.nextInt();
                    System.out.println("The GDC between " + num1 + " and " + num2 + " is " + data.gcd(num1, num2));
                    break;
                
                case 6:
                    System.out.println("The array size is: " + data.count());
                    break;
                
                case 7:
                    System.out.println("The array total value is: " + data.sum());
                    break;
                    
                case 8:
                    System.out.println("The array average value is: " + data.avg());
                    break;
                    
                case 9:
                    System.out.println("Please insert a number to multiply with each element in array:");
                    num1 = in.nextInt();
                    data.scalarMultiply(num1);
                    break;
                    
                case 10:
                    System.out.println("Please insert a number to add to each element in array:");
                    num1 = in.nextInt();
                    data.addConstant(num1);
                    break;
            }
        }while(op!=0);
    }
}