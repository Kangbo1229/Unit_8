public class ThreeByFive {
    public static void main(String [] args) {
        int[][] nums = { {3,6,2,9,7}, {7,45,9,12,44}, {2,33,5,88,0}};

        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);

        nums[0][3] = -6;
        nums[1][4] = -4;
        nums[2][2] = -5;
        System.out.println(" ");

        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);

        System.out.println(nums[1][4]);
    }
}


