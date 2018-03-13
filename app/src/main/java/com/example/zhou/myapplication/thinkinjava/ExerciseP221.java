package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Zhou on 2017/12/25.
 */

public class ExerciseP221 {

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

//        won't compile
//        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());

//        Collections.addAll(snow1);

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());

//        Give a hint using an explicit type argument specification
//        显示类型参数说明，说明编译器的目标类型是什么
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());


    }
}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

