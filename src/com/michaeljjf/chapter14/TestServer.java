package com.michaeljjf.chapter14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等待客户端发来数据：");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        while (true) {
            String data = dataInputStream.readUTF();
            System.out.println(data);

            dataOutputStream.writeUTF("服务端收到了：" + data);

            if ("exit".equals(data)) {
                System.out.println("程序退出");
                break;
            }
        }
        dataInputStream.close();
        dataOutputStream.close();
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
