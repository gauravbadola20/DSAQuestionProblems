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



}



