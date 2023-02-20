/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scw3;

/**
 *
 * @author tiago
 */
public class ArrayOfNumbers {
    private int[] numlist; 
    
    public ArrayOfNumbers(int size){
        for(int i=0;i<size;i++){
        numlist[i] = 0;
        }        
    }
    
    public ArrayOfNumbers(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numlist[i] = numbers[i];
        }
    }
    
    /*public int item(int pos){
        return numlist[pos-1];
    }
    
    public int setitem(int pos, int value){
        numlist[pos - 1] = value;
        return 1;
    }*/
}
