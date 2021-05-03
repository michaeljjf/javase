package com.michaeljjf.chapter14;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等待客户端发来数据：");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        while (true) {
            String data = dataInputStream.readUTF();
            System.out.println(data);
            if ("exit".equals(data)) {
                System.out.println("程序退出");
                break;
            }
        }
        dataInputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
