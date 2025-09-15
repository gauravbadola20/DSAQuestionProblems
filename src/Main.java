public class Main {





    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8,9,9,4,4};
        int n = arr.length-1;


       System.out.println(ArraysQuestions.findLargestElement(arr,n));


       System.out.println();
        System.out.println("This is the second largest element:"+ArraysQuestions.secondLargestElement(arr,n));


        System.out.println();
       System.out.println(ArraysQuestions.isSortedBruteForce(arr,n));

        System.out.println();

      int k =  ArraysQuestions.removeDuplicates(arr,n);

        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }





    }
}