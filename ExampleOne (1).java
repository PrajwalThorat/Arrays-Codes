public class ExampleOne{


    public static void print(int[] arr){


        // for(int index =0; index< arr.length; index++){
        //     System.out.print(arr[index]+" ");
        // }

        // enchanced-for loop/for-each loop
           /*
           
                for(datatype var: arr-var){
                    
                }
           
           
           */
        // for each is an internal iterator like while loop, for every iteration it retreives an
        // element from the array and assign to variable
        // Ex: for first iteration, zeroth index eleemnt will be assigned to num
        // for second itereation, first index element will be assigned to num
        // for third iteration, second index element will be assigned to num
        // for-each loop is going to iterator for no of elements times
       
        // 5,6,6,2,8,9
        for(int num :arr){
             System.out.println(num);
        }
    }




    public static void main(String[] args){
        int[] nums = {4,5,6,9,1,8,2};
        // System.out.println(nums[2]);
        // System.out.println(nums[4]);
        // System.out.println(nums[0]);

        // for(int index = 0; index < 7; index++){
        //     System.out.print(nums[index]+" ");
        // }

        print(nums);

    }
}