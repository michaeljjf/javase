package com.michaeljjf.chapter11;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(16);
        System.out.println(treeSet.size());
        System.out.println(treeSet);
    }
}
