package main;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {


        int port;
        InetAddress address;
        DatagramSocket socket = null;
        DatagramPacket packet;
        byte[] sendBuf = new byte[256];

        for (String str : args) {
            System.out.println("The value of first argument is: " + str);
        }
    }
}
