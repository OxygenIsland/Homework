package com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.printf("请输入数组长度\n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] list = new String[n];
        boolean loop = true;
        System.out.printf("请输入数组元素，回车结束\n");
        System.out.println("e(exit):退出程序");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n请输入第%d个元素",i);
            list[i] = scan.next();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int j = 0; j < list.length; j++) {

            if (map.get(list[j]) != null) {
                Integer num = (Integer) map.get(list[j]);
                num++;
                map.put(list[j], num);
            } else {
                map.put(list[j], 1);
            }
        }
        System.out.println(map);

        for (String i : map.keySet()) {
            if (map.get(i)>n/2){
                System.out.println("\n出现次数超过数组长度一半的元素为："+ i);
            }
        }
    }
}
