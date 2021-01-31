/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatesumofelementsinarray;

import java.util.Scanner;

/**
 *
 * @author Sohayb
 */
public class CalculateSumOfElementsInArray {

   
    public static void main(String[] args) {
         //this program to calculate the summation of elements of array and its avarage
        
          Scanner input =new Scanner (System.in);
int size ;
   System.out.println("enter a size of one dimensional array");
   size=input.nextInt();
   
   int[] numbers= new int[size];
   
   for(int i=0 ; i< size;i++)
   {
   System.out.println("enter a number" + (i+1));
   numbers[i]=input.nextInt();
   }
   int sum=0,counter=0;
   
   for(int i=0 ; i<size ;i++)
   {
       if(numbers[i]>0)
       {
           sum += numbers[i];
           counter++;
       }
      
   }
   System.out.println("the sum is " +sum);
    System.out.println("the average is " + sum/counter);
   
   
   
    }
    
}
