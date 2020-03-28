import java.util.Arrays;

public class ArrayStats {
    public static int range(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

public static int mode(int[] nums) {
        int mode = 0;
        int modeCount = 0;
        for (int num: nums) {
            int counter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    counter ++;
                }
            }
            if (counter > modeCount) {
                modeCount = counter;
                mode = num;
            }
        }
        return mode;
    }

public static double mean(int[] nums) {
    double sum = 0.0;
    for (int num : nums) {
      sum += num;
    }
    return sum / nums.length;
}

public static int median(int[] nums) {
    int median = 0;
    if (nums.length % 2 == 0) {
        return nums[(nums.length -1)/2];
        }
        return 0;
    }
public static void main(String[] args) {
    int [] even = {1,3,5,7,};
    int [] odd = {2,4,6,8,9};
    System.out.println(median(even));
    System.out.println(median(odd));
}
}
