package com.michaeljjf.chapter14.threadtest;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        try {
            socket = new Socket("127.0.0.1", 8888);

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您的账号：");
            String name = scanner.next();
            System.out.println("请输入您的密码：");
            String pwd = scanner.next();
            User user = new User(name, pwd);

            outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            boolean succeed = dataInputStream.readBoolean();
            if (succeed) {
                System.out.println("登录成功！");
            } else {
                System.out.println("登录失败！");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
