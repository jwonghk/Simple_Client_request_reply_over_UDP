package main;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        Client_UDP clientUdp;
        byte[] bytes = {};
        int studID;
        studID = parseInt(args[0]);

        bytes[0] = (byte) (studID & 0xFF);
        bytes[1] = (byte) ((byte) (studID >> 8) & 0XFF);
        bytes[2] = (byte) ((byte) (studID >> 16) & 0XFF);
        bytes[3] = (byte) ((byte) (studID >> 24) & 0XFF);


        //byte[0] = args[0];

        /*for (String str : args) {
            System.out.println("The value of first argument is: " + str);
        }
         */
    }
}
