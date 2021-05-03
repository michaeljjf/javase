package com.michaeljjf.chapter14;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {

        InetSocketAddress isa = new InetSocketAddress("localhost", 8080);
        System.out.println(isa);

        InetAddress inetAddress = isa.getAddress();
        System.out.println(inetAddress);


    }
}
