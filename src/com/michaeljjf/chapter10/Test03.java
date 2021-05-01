package com.michaeljjf.chapter10;

public class Test03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("nihaojavawodeshijie");
        //增
        sb.append("这是梦想");
        System.out.println(sb);//nihaojavawodeshijie这是梦想
        //删
        sb.delete(3, 6);//删除位置在[3,6)上的字符
        System.out.println(sb);//nihavawodeshijie这是梦想
        sb.deleteCharAt(16);//删除位置在16上的字符
        System.out.println(sb);//nihavawodeshijie是梦想
        //改-->插入
        StringBuilder sb1 = new StringBuilder("$23445980947");
        sb1.insert(3, ",");//在下标为3的位置上插入 ,
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("$2你好吗5980947");
        //改-->替换
        sb2.replace(3, 5, "我好累");//在下标[3,5)位置上插入字符串
        System.out.println(sb2);
        sb.setCharAt(3, '!');
        System.out.println(sb);
        //查
        StringBuilder sb3 = new StringBuilder("asdfa");
        for (int i = 0; i < sb3.length(); i++) {
            System.out.print(sb3.charAt(i) + "\t");
        }
        System.out.println();
        //截取
        String str = sb3.substring(2, 4);//截取[2,4)返回的是一个新的String，对StringBuilder没有影响
        System.out.println(str);
        System.out.println(sb3);
    }
}
