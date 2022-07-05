package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        boolean isMinus = s.indexOf(" - ") != -1;
        boolean isPlus = s.indexOf(" + ") != -1;
        boolean isMulti = s.indexOf(" * ") != -1;

        if (isMinus) {
            return runMinus(s);
        }else if(isPlus){
            return runPlus(s);
        }else if(isMulti){
            return runMulti(s);
        }else{
            return runDiv(s);
        }

    }

    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    private static int runMulti(String s) {
        String[] sBits = s.split(" \\* ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    private static int runDiv(String s) {
        String[] sBits = s.split(" \\/ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 / no2;
    }
}
