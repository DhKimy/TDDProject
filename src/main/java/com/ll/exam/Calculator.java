package com.ll.exam;

public class Calculator {
    public static int run(String s) {

        // 항의 개수 세기
        String[] countTerm = s.split(" ");

        // 단항식일 경우
        if(countTerm.length == 3){

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
        // 다항식일 경우
        else{
            String p = countTerm[0]+" "+countTerm[1]+" "+countTerm[2];
            String out = "";
            for(int k = 3; k < countTerm.length; k++){
                if(k == countTerm.length - 1){
                    out += countTerm[k];
                    break;
                }
                out += countTerm[k]+" ";
            }

            String output = run(p)+" "+out;
            return run(output);
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
