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
    
    public ArrayOfNumbers(int[] numbers){
        numlist = new int [numbers.length];
        for(int i = 0; i < numbers.length; i++){
            numlist[i] = numbers[i];
        }
    }
    
    public int item(int pos){
        return numlist[pos-1];
    }
    
    public boolean setitem(int pos, int value){
        numlist[pos - 1] = value;
        return true;
    }
    
    public int max(){
        int max = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] > max){
                max = numlist[i];
            }
        }
        return max;
    }
}
