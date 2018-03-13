package com.example.zhou.myapplication.thinkinjava;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP237 {

    public static void commandEater(Queue<Command> qc) {

        while (qc.peek() != null) {
            qc.poll().operation();
        }

    }

    public static void main(String[] args) {
        Command2 c2 = new Command2();
        commandEater(c2.fill());
    }


}

class Command {

    public String s;

    public Command(String s) {
        this.s = s;
    }

    public void operation() {

        System.out.println(s);
    }
}

class Command2 {


    Queue<Command> fill() {

        Queue<Command> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.offer(new Command(i + " "));
        }
        return queue;
    }
}
