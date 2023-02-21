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
    
    public String equal(int num1, int num2){
        String result = "";
        int count1 = 0, count2 = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] == num1){
                count1++;
            }
            if(numlist[i] == num2){
                count2++;
            }
        }
        if(count1 == 0 && count2 == 0){
            result = "No matches found.";
        }
        
        if(count1 > 0){
            result += "The first number is a match. It exists " + count1 + " times\n";
        }
        
        if(count2 > 0){
            result += "The second number is a match. It exists " + count2 + " times\n";
        }
 
        return result;
    }
    
    public int gcd(int a, int b){
        do{
            if(a < b){
                b = b - a;
            }
            else{
                a = a - b;
            }    
        }while(a != b);
        return a;
    }
    
    public int count(){
        return numlist.length;
    }
    
    public int sum(){
        int sum = 0;
        for(int i=0; i < numlist.length; i++){
            sum = sum + numlist[i];
        }
        return sum;
    }
    
    public int avg(){
        int avg = 0;
        for(int i=0; i < numlist.length; i++){
            avg = avg + numlist[i];
        }
        return avg/numlist.length;
    }
    
    public void scalarMultiply(int x){
        for(int i=0; i < numlist.length; i++){
            numlist[i] = numlist[i] * x;
        }
    }
    
    public void addConstant(int x){
        for(int i=0; i < numlist.length; i++){
            numlist[i] = numlist[i] + x;
        }
    }
}
