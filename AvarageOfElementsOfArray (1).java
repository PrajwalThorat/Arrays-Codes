import java.util.Scanner;

public class AvarageOfElementsOfArray {


    public static int sumOfElements(int[] arr){
        int sum=0;
        // 5,7,8,9   -> 0+5+7+8+9

        /*
        index   arr[index]    sum
        ===========================
           0        5          0
            1       7            5
            2       8            12
           3        9            20
            4                    29
                            
        */
        // for(int index = 0; index < arr.length; index++){
        //     sum = sum + arr[index];
        // }


        for(int num:arr){
            sum = sum + num;
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int noOfElements = scanner.nextInt();

        int[] arr = new int[noOfElements];
        
        for(int index=0; index< arr.length; index++){
           System.out.print("Enter "+ index + " element: ");
           arr[index] = scanner.nextInt(); 
        }

       float sum = sumOfElements(arr);
       
       float avg = sum/arr.length;



    }
    
}
