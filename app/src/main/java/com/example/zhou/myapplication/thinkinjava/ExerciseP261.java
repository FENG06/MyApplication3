package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/9.
 */

public class ExerciseP261 {

    private Object[][] fields;

    public ExerciseP261(int initialize) {

        fields = new Object[initialize][2];
        for (int i = 0; i < initialize; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(":");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString() + result;
    }


    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }


    private int getFieldNumber(String id) throws NoSuchFieldError {
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldError();
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }

//        No empty fields,Add one
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        for (int i = fields.length; i < tmp.length; i++) {
            tmp[i] = new Object[]{null, null};
        }
        fields = tmp;
        return makeField(id);

    }


    public Object getField(String id) throws NoSuchFieldError {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFiledsException {
        if (value == null) {
            DynamicFiledsException dfe = new DynamicFiledsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }

        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldError e) {
//            Use constructor that makes "cause"
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }


    public static void main(String[] args) {
        ExerciseP261 df = new ExerciseP261(3);
        System.out.println(df);
        try {
            df.setField("d", "A value of d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("d", "A new value of d");
            df.setField("number3", 11);
            System.out.println("df:" + df);
            System.out.println("df.getField(\"d\")：" + df.getField("d"));
            Object field = df.setField("d", null);
        } catch (DynamicFiledsException e) {
            e.printStackTrace();
        }
    }


}

class DynamicFiledsException extends Exception {
}

