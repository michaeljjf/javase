package com.michaeljjf.chapter14.threadtest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        System.out.println("服务端已启动！");
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8888);
            int count = 0;
            while (true) {
                socket = serverSocket.accept();
                new ServerThread(socket).start();
                count++;
                System.out.println("您是第" + count + "个登录的用户，IP地址：" + socket.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
