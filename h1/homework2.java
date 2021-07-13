package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(deal(str1).equals(deal(str2)));
    }
    public static String deal (String str){
        StringBuffer sb1 = new StringBuffer();
        for (int i=0; i<str.length(); i++) {

            if(str.charAt(i)!='#'){
                sb1.append(str.charAt(i));
            }
            else{
                if(sb1.length()>0){
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }
        }
        return sb1.toString();
    }
}
