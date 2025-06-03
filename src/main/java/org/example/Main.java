package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(13));
        System.out.println(checkForPalindrome("Racecar"));


    }
    public static boolean checkForPalindrome(String text){

        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT);
        LinkedList<Character> charList = new LinkedList<>();

        for(char c : cleanedStr.toCharArray()){
            charList.add(c);
        }

        while (charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int x){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while (x>0){
            int remainder = x % 2;
            binaryList.addFirst(remainder);
            x/=2;
        }
        StringBuilder binaryStr = new StringBuilder();
        for(int digit : binaryList){
            binaryStr.append(digit);
        }
        return binaryStr.toString();
    }

}