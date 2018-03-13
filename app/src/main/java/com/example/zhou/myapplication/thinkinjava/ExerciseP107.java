package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/7.
 */

public enum ExerciseP107 {
    ONEMAO, FIVEMAO, YIKUAI, WUKUAI, SHIKUAI, ERSHIKUAI
}

class EnumTets {


    public static void main(String[] args) {
        for (ExerciseP107 exerciseP107 : ExerciseP107.values()) {
            System.out.println("面值 " + exerciseP107 + " 顺序：" + exerciseP107.ordinal());
        }
        EnumTets e1 = new EnumTets(ExerciseP107.FIVEMAO);
        EnumTets e2 = new EnumTets(ExerciseP107.ERSHIKUAI);
        e1.caseCheck();
        e2.caseCheck();
    }


    ExerciseP107 exerciseP107;

    public EnumTets(ExerciseP107 exerciseP107) {
        this.exerciseP107 = exerciseP107;
    }


    void caseCheck() {


        switch (exerciseP107) {

            case ONEMAO:
                System.out.println("这是一毛钱");
                break;
            case WUKUAI:
                System.out.println("这是五块钱");
                break;
            default:
                System.out.println("没有匹配的");
                break;
        }
    }
}