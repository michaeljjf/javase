package com.michaeljjf.chapter14;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入发送到服务端的数据：");

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        while (true) {
            String data = scanner.next();
            dataOutputStream.writeUTF(data);

            String serverReturn = dataInputStream.readUTF();
            System.out.println(serverReturn);

            if ("exit".equals(data)) {
                System.out.println("程序退出");
                break;
            }
        }
        dataOutputStream.close();
        dataInputStream.close();
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
