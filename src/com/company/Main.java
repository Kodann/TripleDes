package com.company;

public class Main {

    public static void main(String[] args) {

        byte [] startKey = new byte[]{1, 2, 3, 7, 10, 6, 7, 8, 4, 10, 11, 12, 13, 17, 1, 16, 17, 18, 20, 26, 21};
        GrandKey grandKey = new GrandKey(startKey);
        TripleDES des = new TripleDES(grandKey);

        try {
            des.encrypt("airplane.bmp", "code.bmp");
            des.decrypt("code.bmp", "decode.bmp");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
