package com.zetkno.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class BIOMysqlClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8081);
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            socket.getOutputStream().write(next.getBytes());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
