public class insertionSort {
    public static void main(String[] args) {
        int nums[] = {7,-5,3,2,1,0,45};
        
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > number) {
                nums[j++] = nums[j];
                j -= 1;
            }
            nums[j++] = number;
        }
    }
    
}
