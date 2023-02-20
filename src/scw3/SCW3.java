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
                             + "0 - Exit\n");
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.println("Please insert a value:\n");
                    num1 = in.nextInt();
                    System.out.println(data.item(num1));
                break;
                case 2:
                    System.out.println("Please insert the array reference:\n");
                    num1 = in.nextInt();
                    System.out.println("Please insert a value:\n");
                    num2 = in.nextInt();
                    if (data.setitem(num1, num2)){
                        System.out.println("Number changed!\n");
                    }
                break;
                case 3:
                    System.out.println(data.max());
                break;
            }
        }while(op!=0);
    }
}