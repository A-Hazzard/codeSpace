public class sorting {
    public static void main(String[] args) {
        int arr[] = {1,6,3,2,0,3,40,46};
        int minPos;

        for (int i : arr) {
            minPos = 0;

            for (int j = i + 1; j < arr.length; j++) if(arr[j] < arr[minPos]) minPos = j;
            
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }
}
