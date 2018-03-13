package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/2.
 */



public class Exercise6 {

    /** Think in Java 第三章练习10算法思路：
     * @param args* 根据题目的要求，用按位和移位运算符显示二进制。思路为：
    1，输入一个二进制为1000 0000 0000 0000的数d
    2，d与c进行或运算，因为1|1=1，1|0=1，0|0=0；所以如果c的二进制从左往右数第一个，（也就是d的二进制数值为1的相对应位置），为0，则c|d不等于c，
    （因为d其它位置二进制值为0，所以对计算结果没有影响），如果结果为1，则说明c|d==c。根据此，得出c的二进制值第一个位置是0还是1。用三元运算符复制给out，再在控制台输出。
    3，对d进行无符号移位操做，d的二进制值为1的位置右移一位，然后再与c进行或运算，根据运算结果得出c二进制表示时从左往右第二个值为1还是0，再输出。
    4，接下来不断重复移位和计算，直到得到所有结果位置。
    将以上步骤封装成一个方法，分别输出与，或，非，异或四种位操作的结果，与第三章练习10运算结果对比后发现结果完全正确。
     *
     */
    public static void main(String[] args) {
        int a = 0xAAAAAAAA;
        int b = 0x5555;
        int c;

        c = a & b;
        outCBit(c);
        c = a | b;
        outCBit(c);
        c = ~a;
        outCBit(c);
        c = a ^ b;
        outCBit(c);
    }

    private static void outCBit(int c) {
        int d = 0x8000;
        int bits = 16;
        for (int i = 0; i < bits; i++) {
            int out = ((c | d) == c) ? 1 : 0;
            System.out.print(out);
            d >>>=1;
        }
        System.out.println();
    }


}
