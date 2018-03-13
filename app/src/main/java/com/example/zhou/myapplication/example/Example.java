package com.example.zhou.myapplication.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhou on 2017/9/8.
 */

public class Example {
    //
//    public static void main(String[] args) {
//        int x = 12;
//        {
//            int y = 13;
//
//            int z = x + y;
//
//            System.out.print(z);
//        }
//        int y=x;
//
//        System.out.print(y);
//
//    public static void main(String[] args) {
//        int i, j;
//        for (i = 1; i <= 9; i++) {
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
    public static void main(String[] args) {

        int[] nums1 = {3, 2, 4};
        int target1 = 6;
        twoSum(nums1,target1);





//    }
//
//    private static void twoSUM(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//
//                    System.out.print(Arrays.toString(new int[]{i, j}));
//
//                }
//            }
//        }
//    }

//        TStatic t = new TStatic(5);
//        TStatic tt = new TStatic();
//        System.out.println(t.i);
//        System.out.println(tt.i);
//        System.out.println(t.i);
//
//    }
//}
//
//class TStatic {
//
//    static int i;
//
//    public TStatic() {
//        i = 4;
//    }
//
//    public TStatic(int j) {
//        i = j;
//    }


}

    private static void twoSum( int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.print(Arrays.toString(new int[]{i, map.get(complement)})) ;

            }

        }

    }

}




