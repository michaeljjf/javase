package com.michaeljjf.chapter14;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * 发送方
 */
public class TestSend {
    public static void main(String[] args) {
        System.out.println("学生上线。。。");
        //1.准备套接字： 指定发送方的端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8888);
            while (true) {
                //2.准备数据包
                Scanner sc = new Scanner(System.in);
                System.out.print("学生：");
                String str = sc.next();
                byte[] bytes = str.getBytes();
                /*
                需要四个参数：
                1.指的是传送数据转为Z字节数组
                2.字节数组的长度
                3.封装接收方的ip
                4.指定接收方的端口号
                 */
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 9999);
                //发送：
                ds.send(dp);
                if (str.equals("byebye")) {
                    System.out.println("学生下线。。");
                    break;
                }
                //接收老师发送回来的信息：
                byte[] b = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(b, b.length);
                ds.receive(dp2);//接收完以后 dp2里面就填充好内容了
                //取出数据：
                byte[] data = dp2.getData();
                String s = new String(data, 0, dp2.getLength());//dp.getLength()数组包中的有效长度
                System.out.println("老师对我说：" + s);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            ds.close();
        }
    }
}
