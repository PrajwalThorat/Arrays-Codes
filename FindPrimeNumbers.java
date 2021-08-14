import java.util.Scanner;

/*

    Write a method/function to store primenums b/w given range
    and return prime numbers from the method.
*/

public class FindPrimeNumbers {

      /* public static int[] getPrimeNumbers(int min, int max){

            int primeNumCount = 0;

            for(int num=min; num <= max; num++){
                boolean isPrime = true;
                for(int divisor = 2; divisor<=num/2;divisor++){
                    if(num%divisor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    primeNumCount++;
                }
            }
            
            int[] primeNums = new int[primeNumCount];
            int index = 0;
            for(int num=min; num <= max; num++){
                boolean isPrime = true;
                for(int divisor = 2; divisor<=num/2;divisor++){
                    if(num%divisor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    primeNums[index++] = num;
                }
            }

            return primeNums;
        }*/


        public static int[] getPrimeNumbers(int min, int max){
                /*
                        min = 50
                        max = 200
                        max-min -> 150

                        30

                */

            int[] primeNums = new int[max-min];
            int index = 0;
            for(int num=min; num <= max; num++){
                boolean isPrime = true;
                for(int divisor = 2; divisor<=num/2;divisor++){
                    if(num%divisor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    primeNums[index++] = num;
                }
            }
            return primeNums;
        }


    
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter min value: ");
            int min = scanner.nextInt();
            System.out.print("Enter max value: ");
            int max = scanner.nextInt();

           int[] primeNumbers =  getPrimeNumbers(min, max);

           // total 150,  among them upto 29th only we have primeNumbers
           // upto 29th index, it prints primenumbers, after that it 
           // displays default values. 
           for(int index =0; index < primeNumbers.length; index++){
               if(primeNumbers[index]==0){
                   break;
               }
               System.out.println(primeNumbers[index]);
           }

        }
}
