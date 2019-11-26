package com.zetkno.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOMysqlServer {
    static byte[] bs = new byte[1024];
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            while(true) {
                System.out.println("wait conn");

                //会阻塞 放弃CPU
                Socket clientSocket = serverSocket.accept() ;

                //读取到bs  也会阻塞
                clientSocket.getInputStream().read(bs);

                System.out.println(new String(bs));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
