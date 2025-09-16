public class ArraysQuestions {




    // find the largest element
    public static int findLargestElement(int arr[], int n){

        int largest =arr[0];
        for (int i = 1; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }


    // find the second largest element

    public static int secondLargestElement(int arr[], int n){


        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < n; i++){

            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (secondLargest < arr[i] && largest > arr[i]){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    // check if an  array is sorted

    public static boolean isSoretd(int arr[], int n){

        for (int i = 0; i  < n; i++){

            if (arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }


    // check if an array is sorted by brute force method

    public static boolean isSortedBruteForce(int arr[], int n){

        for (int i = 0; i < n; i++){


            for (int j = i+1; j < n; j++){

                if (arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return  true;
    }


    // remove duplicates from an array

    public static int removeDuplicates(int arr[], int n){


        int j = 0;

        for (int i = 1; i < n; i++){

            if (arr[i] != arr[j]){

                j++;
                arr[j] = arr[i];
            }
        }

        return j+1;
    }


    // left rotate array by one --> Brute force approach

    public static void  leftRotateByOne(int arr[], int n){

        int temp[] = new int[n];

        for (int i = 1; i < n; i++ ){

            temp[i-1]  =arr[i];
        }

        temp[n-1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }


    // left rotate by one using optimal approach
    public static void leftRotateOne(int arr[], int n){

        int temp = arr[0];

        for (int i = 0; i < n; i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;


         for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }



    // right rotatate elements

    public static void rotateRight(int arr[], int n, int k){

        if (n==0) return;

        k = k%n;

        if (k > n) return;



        // declare the temp array of k size
        int temp[] = new int[k];

        // copy the k lements in temp array

        for (int i = n - k; i < n; i++){
            temp[i-n+k] = arr[i];
        }

        //shift the remining elemets

        for (int i = n-k-1; i >=0; i--){
            arr[i+k] = arr[i];
        }

        // copy back into original array
        for (int i = 0; i < k; i++){
            arr[i] = temp[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    // leftRotate

    public static void leftRotate(int arr[], int n, int k){


        int temp[] = new int[k];

        // copy element into temp array

        for (int i = 0; i < k; i++){
            temp[i]   = arr[i];
        }


        // shift the remaining elements
        for (int i  = 0; i < n-k; i++){
            arr[i] = arr[i+k];
        }


        // copy the elements into temp
     for (int i = n-k; i < n; i++){
         arr[i] = temp[i-n+k];
     }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }




}



