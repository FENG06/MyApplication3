package com.example.zhou.myapplication.Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou on 2017/12/28.
 */

public class Test728 {

    public static void main(String[] args) {
        int left = 147;
        int right = 147;
        Solution728 s = new Solution728();
        System.out.println(s.selfDividingNumbers(left, right));
    }


}

class Solution728 {

    public List<Integer> selfDividingNumbers(int left, int right) {


        List<Integer> list = new ArrayList<>();


        for (int i = left; i <= right; i++) {


            if (1 <= i && i < 10) {


                list.add(i);
            }


//             第一种情况
            if (10 < i && i < 100) {

                int bit1 = i % 10;
                int bit2 = i / 10;

                if (bit1 != 0) {


                    if (i % bit1 == 0 && i % bit2 == 0) {

                        list.add(i);

                    }

                }

            }

            //             第二种情况
            if (100 < i && i < 1000) {

                int bit1 = i % 10;
                int bit2 = (i / 10) % 10;
                int bit3 = i / 100;

                if (bit1 != 0 && bit2 != 0) {

                    if (i % bit1 == 0 && i % bit2 == 0 && i % bit3 == 0) {

                        list.add(i);

                    }

                }

            }
            //             第三种情况
            if (1000 < i && i < 10000) {

                int bit1 = i % 10;
                int bit2 = (i / 10) % 10;
                int bit3 = (i / 100) % 10;
                int bit4 = i / 1000;

                if (bit1 != 0 && bit2 != 0 && bit3 != 0) {

                    if (i % bit1 == 0 && i % bit2 == 0 && i % bit3 == 0 && i % bit4 == 0) {

                        list.add(i);

                    }
                }
            }
        }

        return list;


    }
}