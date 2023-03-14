//Hayat alzhrani
//2105101
package maxelement;

import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creat scan object

        System.out.println("Enter size of the array: ");//msg to tell the user when to entar the size
        int s = input.nextInt();//var to hold the size of the array

        int arr[] = new int[s];//creating array with the giving size
        System.out.println("Enter array element: ");//inform the user to enter the elments

        for (int i = 0; i < s; i++) {//for loop to store each element
            arr[i] = input.nextInt();//get elments from user
        }

        int max = largest(arr, 0, s - 1);//calling the method by passing the array and its leftmost/rightmost indexes
        System.out.println("Largest elemnt is: " + arr[max] + " with its index: " + (max + 1));//disply the result
    }

    public static int largest(int arr[], int l, int r) {//mithod to find largest element by divide-and=conquer (Binary search)
        if (l == r) { // if left pointer has reached the right ponter, we've found the largest element
            return r;//return the index
        } else {
            int mid = (l + r) / 2;//calculate the mid point
            int a1 = largest(arr, l, mid);//recursive call to search in the left part of the array
            int a2 = largest(arr, mid + 1, r);//recursive call to search in the right part of the array

            if (arr[a1] >= arr[a2]) {//check which one is larger
                return a1;//return the index of th larger
            } else {
                return a2;
            }
        }
    }

}
