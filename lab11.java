/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DSlab1;

import java.util.Scanner;


public class lab {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size: ");
         int size = input.nextInt();
        int[] array = new int[size];
        int count = 0;
        int element;
        loop:
        for (int i = 0;; i++) {
            System.out.println("\n1.Insert the elements of the array."
                    + "\n2.Search for an element and return its index."
                    + "\n3.Delete an element from the array."
                    + "\n4.Exit.\nPlease enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {      
                case 1:
                    {
                    if (count == size) {
                        System.out.println("Array is Full.");}
                    else {
                        System.out.println("Enter the element you want to insert: ");
                        element = input.nextInt();
                        array[count] = element;
                        count=count+1;
                    }
                    System.out.print("Your array is: ");
                    for (int p = 0; p < array.length; p++) {
                        System.out.print(array[p] + " ");
                    }
                    System.out.println("");
                }
                    
                    break;
                case 2:
                    {
                    System.out.println("Enter the element you want to search: ");
                    element = input.nextInt();
                    boolean flag = false;
                    for (int s = 0; s < array.length; s++) {
                        if (element == array[s]) {
                            System.out.println("Your element is exist at index: " + s);
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("The element not found.");
                    }
                    System.out.print("Your array is: ");
                    for (int p = 0; p < array.length; p++) {
                        System.out.print(array[p] + " ");
                    }
                    System.out.println("");
                }
                    break;
                case 3:
                    {
                    if (count == 0) {
                        System.out.println("The array is empty.");
                    } else {
                        System.out.println("Enter the element you want to delete: ");
                        element = input.nextInt();
                        
                        boolean flag = false;
                        int pos=0;
                        for (int s = 0; s < array.length; s++) {
                            if (element == array[s]) {
                                flag = true;
                                pos=s;
                            }
                        }

                        if (flag == false) {
                            System.out.println("The element not found.");//
                        } else {
                            for (int d =pos; d < (array.length-1); d++) {
                                array[d] = array[d + 1];
                            }
                            array[array.length-1]=0;
                            count=count-1;
                        }
                    }
                    System.out.print("Your array is: ");
                    for (int p = 0; p < array.length; p++) {
                        System.out.print(array[p] + " ");
                    }
                  break;
                  
                    } 
                    default:{
                        System.out.println("exit");
                    }
                 break loop;
            }
        }
    }
    }
