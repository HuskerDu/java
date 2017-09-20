package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();
	    Frequency f = new Frequency();
	    f.setX(input);
        ArrayList<Map.Entry<String, Integer>> xxx = f.getAns();
        System.out.println(String.format("The following words occurred maximum of %s times:", +xxx.get(0).getValue()));
	    for(Map.Entry m : xxx){
	        System.out.println(m.getKey());
        }
    }
}
