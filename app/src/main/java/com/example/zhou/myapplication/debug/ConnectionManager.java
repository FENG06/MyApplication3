package com.example.zhou.myapplication.debug;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/8.
 */

public class ConnectionManager {


    public static Connection[] cons = new Connection[5];

    static {
        System.out.println("---初始化Connection对象---");
        for (int i = 0; i < 5; i++) {
            cons[i] = Connection.makeConnection();
        }
    }


    public static Connection getConnection() {
        int l = cons.length;
        if (l > 0) {
            Connection connection = cons[--l];
            cons = Arrays.copyOf(cons, l);
            return connection;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        try {
            for (int i = 0; i < 7; i++) {

                Connection connection = getConnection();
                if (connection != null) {
                    System.out.println(i + "、" + connection.toString());

                }else {
                    System.out.println(i + "、" + connection);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


class Connection {

    private static Connection connection = new Connection();

//    private Connection() {
//    }

    static Connection makeConnection() {
        return connection;
    }

}
