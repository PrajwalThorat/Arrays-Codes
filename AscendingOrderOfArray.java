import java.util.Scanner;

public class AscendingOrderOfArray {

    static int[] nums;

    public static void acceptValue(){
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        nums = new int[noOfElements];
        for(int index =0; index< noOfElements;index++){
            System.out.print("Enter "+index+" element: ");
            nums[index] = scanner.nextInt();
        }
    }

    public static void sort(){
        for(int i =0; i< nums.length; i++){
            for(int j=i+1; j <nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

   public static void displaySortedArray(){
        for(int num: nums){
            System.out.print(num+" ");
        }
    }


    public static void main(String[] args){
        acceptValue();
        sort();
        displaySortedArray();
    }
    
}
