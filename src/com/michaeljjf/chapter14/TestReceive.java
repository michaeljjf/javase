package com.michaeljjf.chapter14;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * 接收方
 */
public class TestReceive {
    public static void main(String[] args) {
        System.out.println("老师上线了。。");
        //1.创建套接字：指定接收方的端口
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            while (true) {
                //2.有一个空的数据包，打算用来接收  对方传过来的数据包：
                byte[] b = new byte[1024];
                DatagramPacket dp = new DatagramPacket(b, b.length);
                //3.接收对方的数据包，然后放入我们的dp数据包中填充
                ds.receive(dp);//接收完以后 dp里面就填充好内容了
                //4.取出数据：
                byte[] data = dp.getData();
                String s = new String(data, 0, dp.getLength());//dp.getLength()数组包中的有效长度
                System.out.println("学生对我说：" + s);
                if (s.equals("byebye")) {
                    System.out.println("学生已经下线了，老师也下线。。。");
                    break;
                }
                //老师进行回复：
                Scanner sc = new Scanner(System.in);
                System.out.print("老师：");
                String str = sc.next();
                byte[] bytes = str.getBytes();
                //封装数据，并且指定学生的ip和端口号
                DatagramPacket dp2 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 8888);
                //发送：
                ds.send(dp2);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭资源：
            ds.close();
        }
    }
}
