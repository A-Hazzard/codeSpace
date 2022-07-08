/**
 * binarySearch
 */
public class binarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        int target = 7;       
        binarySearch(arr, target);

    }

    public static void binarySearch(int arr[], int target) {
        int left = 0, middleIndex = 0, right = arr.length - 1;

        while(left <= right){
            middleIndex = (left + right) / 2;

            if(target == arr[middleIndex]){
                System.out.println("Found " + target + " at index " + middleIndex);
                break;
            }
            else if(target < arr[middleIndex]) right = middleIndex--;
            else if(target > arr[middleIndex]) left = middleIndex++;
    }
    }
}