package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {

    private String x;

    public void setX(String st){
        x=st;
    }

    private  Map<String, Integer> findFreq(){
        String[] str = x.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        for(String s: str){
            map.put(s, map.get(s)!=null?map.get(s)+1:1);
        }
        return map;
    }

    public ArrayList<Map.Entry<String, Integer>> getAns(){
        Map<String, Integer> ans = findFreq();
        ArrayList<Map.Entry<String, Integer>> max = new ArrayList<>();
        int bla = 0;
        for(Map.Entry<String, Integer> m : ans.entrySet()){
            if(bla == 0 || m.getValue().compareTo(max.get(0).getValue())==0){
                bla = 1;
                max.add(m);
            }
            else if(m.getValue().compareTo(max.get(0).getValue())>0){
                max.clear();
                max.add(m);
            }
        }
        return max;
    }
}
