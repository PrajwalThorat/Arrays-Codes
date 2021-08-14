import java.util.Scanner;

/*
    Read two arrays elements from user
    and preform addition b/w two arrays of elements.
    Perform with two methods
        1. accepting values from user
        2. adding two array elements
        3. display resulted array.

    
    Note: both arrays should be of same size.
*/

public class AdditionOfTwoArrays {

    static int noOfElements;
    static int[] firstArray;
    static int[] secondArray;
    static int[] sumArray;


    public static void acceptValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of elements:");
        noOfElements = scanner.nextInt();
        firstArray  = new int[noOfElements];
        secondArray = new int[noOfElements];

        for(int index =0; index < firstArray.length; index++){
            System.out.print("Etner first array "+ index+" value: ");
            firstArray[index] = scanner.nextInt();
        }

        for(int index =0; index < secondArray.length; index++){
            System.out.print("Etner second array "+ index+" value: ");
            secondArray[index] = scanner.nextInt();
        }

    }

    public static void addArrayElements(){
        sumArray = new int[noOfElements];
        for(int index =0; index < noOfElements; index++){
            sumArray[index] = firstArray[index] + secondArray[index];
        }
    }

    public static void displaySumArray(){
        for(int num: sumArray){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args){
        acceptValues();
        addArrayElements();
        displaySumArray();
    }
    
}
