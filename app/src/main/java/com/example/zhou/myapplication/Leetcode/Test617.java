package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/11/11.
 */

public class Test617 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(3);

        TreeNode t3 []=new TreeNode[3];

        int a [] ={1,3,2,5};

        for (int i = 0; i <4 ; i++) {

//            t3[i] =a[i];
        }


        Solution617 solution617 = new Solution617();
        System.out.println(solution617.mergeTrees(t1, t2));
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        this.val = x;
    }
}


class Solution617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

}